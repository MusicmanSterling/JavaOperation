package operator;

import java.util.Scanner;

/*
 * @ Date : 2015.07.07
 * @ Author : me
 * @ Story : ���� �ڵ忡 ���� ����
 */
public class OpCode {
	public static void main(String[] args) {
		/*
		 * ������(opcode)�� ������ ���� �з��ȴ�.
		 * 1. ���� ������ : ++, --, +, -
		 * 2. ���� ������ : 
		 *   (1)��������� +,-,*,/(��),%(������)
		 *   (2)�񱳿�����
		 *      < > !=(���� �ʴ�), ==(����)
		 *   (3)���׿�����
		 *      (...)? TRUE : FALSE
		 *   (4)����(�Ҵ�)������ 
		 *      =  
		 */
		// ctrl + shift + o
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ʱ� ���� �Է��ϼ���");
		int a = scanner.nextInt(); //sanner�� �Է��� ���� a�� �Ҵ��մϴ�
		System.out.println("������ ���� �Է��ϼ���");
		int b = scanner.nextInt();
		System.out.println(a+b);
	}
}
