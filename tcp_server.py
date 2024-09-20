""" 
    tcp_server.py
重点代码
tcp套接字服务端流程
注意:
功能性代码,注重流程和函数使用

"""
import socket

sockfd = socket(socket.AF_INET,socket.SOCK_STREAM) # 创建tcp套接字

sockfd.bind(("0.0.0.0",8888)) # 绑定地址 绑定本机网络地址 参数:二元元组(ip,port)('0.0.0.0.0',8888)

sockfd.listen(5) #设置监听

while True:
    #阻塞等待处理连接
    print("Waiting for connect...")
    try:
        connfd,addr = sockfd.accept() #返回值:connfd 客户端连接套接字,addr 连接的客户端地址
        print("Connect from",addr)#打印链接的客户端地址
    except KeyboardInterrupt:
        print("服务器退出")
        break
    except Exception as e:
        print(e)
        continue

    while True:
    #收发消息 功能:接收客户端消息 参数:每次最多接收消息的大小
        data = connfd.recv(1024)
        if not data:
            break
        print("收到客户端消息:",data.decode())
        n = connfd.send(b'Thanks') #参数:要发送的内容 bytes格式 返回值:发送的字节数
        print("服务器发送的字节数",n)

    connfd.close()
# 关闭套接字
sockfd.close()



