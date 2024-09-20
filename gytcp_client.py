""" 
tcp客户端
 """
from socket import *
sockfd = socket()
server_addr = ('127.0.0.1',7777)
sockfd.connect(server_addr)
while True:
    data = input('Mag>>')
    if not data:
        break
    sockfd.send(data.encode())
    data = sockfd.recv(1024)
    print('Server',data.decode())

sockfd.close()