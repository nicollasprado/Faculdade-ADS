import threading
import socket
import time

alias = input('Escolha seu apelido: ')
client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect(('127.0.0.1', 59000))

def clientReceive():
    while True:
        try:
            message = client.recv(1024).decode('utf-8')
            if(message == "alias?"):
                client.send(alias.encode('utf-8'))
            else:
                print(message)
        except:
            print("Error!")
            client.close()
            break

def clientSend():
    while True:
        msgTime = time.localtime()
        msgTimeFormatted = time.strftime("[%H:%M:%S]", msgTime)
        message = f"{msgTimeFormatted} - {alias}: {input()}"
        client.send(message.encode('utf-8'))

receiveThread = threading.Thread(target=clientReceive)
receiveThread.start()

sendThread = threading.Thread(target=clientSend)
sendThread.start()