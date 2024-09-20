""" 
     将一个文件从客户端发送到服务端保存
    文件可能是文本类型也可能是二进制文件
    客户端
"""
import socket

sockfd = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
sockfd.connect(("127.0.0.1",7777))

fd = open("hua.jpg","rb")
while True:
    data = fd.read(1024)
    if not data:
        break
    sockfd.send(data)

fd.close()
sockfd.close()
