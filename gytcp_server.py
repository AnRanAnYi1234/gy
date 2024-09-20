""" 
tcp套接字服务端流程
 """
import socket
sockfd = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
sockfd.bind(("0.0.0.0",7777))
sockfd.listen(7)

while True:
    print("Waiting for connect...")
    try:
        connfd, addr = sockfd.accept()
        print("Connect from", addr)  # 打印链接的客户端地址
    except KeyboardInterrupt:
        print("Server exit")
        break
    except Exception as e:
        print(e)
        continue
    while True:
        data = connfd.recv(1024)
        if not data:
            break
        print("收到",data.decode())
        n = connfd.send(b'Thanks')
        print(f"发送{n}字节")
    connfd.close()

sockfd.close()
