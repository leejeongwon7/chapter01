package com.javaex.ex03;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.println("숫자: ");
		
		int num = sc.nextInt();
		
		if (num%2==0){
			System.out.println("짝수");
		}else if(num%2!=0) {
			System.out.println("홀수");
		}else if(num<0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
				
		
		
		sc.close();
	}

}
