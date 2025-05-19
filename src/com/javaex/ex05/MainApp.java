package com.javaex.ex05;

public class MainApp {

	public static void main(String[] args) {
		
		//Runnable 만들고
		Runnable dt = new DigitThread(); //run 로직(숫자 출력) 로직
		
		//숫자 출장
		//Thread t = new Thread(new DigitThread());
		Thread t = new Thread(dt); //생성자 파라미터로 Runnable 넣을 수 있다
		t.start();
		
		//대문자 메인
		for(char ch='A'; ch<'Z'; ch++) {
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
