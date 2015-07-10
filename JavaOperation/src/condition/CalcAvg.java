package condition;

import java.util.Scanner;

public class CalcAvg {
	public void calcAvg(){
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
		if (avg>=90) {
			msg="장학생";
		} 
		else if ((avg>=70) && (avg<90)) {
			msg="합격";
		}else {
			msg="불합격";
		}
		System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
		System.out.println("------------------------------------------------------");	
		System.out.println(student+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg+"\t"+msg);	
	}
}
