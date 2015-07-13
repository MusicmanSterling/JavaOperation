package array;
/*
 * @ Date : 2015.07.13
 * @ Author : me
 * @ Story : 문자열형(String) 배열 예제
 */
public class StringArratDemo {
	public static void main(String[] args) {
		
	/*
	 *자바에서 배열문법
	 *1.무조건 같은 Type
	 *2. 배열은 크기가 있어야 함
	 *3. 배열 크기는 객체.length
	 *4. 배열은 new로 생성하고, 메모리영역 heap에 할당
	 *5. 배열 출력은 for문으로 한다. 
	 */
	String[] strArr = new String[3];
	strArr[0] = "1"; //리터럴 타입 1을 첫 번째에 할당
	strArr[1] = "2";
	strArr[2] = "3";
	for (int i = 0; i < strArr.length; i++) {
		//System.out.print(i+"\t"); //i 인덱스 값이 출력
		System.out.print(strArr[i]+"\t");
	}
	}
}
