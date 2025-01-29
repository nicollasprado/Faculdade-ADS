import socket

servidor = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
# AF_INET é IPV4 ; SOCK_STREAM é TCP ; SOCK_DGRAM é UDP
servidor.bind(('', 12000))
# tupla de HOST e PORTA

while True:
    msg_bytes, endereco_ip_cliente = servidor.recvfrom(2048)
    # 2048 é o tamanho dos dados recebidos
    # A mensagem recebida é uma tupla (mensagem em bytes, endereço do cliente)
    msg_resposta = msg_bytes.decode().upper()
    servidor.sendto(msg_resposta.encode(), endereco_ip_cliente)
    print("Nome: ", msg_resposta, endereco_ip_cliente)