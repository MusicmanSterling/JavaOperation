package datatype;
/*
 * @ Date : 2015.07.07
 * @ Author : me
 * @ Story :  String 타입 문법
 */
public class StringDemo {
	public static void main(String[] args) {
		char c = 'c'; 
		//맨 끝에 있는 ;을 구분자라고 한다.
		//char 데이터 타입의 c 변수에 알파벳 c값을 할당함
		//char는 한 글자 밖에 출력 못함
		System.out.println(c);
		String s = "abc"; // 다중의 알파벳을 출력 할 떄 사용
		System.out.println(s);
		System.out.println("abc");
		// 앞파벳 하나만 출력할 경우는 char 타입을 사용하고, 하나 이상 복수의 문자열을 출력할 때는 String 타입을 사용한다.
		// 주의할 점은 싱글쿼터와 더블쿼터에 유의
	}

}
