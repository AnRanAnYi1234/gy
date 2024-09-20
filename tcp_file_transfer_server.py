""" 
    将一个文件从客户端发送到服务端保存
    文件可能是文本类型也可能是二进制文件
    服务器端

"""
import socket 

sockfd = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
sockfd.bind(("127.0.0.1",7777))
sockfd.listen(7)

connfd,addr = sockfd.accept()
fd = open("flower.jpg","wb")
while True:
    data = connfd.recv(1024)
    if not data:
        break
    fd.write(data)

fd.close()
connfd.close()
sockfd.close()

