package echo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

//뉴욕
public class Client {

	public static void main(String[] args) throws IOException{
		
		//소켓생성 종이컵전화기
		Socket socket = new Socket();
		
		System.out.println("<클라이언트 시작>");
		System.out.println("==============================================");
		
		//서버에 연결 요청
		//ip 192.168.0.27  	port 10001
		System.out.println("[서버에 연결을 요청합니다.]");
		socket.connect(new InetSocketAddress("192.168.0.27", 10001));
		
		
		
	}

}
