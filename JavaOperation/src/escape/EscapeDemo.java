package escape;

import java.util.Scanner;

/*
 * @ Date : 2015.07.07
 * @ Author : me
 * @ Story : 
 */
public class EscapeDemo {
	public static void main(String[] args) {
		/*
		 * ����. ȫ�浿���� 30���̰� �����ž��� 25�� �Դϴ�. ȫ�浿���� �����ž��� ���� ���̸� ����ϴµ�...
		 * "ȫ�浿���� �����ž����� 5���� �����ϴ�."
		 */
		//�������� �����
		int hongAge=0, kimAge=0,age=0;
		String hong ="", kim="";//���ͷ� ����Ʈ ��
		Scanner scanner = new Scanner(System.in);
		//�����
		System.out.println("�̸� �Է�:");
		hong = scanner.next();
		System.out.println("�̸� �Է�:");
		kim = scanner.next();
		System.out.println("ȫ�浿�� ���� �Է�:");
		hongAge = scanner.nextInt();
		System.out.println("�����ž� ���� �Է�:");
		kimAge = scanner.nextInt();
		age = hongAge - kimAge;
		System.out.println(hong+"����\t " +kim+"������\t "+age+"����\n �����ϴ�.");
		/*
		 * escape���� (\t, \n)ó�� ���ĺ��� \�� ÷���Ͽ� Ư���� ����� ��Ÿ������ �ϴ� ����.
		 */
		
	}
}
