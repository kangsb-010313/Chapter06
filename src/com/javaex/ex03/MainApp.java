package com.javaex.ex03;

public class MainApp {

	public static void main(String[] args) {
		
		
		//스레드 생성
		
		//숫자 출장보내서 일 시키기
		Thread t01 = new DigitThread();
		t01.start();
		
		//소문자 "
		Thread t02 = new LowerThread();
		t02.start();
		
		//대문자 "
		Thread t03 = new UpperThread();
		t03.start();
		
		
		
		
	}

}
