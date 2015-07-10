package condition;

import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		/*
		 * 문제) 학생 세 명의 점수를 입력받아서 1등 출력(점수는 0~100점)
		 * 
		 * 결과) 1등은 홍길동이며 98점 입니다..
		 * 힌트) a와 b 비교, b와 c를 비교, a와 c를 비교
		 */
		int a=0, b=0, c=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("홍길동 점수 :");
		a = scanner.nextInt();
		System.out.println("스티브 잡스 점수 :");
		b = scanner.nextInt();
		System.out.println("마크 주커버그 :");
		c = scanner.nextInt();
		if(a>100 || b>100 || c>100 ){System.out.println("점수를 잘 못 입력하셨습니다.");}		
		/*
		 * 조건식을 따져서 결과를 가정하지 말고, 결과를 상정한 다음 거기에 맞는 조건식을 설정하세요.		
		 */
		if (a>b && a>c) {
			System.out.println("1등은 홍길동 이며"+a+"점 입니다");
		} else if(b>a && b>c) {
			System.out.println("1등은 스티브 잡스 이며"+b+"점 입니다");
		} else if(c>a && c>b){
			System.out.println("1등은 마크 주커버그 이며"+"/t"+c+"점 입니다");
	    } else if (a==b && b==c && c==a){
			System.out.println("모두 같은 점수 입니다");
		}
	}
}