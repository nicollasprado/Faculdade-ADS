import socket

client = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

while True:
    msg_envio = input("digite a mensagem: ")
    client.sendto(msg_envio.encode(), ("192.168.1.76", 12000))
    msg_bytes, endereco_ip_servidor = client.recvfrom(2048)
    print("Nicollas: ", msg_bytes.decode())