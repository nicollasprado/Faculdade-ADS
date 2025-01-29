import socket
import psutil

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.bind(("localhost", 6000))
s.listen(5) # Define a quantidade máxima de conexões

while(True):
    clientSocket, clientAddress = s.accept()
    print(f"Connection stablished with {clientAddress[0]}:{clientAddress[1]}")
    msg = clientSocket.recv(1024)
    msgDecoded = msg.decode("utf-8")
    if(msgDecoded == "!help"):
        clientSocket.send(bytes("Comandos disponíveis:\n!off = desliga o servidor\n!diskUsage = mostra o uso do disco", "utf-8"))
    if(msgDecoded == "!off"):
        s.close()
    elif(msgDecoded == "!diskUsage"):
        usage = psutil.disk_usage("c:\\")
        clientSocket.send(bytes(str(usage), "utf-8"))