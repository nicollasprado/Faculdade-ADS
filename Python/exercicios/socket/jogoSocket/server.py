import pygame, socket, threading, playerC

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind(('', 59000))
server.listen()
clients = []


screen = pygame.display.set_mode((1280,720))
clock = pygame.time.Clock()
pygame.init()
players = pygame.sprite.Group()

player = playerC.Player()
players.add([player])

def playerConnect(clients):
    for client in clients:
        playerNovo = playerC.Player()
        players.add(playerNovo)

def handleClient(client):
    while True:
        try:
            playerConnect(clients)
        except:
            clients.remove(client)
            client.close()
            break

def receiveConnections():
    while True:
        print("Servidor Ligado!")
        client, adress = server.accept()
        clients.append(client)
        thread = threading.Thread(target= handleClient, args=(client,))
        thread.start()

running = True
while running:
    clock.tick(60)
    screen.fill((0,0,0))
    
    for event in pygame.event.get():
        if(event.type == pygame.QUIT):
            running = False

    players.draw(screen)
    players.update()

    if(pygame.key.get_pressed()):
        player.walk()

    screenData = screen.blit(screen, (0,0))
    screenDataStr = pygame.image.tostring(screenData, "RGB").encode("utf-8")
    for client in clients:
        client.send(screenDataStr)

    pygame.display.flip()

pygame.quit()