//package
package a.b.c.ch3;

//import


/* 1 ���ϱ� 1 ���α׷� �����

����� ���

1) �Լ��� ���� �Ѵ� or main �Լ����� �ۼ��Ѵ�.
2) ����ϸ鼭 ���� �� ���� �޾Ƽ� ���Ѵ�. or ���� �� ���� ���ϰ�, �� ����  ����Ѵ�.
- System.out.println(x + y);
- int sum = x + y;
	System.out.println(sum);
3) void �Լ��� ���� or return ���� �޴´�.

*/

//�Լ��� ���� ����ϴ� ��� (4����)
public class ExData_4{
	
	//���
	
	//�������
	
	//������
	
	//�Լ�
	
	//�Լ����� �����(1) �Ϲ��Լ�, ���ϰ�x, x+y
	//�Ϲ��Լ� : �������� �ʿ�-> ExData_4 ed4 = new ExData_4();
	//�Ű����� 2�� (int��, int ��)
	//���� �ƱԸ�Ʈ�� println���� ���ع���
	//����� : �������� ���� �� ex4.add_0(x,y);
	public void add_0(int x, int y){
		System.out.println(x+y);

		System.out.println("ExData_4.add0() �Լ��� ����>>>>>:\n");
		
		System.out.println("�Ű����� int x�� �ƱԸ�Ʈ x�� �Ѿ�� ���� ���� int x = x>>>:"+x);
		System.out.println("�Ű����� int x�� �ƱԸ�Ʈ y�� �Ѿ�� ���� ���� int y = y>>>:"+y);

		//x + y ���� ����� �ֿܼ� ���
		System.out.println("x+y>>>>:"+(x+y));

		System.out.println("\nExData_4.add0() �Լ��� �� >>>>>>:");

	}//end of add_0 �Լ�

	//�Լ����� �����(2) �Ϲ��Լ�, ���ϰ�x, sum
	//�Ϲ��Լ� : �������� �ʿ� -> ExData_4 ed4 = new ExData_4();
	//�Ű����� 2�� (int��, int��)
	//�� �Ű������� ���ϴ� int�� �������� sum�� ����
	//�� sum�� println��
	//����� : �������� ���� �� ex4.add_1(x,y);
	public void add_1(int x, int y){

		System.out.println("ExData_4.add0() �Լ��� ����>>>>>:\n");
		
		System.out.println("�Ű����� int x�� �ƱԸ�Ʈ x�� �Ѿ�� ���� ���� int x = x>>>:"+x);
		System.out.println("�Ű����� int x�� �ƱԸ�Ʈ y�� �Ѿ�� ���� ���� int y = y>>>:"+y);

		//int�� �Ű����� x�� y�� add_3()�Լ��� ȣ��
		//sum�̶�� int�� ���������� x + y ���� ����
		int sum = x + y;
		System.out.println("sum>>>>"+sum);

		System.out.println("\nExData_4.add_1() �Լ��� �� >>>>>>:");

	}//end of add_1 �Լ�

	//�Լ����� �����(3) �Ϲ��Լ�, ���ϰ�o, x+y
	//�Ϲ��Լ� : �������� �ʿ� -> ExData_4 ed4 = new ExData_4();
	//�Ű����� 2�� (int��, int��)
	//return ���� x+y�� ���� ��
	public int add_2(int x, int y){

		System.out.println("ExData_4.add0() �Լ��� ����>>>>>:\n");
		
		System.out.println("�Ű����� int x�� �ƱԸ�Ʈ x�� �Ѿ�� ���� ���� int x = x>>>:"+x);
		System.out.println("�Ű����� int x�� �ƱԸ�Ʈ y�� �Ѿ�� ���� ���� int y = y>>>:"+y);

		//�Ű����� �������� int x�� int y�� ���ϰ� ������ ������� �ʰ�
		//return ������ ȣ��
		System.out.println("x+y>>>>:"+(x+y));
		
		System.out.println("\nExData_4.add_2() �Լ��� �� >>>>>>:");
		return x + y;
		

	}//end of add_2()�Լ�


	//�Լ����� �����(4) �Ϲ��Լ�, ���ϰ�o, sum
	//�Ϲ��Լ� : �������� �ʿ� -> ExData_4 ed4 = new ExData_4();
	//�Ű����� 2�� (int��, int��)
	// x�� y�� ���� int�� ���� sum �� ����
	// return  ���� sum�� ������
	public int add_3(int x, int y){
		
		System.out.println("ExData_4.add0() �Լ��� ����>>>>>:\n");
		
		System.out.println("�Ű����� int x�� �ƱԸ�Ʈ x�� �Ѿ�� ���� ���� int x = x>>>:"+x);
		System.out.println("�Ű����� int x�� �ƱԸ�Ʈ y�� �Ѿ�� ���� ���� int y = y>>>:"+y);

		//int�� �Ű����� x�� y�� add_3()�Լ��� ȣ��
		//sum�̶�� int�� ���������� x + y ���� ����
		int sum = x + y;
	
		//int�� �������� sum �� ȣ�� -> �ܼ����
		System.out.println("sum>>>:" + sum);

		System.out.println("\nExData_4.add_3() �Լ��� �� >>>>>>:");	

		//int�� �������� sum�� ȣ���Ͽ� return value�� ȣ��
		return sum;

		

	}//end of add_3�Լ�



	//main() �Լ� : �ܼ־��ø����̼��� ������
	public static void main(String[] args){ 
		//TODO Auto-generated method stub.
		
		//main�Լ����� ����(1)
		//�ƱԸ�Ʈ�� println�ϴ� �������� ���Ѵ�.
		System.out.println(1+1);
		System.out.println("1+1=" + 1+1); //������ ���� ���ϱⰡ �Ǿ� 11�̵�
		System.out.println("1+1=" +(1+1));

		//int�� ���� x�� y�� ���� ��(���ͷ�)�� 1�� �ʱ�ȭ
		int x = 1;
		int y = 1;

		//main�Լ����� ����(2)
		//������ ���� �ʱ�ȭ�� �� println �ϴ� �������� ���Ѵ�.
		System.out.println(x+y);

		//main�Լ����� ����(3)
		int sum = x + y;

		System.out.println(sum);

		//�������� ��� ed4
		//add_0,add_1,add_2,add_3 �Լ��� ��� �Ϲ��Լ��̱� ������
		//���������� �ʿ��ؼ� new Ű���带 �����
		ExData_4 ed4 = new ExData_4();

		//add_0�� add_1�� ���ϰ��� ���� void �Լ��̱� ������ println�� ��� �Ұ���
		//�Լ� �ƱԸ�Ʈ�� int�� �������� ���� ����
		ed4.add_0(x, y);
		ed4.add_1(x, y);

		//add_2�� add_3�� ���� ���� ���������� println  ��� ����
		//return ���� int������ �ޱ� ���ؼ� int sum ������ �̾���
		//�Լ��� ��� ���� int�� sum3�� ��� ���� �ֿܼ� ���
		
		int sum2 = ed4.add_2(x, y);

		//�������� sum2�� ȣ���ؼ� sum2�� ��� ���� �ֿܼ� ���
		System.out.println(sum2);

		
		int sum3 = ed4. add_3(x, y);

		//�������� sum3�� ȣ���ؼ� sum3�� ��� ���� �ֿܼ� ���
		System.out.println(sum3);


	}//end of main �Լ�
}//end of ExData_4 Ŭ����
