package com.javaex.ex01;

public class Ex07 {
	
	public static void main(String[] arge) {
		//대입연산자
		int a =7;
		int b =2;
		
        System.out.println("산술연산자");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        
        System.out.println(a / b); //3.5 몫3 나머지1 -->몫을 표시
        System.out.println(a % b); //3.5 몫3 나머지1 -->나머지를 표시
        
        //산술연산자 / % 자세히
        System.out.println("산술연산자 자세히");
        System.out.println(7.0/2.0); //3.5
        System.out.println(7.0%2.0); //1.0
        
        //부호연산자
        System.out.println("부호연산자");
        int var = -3;
        int pVar = +var;
        int mVar = -var;
        
        System.out.println(pVar); // +(-3)
        System.out.println(mVar); // -(-3)
	
        //증감연산자
        System.out.println("증감연산자");
        System.out.println(a);//7
        System.out.println(++a);//(1)a를 1올린다 7->8 (2)a를 출력한다 8
        System.out.println(a);//8
        
        System.out.println(b);//2
        System.out.println(--b);//(1)a를 1내린다 (2)b를 출력한다
        System.out.println(b);//1
        
        System.out.println(a); //현재값8
        System.out.println(a++);// (1)a를 출력--8. (2)a를 1올린다-->9
        System.out.println(a);//9
        
        System.out.println(b);//1
        System.out.println(b--);//(1)b출력 (2)b를1내림
        System.out.println(b); //0
        
        /*
        5==3 //5하고 3하고 같니? false
        5!=3 //5하고 3하고 같지 않니?-->5하고3하고 다르니? true        		
        		n1==n2
        		
        		*/
	}

}
