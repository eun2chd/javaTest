package ch04;

import java.util.Scanner;
 

 // main 시작 
public class IfMainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("성적을 입력해주세요");
		
		Scanner scanner = new Scanner(System.in);
		int point = scanner.nextInt();
		
		// 문제 1. if 문을 사용해서 학점을 출력해주세요
		// 마지막 결과값은 "당신의 학점은 + result 입니다.
		
		char result = 'Z';
		
		if(point <= 100 && point >= 90) {
			result = 'A';
		}
		else if(point < 90 && point >= 80) {
			result ='B';
		}
		else if(point < 80 && point >=70) {
			result = 'C';
			
		}
		else if(point < 70 && point >= 60) {
			result = 'D';
		}
		else if(point < 60 && point >= 0) {
			result ='F';
		}
		
		if(result != 'Z') {
			System.out.println("당신의 학점은 : " + result + "입니다.");
		}
		else {
			System.out.println("입력을 잘못 하였습니다.");
		}
		
	
  
	} // end of main
	
} // end of class
