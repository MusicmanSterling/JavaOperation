package cast;
/*
 * @ Date : 2015.07.07
 * @ Author : me
 * @ Story : �ٿ�ĳ���� ����
 */
public class DownCasting {
	public static void main(String[] args) {
		/*
		 Down-Casting(�ٿ� ĳ����)
		 - ���� �� ��ȯ
		 - ���α׷����� ������ Ÿ���� ū ����(64bit)�� ������ Ÿ���� ���� ����(32bit)�� �Ҵ��Ϸ� �� �� �����(int)���� Ÿ���� �����ϴ� ��
		 - �ٸ�, �������� �ս��� �߻���
		 - �����ڴ� ���� �ٿ�ĳ������ �Ϸ��� ���� ���� ��Ŭ������ ���� �ڵ����� add cast �Ѵ�.
		 */
		int a = 7;//����
		double b = 3.14D;//�Ǽ�
		a=(int) b;//64bit ������ Ÿ�Կ� 32bit������ Ÿ���� ��� ��� �̸� ��ĳ�����̶�� �Ѵ�
		System.out.println("�ٿ�ĳ���� ���:"+a);
	}
}
