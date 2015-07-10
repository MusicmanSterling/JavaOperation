package condition;
/*
 * @ Date : 2015.07.10
 * @ Author : me
 * @ Story : switch 예제(합격여부 구하기)
 */
import java.util.Scanner;

public class SwitchAvg {
	public void calc() {
		int kor=0, eng=0, math =0, sum=0, avg=0;
		String student="", msg="";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("학생 이름:");
		student = scanner.next();
		System.out.println("국어:");
		kor = scanner.nextInt();
		System.out.println("영어:");
		eng = scanner.nextInt();
		System.out.println("수학:");
		math = scanner.nextInt();
		sum = kor + eng + math;
		avg = sum/3;		 
		
		switch (avg/10) {
		case 10:case 9:msg = "장학생"; break;
		case 8:case 7:msg = "합격"; break;
		default:msg = "불합격";break;
		}
		
		System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
		System.out.println("------------------------------------------------------");	
		System.out.println(student+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg+"\t"+msg);	
	}
}
