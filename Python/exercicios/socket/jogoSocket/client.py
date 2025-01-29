import socket, pygame, threading

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect('', 59000)
clientScreen = pygame.display.set_mode((1280, 720))
bg = pygame.Surface((1280, 720))
pygame.init()


running = True
while running:
    screen = client.recv(230400).decode("utf-8")
    screenConverted = pygame.image.fromstring(screen, (1280, 720), 'RGB')
    clientScreen.blit(screenConverted)
    pygame.display.flip()

    for event in pygame.event.get():
        if(event.type == pygame.QUIT):
            running = False

pygame.quit()
    
    