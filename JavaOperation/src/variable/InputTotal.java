package variable;

import java.util.Scanner;

public class InputTotal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������� �Է��ϼ���");
		int kor = sc.nextInt();
		System.out.println("���������� �Է��ϼ���");
		int eng = sc.nextInt();
		System.out.println("���������� �Է��ϼ���");
		int math = sc.nextInt();
		
		int total = kor + eng + math; //total ���������� ��������� �ʱ�ȭ ��
		int avg = total/3;
		System.out.println("���� :"+total);
		System.out.println("���"+avg);
	}
}
