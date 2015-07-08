package variable;

import java.util.Scanner;

public class InputTotal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요");
		int kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요");
		int eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요");
		int math = sc.nextInt();
		
		int total = kor + eng + math; //total 지역변수를 연산식으로 초기화 함
		int avg = total/3;
		System.out.println("총점 :"+total);
		System.out.println("평균"+avg);
	}
}
