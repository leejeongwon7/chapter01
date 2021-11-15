package com.javaex.ex02;

public class Ex01 {
	
	public static void main(String[] args) {
		
		//println() print() 차이점
		System.out.print("안녕");
		System.out.println("하세요");
		System.out.println("안녕하세요");
		System.out.println("===========================");
		
		//println() 사용법
		int i =2345;
		double d = 3.14;
		String str = "굿모닝";
		char c = '한';
		String s = "한";
		String name ="황일영";
				
		System.out.println("안녕하세요"); //안녕하세요
		System.out.println(str); //굿모닝
		System.out.println(i); //2345
		System.out.println(d); //3.14
		
		System.out.println(str+str); //굿모닝굿모닝
		System.out.println(str+i); //굿모닝2345
		System.out.println(str+d);//굿모닝 3.14
		System.out.println(str+c);//굿모닝한
		//굿모닝 이랑 2345
		
		System.out.println(str+" 이랑 "+i);
		System.out.println("굿모닝 이랑 2345"); //질문
		
		System.out.println(i+i);// 4690(계산가능한 선이면 해줌)
		System.out.println(i+d);// 2348.14 자동형변환
		System.out.println(i-i);
		System.out.println(i*i);
		
		System.out.println(c);
		System.out.println(c+c); // 왜 코드로 나오는지(숫자)
		System.out.println(c+s); // 한
		
		System.out.println("제이름은 "+name+" 입니다.");//제이름은 황일영 입니다.
		System.out.println("안녕'하'세요");
		System.out.println("안녕\"하\"세요"); //안녕"하"세요
		System.out.println("안녕\\하\\세요");//안녕\하\세요
		System.out.println("안녕\t하세요");//안녕   하세요
		System.out.println("안녕\n하세요");// 줄바꿈
		System.out.println("안녕\\\\하\\\\세요");

	
		
		
	}

}
