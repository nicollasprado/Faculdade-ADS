import socket

sckt = socket.socket()
port = 56789
sckt.connect(('127.0.0.1', port))
print(sckt.recv(1024))
sckt.close()