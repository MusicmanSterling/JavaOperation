package condition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.10
 * @ Author : me
 * @ Story : switch 예제(성병 판별)
 */
public class ManOrWoman {
	public void ssn() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("주민번호를 입력하세요(예930304-2123456)");
		String ssn = scanner.next();
		String msg="";
		/*
		 * charAt(n) 이 메소드는 0부터 시작하여 n번째 글자 하나만 출력하는데 출력결과를 프로그래밍에서는 리턴값이라고 한다.
		 * 위 예 같은 상황에서는 리턴값이 2가 된다.
		 */
		char ch = ssn.charAt(7);
		/*
		 * ssn의 체계
		 * 1,3번 남자
		 * 2,4번 여자
		 * 5번 외국인
		 * 잘못입력한 값
		 */
		switch (ch) {
		case '1':case '3':msg="남자";	break;
		case '2':case '4':msg="여자";	break;
		case '5':msg="외국인";	break;
		default:msg="잘못 입력한 값"; break;
		}
		System.out.println("입력하신 주민번호는 "+msg+" 입니다");
	}
}
