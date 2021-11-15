package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름:");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		int old = sc.nextInt();
		
		System.out.println("키를 입력해주세요");
		System.out.print("키:");
		float cm = sc.nextFloat();
		//double height =sc.nextDouble(); 선생님 작성코드
		
		System.out.println("당신의 이름은 "+name+" 나이는 "+old+" 키는 "+cm+" 입니다");
		
		sc.close();
	}

}
