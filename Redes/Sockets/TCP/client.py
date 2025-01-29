import socket

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.connect(("localhost", 6000))

while(True):
    sendMsg = input()
    s.send(sendMsg.encode("utf-8"))
    msg = s.recv(1024)
    print(msg.decode("utf-8"))

print("Mensagem: ", full_msg)   