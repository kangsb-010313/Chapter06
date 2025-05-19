package com.javaex.ex06;

public class MainApp {

	public static void main(String[] args) {

		//출장 --> 숫자 출력
		Runnable dt = new DigitImpl();
		Thread t01 = new Thread(dt);
		t01.start();
		
		//출장 --> 대문자 출력
		Runnable ut = new UpperImpl();
		Thread t02 = new Thread(ut);
		t02.start();
		
		//출장 --> 소문자 출력
		Runnable lt = new LowerImpl();
		Thread t03 = new Thread(lt);
		t03.start();
		


		
		
		
	}

}
