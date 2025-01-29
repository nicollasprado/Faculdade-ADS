import socket

sckt = socket.socket()
port = 56789
sckt.bind(('', port))
print(f"Connected to port {port}")

sckt.listen(5)
# O servidor vai receber no máximo 5 conexões
print('socket is listening')

while True:
    conn, adress = sckt.accept()
    print('Got connection from', adress)
    message = ('Thank you for connecting')
    conn.send(message.encode())
    conn.close()