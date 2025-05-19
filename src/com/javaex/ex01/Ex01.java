package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		//싱글 스레드
		
		//숫자 출력
		for(int i=0; i<5; i++) {
			System.out.println(i);
			
			//1초 대기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//문자 출력
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
	}

}
