package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//천호
public class Server {

	public static void main(String[] args) throws IOException{
		
		//서버 소켓 생성
		ServerSocket serverSocket = new ServerSocket(); //서버에 프로그램 올리기
		
		
		//bind(바인드) 	//ip 192.168.0.27  	port 10001(port 주소는 정한 것)
		//mac --> 집 wifi 연결 시 IP주소 172.30.1.98
		//mac --> 핫스팟 연결 시 IP주소 192.0.0.2
		
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
		
		
		//읽기 스트림 준비
		//InputStream in = new FileInputStream("C:\\javaStudy\\MS949-copy.txt");
		InputStream in = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		//쓰기 스트림 준비
		OutputStream out = socket.getOutputStream(); //주 스트림
		OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		//---------------------------------------------------
		while(true) {
			//메세지를 받기
			String msg = br.readLine();
			
			if(msg == null) {
				break;
			}
			
			System.out.println("받은메세지: " + msg);
			
			//메세지를 보내기
			bw.write(msg);
			bw.newLine();
			bw.flush();
			//---------------------------------------------------
		}
		
		System.out.println("==============================================");
		System.out.println("<서버 종료>");
				
		//자원 정리
		bw.close();
		br.close();
		socket.close();
		serverSocket.close();
		
		
	}

}
