//package
package a.b.c.ch3;
//import

public class  Test_1{

	//���
	//�������
	//������

	//�Լ�
	
	//public : ��� ��Ű�������� ��밡��
	//int : ��������
	//a() : ��������� �Լ� �̸�
	//�Ϲ��Լ�-> main�Լ����� �������� ���� �ʿ�
	public int a(){
		System.out.println("\nTest_1.a() �Լ� ���� >>>>>>>\n");

		System.out.println("\nTest_1.a() �Լ� �� >>>>>>>\n");

		//return Ű����� �Լ� ���� �������� ��ġ�ؾ���
		//System.out.println�� return �Ʒ��� ���� javac �������� ����
		return 1+2;
	}//end of a() �Լ�


	//public : ��� ��Ű�������� ��밡��
	//void : ������ ���� -> return Ű���� ��� ����
	//b() : ��������� �Լ� �̸�
	//�Ϲ��Լ�-> main�Լ����� �������� ���� �ʿ�
	public void b(){
		System.out.println("\nTest_1.b() �Լ� ���� >>>>>>>\n");

		System.out.println("\nTest_1.b() �Լ� �� >>>>>>>\n");

	}//end of b() �Լ�

	//main() �Լ� : ���α׷� ������
	public static void main(String[] args) 
	{//TODO Auto-generated method stub.
		
		System.out.println("\nTest_1.main() �Լ� ���� >>>>>>>\n");

		//�Ϲ��Լ� a()�� b()�� ���� �������� ����
		Test_1 t1 = new Test_1();
		System.out.println("t1 �ּҰ� >>>>>>"+ t1);

		//�����ִ� �Լ� ���(1)
		//�Լ� �� ��ü�� �����
		t1.a();
		System.out.println("t1.a()>>>>"+t1.a());

		//�����ִ� �Լ� ���(2)
		//�Լ��� ���� �ٸ� ������ �ް�
		//�� ������ ��� ����
		//�� ����� �ַ� ��� �� ��
		int i = t1.a();
		System.out.println("i>>>>"+i);

		//������ ���� �Լ� ���
		t1.b();
		//System.out.println("t1.b()>>>>>:" t1.b());
		//�����߻� : b() �Լ��� void �Լ� �̱� ������ ���ϰ��� ����
		//System.out.println�� ���ϰ��� �ʿ�� �ϱ� ������ ������ �߻�

		System.out.println("\nTest_1.main() �Լ� �� >>>>>>>\n");
	}//end of main()�Լ�
}//end of Test_1 Ŭ����
