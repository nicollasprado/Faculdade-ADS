import socket

HOST = "localhost"
PORT = 6000
sckt = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
dest = (HOST, PORT)
sckt.bind(dest)

while(True):
    msg = input()
    sckt.sendto(msg.encode("utf-8"), dest)
sckt.close()