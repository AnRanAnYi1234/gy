""" 
client程序
"""

import socket
# 创建tcp套接字
sockfd = socket.socket(socket.AF_INET,socket.SOCK_STREAM) # 使用默认参数

#连接服务器
server_addr = ("127.0.0.1",8888) # 服务器地址
sockfd.connect(server_addr)
# sockfd.connect(("127.0.0.1",8888))

while True:
    # 向服务器发送消息
    data = input("Msg>>")
    if not data:
        break
    sockfd.send(data.encode()) # 转换为字节串后在发送到服务器
    data = sockfd.recv(1024)
    print("Server:",data.decode()) # 打印从服务器接收的内容，从字节串转换为字符串

sockfd.close() # 关闭套接字
