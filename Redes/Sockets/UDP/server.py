import socket

HOST = "localhost"
PORT = 6000
sckt = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
orig = (HOST, PORT)
sckt.bind(orig)

while(True):
    msg, client = sckt.recvfrom(1024)
    print(client, msg.decode("utf-8"))
sckt.close()