// package
package a.b.c.ch3;

// import


public class ExCast_3 
{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		int i = 10;
		byte b = (byte)i; // ����� ����ȯ : explicit casting

		System.out.println(i);
		System.out.println(Integer.toBinaryString(i));
		System.out.println(b);
		System.out.println(Integer.toBinaryString(b));

		int i1 = 1000;
		byte b1 = (byte)i1;
		System.out.println(i1);
		System.out.println(Integer.toBinaryString(i1));
		System.out.println("Byte �ִ밪 >>> : " + Byte.MAX_VALUE);
		System.out.println("Byte �ּҰ� >>> : " + Byte.MIN_VALUE);
		System.out.println(b1);
		System.out.println(Integer.toBinaryString(b1));

		double d = 3.14;
		int i2 = (int)d;
		System.out.println(d);
		System.out.println(i2);

	}
}
