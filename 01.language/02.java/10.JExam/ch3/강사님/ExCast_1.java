// package
package a.b.c.ch3;

// import


public class ExCast_1 
{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		// �ڹٿ����� = ���Կ����ڸ� �߽����� �� ���� ������ Ÿ���� ���� �ؾ� �Ѵ�.
		// ��, ���� ������ Ÿ���� ���� ������ ĳ���� ������ () �� ����ؼ� ������ Ÿ���� �����ϰ� �ؾ� �Ѵ�.

		// ������ ����ȯ : implicit casting
		byte b = 10;
		// int i = (int)b;
		int i = b; // �������� ����ȯ�� �ȴ�. 

		System.out.println(b);		
		System.out.println(i);

		int i1 = 20;
		// float f = (float)i1;
		float f = i1;

		System.out.println(i1);		
		System.out.println(f);

		double d;
		d = i + f;
		System.out.println(d);

	}
}
