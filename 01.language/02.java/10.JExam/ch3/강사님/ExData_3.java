package a.b.c.ch3;

/*
	ExData_3 Ŭ������ 
	public void primeVal() �Լ��� ���� 
	main �Լ����� primeVal() ȣ���ؼ� ���� ��Ű�ÿ� 

	primeVal() �Լ��� ����Ǹ� 
	�����ڷ��� byte char short int long float double �� 
	�ִ밪, �ּҰ��� �ֿܼ� ����Ͻÿ�
	
*/
public class ExData_3 {
	
	// ���
	// �������
	// ������
	
	// �Լ�
	public void primeVal() {
		System.out.println("ExData_3.primeVal() �Լ� ���� >>> : \n");
		
		// byte : Byte : �ִ밪, �ּҰ�
		System.out.println("Byte : �ִ밪 >>> : " + Byte.MAX_VALUE);
		System.out.println("Byte : �ּҰ� >>> : " + Byte.MIN_VALUE);

		// char : Character : �ִ밪, �ּҰ�
		System.out.println("Character : �ִ밪 >>> : " + Character.MAX_VALUE);
		System.out.println("Character : �ּҰ� >>> : " + Character.MIN_VALUE);

		// short : Short : �ִ밪, �ּҰ�
		System.out.println("Short : �ִ밪 >>> : " + Short.MAX_VALUE);
		System.out.println("Short : �ּҰ� >>> : " + Short.MIN_VALUE);

		// int : Integer : �ִ밪, �ּҰ�
		System.out.println("Integer : �ִ밪 >>> : " + Integer.MAX_VALUE);
		System.out.println("Integer : �ּҰ� >>> : " + Integer.MIN_VALUE);

		// long : Long : �ִ밪, �ּҰ�
		System.out.println("Long : �ִ밪 >>> : " + Long.MAX_VALUE);
		System.out.println("Long : �ּҰ� >>> : " + Long.MIN_VALUE);

		// float : Float : �ִ밪, �ּҰ�
		System.out.println("Float : �ִ밪 >>> : " + Float.MAX_VALUE);
		System.out.println("Float : �ּҰ� >>> : " + Float.MIN_VALUE);

		// double : Double  : �ִ밪, �ּҰ�
		System.out.println("Double : �ִ밪 >>> : " + Double.MAX_VALUE);
		System.out.println("Double : �ּҰ� >>> : " + Double.MIN_VALUE);

		System.out.println("\nExData_3.primeVal() �Լ� �� >>> : ");
	} // end of primeVal() �Լ� 

	// main() �Լ� 
	public static void main(String[] args) {
		System.out.println("ExData_3 main() �Լ� ���� >>> : \n");

		ExData_3 ed3 = new ExData_3();
		ed3.primeVal();

		System.out.println("\nExData_3 main() �Լ� �� >>> : ");
	} // end of main �Լ� 
} // end of ExData_1 Ŭ���� 