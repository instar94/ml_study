// package
package a.b.c.ch3;

// import

// ������ �������� �� ��������� �����ؾ� �ϴ� ������
// �� ������ ��� ��ȿ ������ ��Ȯ�ϰ� �˾ƾ� �Ѵ�. 

public class ExOper_1 
{
	// ��� 
	// �������
	int num;
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		int num = 10;

		// ������ Ÿ�� int ���� num ���������� ȣ���ؼ� �ֿܼ� ����Ͻÿ�

		// ��ȣ ������
		System.out.println(num);
		System.out.println(+num);
		System.out.println(-num);
		System.out.println(num);

		num = -num;
		System.out.println(num);

		// ��� ������ 
		System.out.println( 5 - 3 );
		System.out.println( 3 - 5 );	
		System.out.println( 5 / 3 );
		System.out.println( 3 / 5 );	
		System.out.println( 5 % 3 );
		System.out.println( 3 % 5 );	


		// ����, ���� ������ 
		// ++ : int i = i + 1;
		// -- : int i = i - 1;

		int gameScore = 150;
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);

		int lastScore2 = --gameScore;
		System.out.println(lastScore2);

		
		int gameScore1 = 150;
		
		int lastScore11 = gameScore1++;
		System.out.println(lastScore11);

		int lastScore22 = gameScore1--;
		System.out.println(lastScore22);

	}
}
