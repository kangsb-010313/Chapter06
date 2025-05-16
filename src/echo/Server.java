package echo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//천호
public class Server {

	public static void main(String[] args) throws IOException{
		
		//서버 소켓 생성
		ServerSocket serverSocket = new ServerSocket(); //서버에 프로그램 올리기
		
		
		//bind(바인드) 	//ip 192.168.0.27  	port 10001(port 주소는 정한 것)
		
		/* 굳이 2줄 표현 할 필요가 없음
		InetSocketAddress ipport = new InetSocketAddress("192.168.0.27", 10001);
		serverSocket.bind(ipport);
		*/
		
		//한 줄 표현
		serverSocket.bind(new InetSocketAddress("192.168.0.27", 10001));
		
		//서버 시작
		System.out.println("<서버 시작>");
		System.out.println("==============================================");
		System.out.println("[연결을 기다리고 있습니다.]");
		
		
		
		//클라이언트가 연결되면 accept() 실행이 된다
		//socket 종이컵전화기
		Socket socket = serverSocket.accept(); //연결
		System.out.println("[클라이언트가 연결되었습니다.]");
		
		
		//코드 작성
		
		
		
		
		
		System.out.println("==============================================");
		System.out.println("<서버 종료>");
				
		//자원 정리
		socket.close();
		serverSocket.close();
		
		
	}

}
