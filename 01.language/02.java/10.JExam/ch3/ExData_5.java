/*
	����)

	ExData_5 Ŭ��������
	������ �ִ� �Լ� + static�� ���� addMethod()�� ����
	�Ű����� int x, int y�� �޾Ƽ�
	���ϱ����� return Ű������ ��� ������ �����
	
	main �Լ����� addMethod()��
	�������� int�� x,y�� ������ ��,
	x=10, y=20���� �ʱ�ȭ �ؼ�
	�ƱԸ�Ʈ�� �����ؼ�
	int sum ���������� ��� ���� �����ؼ�
	�ֿܼ� ����Ͻÿ�

	Ǯ��)
	- �Լ�
		������ ����
		static ���� = �Ϲ��Լ� =������ ���
		�Ű����� : int x, int y
		���ϱ� ����� return ������ ������
		int sum�̶�� ���������� ��� ���� ����
		=> return ���� x+y�� ������ ���� �ƴ� sum�̶�� ���ο�
		int�� ������ ���� �� ��

	-�����Լ�
	�������� int x�� int y�� ���� + �ʱ�ȭ
	�ֿܼ� int sum�� Ȱ���Ͽ� ����
*/

//package
package a.b.c.ch3;

//import

public class ExData_5{
	//���
	//�������
	//������
	
	//������ Ÿ�� : int
	//�Լ� �̸� : addMethod
	//int�� ���� x�� y�� �Ű������� ��� -> (int x, int y)

	//������ �ִ� �Լ� + �Ϲ��Լ�
	//�Ϲ��Լ������� ���������� �ʿ� -> main �Լ����� new Ű���� �̿�
	//sum�̶�� int�� ������ �ʿ���
	public int addMethod(int x, int y){
		
		System.out.println("ExData_5.addMethod() �Լ� ���� >>>>\n");
		//int�� x�� y�� �ƱԸ�Ʈ�� ����
		//x�� y�� ���� ���ο� int�� ���� sum�� ����
		
		//�ƱԸ�Ʈ�� main�Լ����� �� ����
		System.out.println("ExData_5.addMethod() x>>>>:"+x);
		System.out.println("ExData_5.addMethod() y>>>>:"+y);
		
		//���� ���� x�� y�� sum�̶�� int�� ���������� �ִ´�.
		int sum = x + y;

		System.out.println("ExData_5.addMethod() sum>>>>"+sum);
		
		System.out.println("\nExData_5.addMethod()�Լ� �� >>>>\n");
		//return ���� �ִ� �Լ��̹Ƿ� return Ű���� ���
		//return ������ x�� y�� ���� sum�� ���� ��
		return sum;
	
		//return x+y; �� �� (���� sum �� ���� �ʿ� ����)

	}//end of addMethod �Լ�

	
	//main() �Լ� : ���α׷� ������
	public static void main(String[] args){ 
		//TODO Auto-generated method stub.
		
		System.out.println("main �Լ� ���� >>>>\n");
		
		//�������� ����
		//int�� ���� x�� y�� ���������� �����ϰ�
		//�� �� ���ͷ��� �ʱ�ȭ
		int x = 10;
		int y = 20;
		
		//addMethod�� ���������� �ʿ����
		//�������� ed5 ����
		ExData_5 ed5 = new ExData_5();

		//���ϰ��� �Լ��� �������
		int sum = ed5.addMethod(x,y);

		//���ϰ��� �ֱ� ������ println�� ���ؼ�
		//�ֿܼ� ��� ����
		System.out.println("sum �� >>>>>>:"+ sum);
		
		/*
		cf) �̷��Ե� ȣ�� �� �� ����
		System.out.println("ExData_5>>>"+ new ExData_5().addMethod(x,y));

		int sum1 = new ExData_5().addMethod(x,y);
		System.out.println("ExData_5.main().addMethod() sum>>>" + sum);
		*/
		
				
		System.out.println("\nmain �Լ� �� >>>>");
	}//end of main �Լ�
}//end of ExData_5 Ŭ����
