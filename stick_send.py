""" 
    粘包演示,发送端
"""

from socket import *
from time import *
sockfd = socket()
server_addr = ("127.0.0.1",8888)
sockfd.connect(server_addr)

while True:
    sleep(0.3)
    sockfd.send(b"Msg")