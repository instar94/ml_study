// package
package a.b.c.ch3;

// import

/*
�̱�������ȯǥ�غ�ȣ(American Standard Code for Information Interchange)
ASCII(�ƽ�Ű)�� ���� ���ĺ��� ����ϴ� ��ǥ���� ���� ���ڵ��̴�
������(��, �ҹ���), ����, Ư����ȣ

ASCII : 1BYTE : ������(��, �ҹ���), ����, Ư����ȣ : 2����, 8����, 10����, 16���� ǥ���Ѵ�.
	�츮�� 16������ ����Ѵ� : ������ ǥ���� 16���� �̴�. 
UNICODE : 2BYTE : �ڵ� ü��
	UTF-8, UTF-16, UTF-32
*/

// �ڹٿ����� 
// ���ڴ� char �����ڷ����� ����Ѵ�.
// ���ڿ�  String Ŭ������ ����Ѵ�. ������ �迭�̴�. 
	
public class ExCast_4 
{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		// �ڹٿ��� ���ڿ��� String Ŭ������ ����Ѵ�.
		
		// String : ��Ʈ�� Ŭ���� 
		// str : �������� : �Լ� �ȿ��� ���� �߱� ������ �������� �̴�. 
		// str ���������� ���ڿ� abc �� �ʱ�ȭ �Ѵ�.
		String str = "abc";
		System.out.println("str >>> : " + str);

		// charAt() �Լ��� ���ڿ��� ���ڷ� �ϳ��� �ɰ��� ���� �� �ִ� �Լ� 
		// ���ڸ� �ϳ��� �ɰ��� ���� index ��� �θ���. 
		char c0 = str.charAt(0);
		System.out.println("char c0 >>> : " + c0);
		
		// ���ڵ� : incoding 
		// ����� ����ȯ, explicit casting
		System.out.println("(int)c0 >>> : " + (int)c0);
		
		int i0 = c0; // �ڵ� ����ȯ, ������ ����ȯ, implicit casting
		System.out.println("int i0 >>> : " + i0);
		
		// ���ڵ� : decoding
		System.out.println("(char)i0 >>> : " + (char)i0);
		
		// decoding : ����� ����ȯ : explicit casting
		char c00 = (char)i0;
		System.out.println("char c00 >>> : " + c00);

		char c1 = str.charAt(1);
		System.out.println("char c1 >>> : " + c1);
		System.out.println("(int)c1 >>> : " + (int)c1);
		int i1 = c1;
		System.out.println("int i1 >>> : " + i1);
		System.out.println("(char)i1 >>> : " + (char)i1);
		char c11 = (char)i1;
		System.out.println("char c11 >>> : " + c11);

		char c2 = str.charAt(2);
		System.out.println("char c2 >>> : " + c2);
		System.out.println("(int)c2 >>> : " + (int)c2);
		int i2 = c2;
		System.out.println("int i2 >>> : " + i2);
		System.out.println("(char)i2 >>> : " + (char)i2);
		char c22 = (char)i2;
		System.out.println("char c22 >>> : " + c22);
	}
}
