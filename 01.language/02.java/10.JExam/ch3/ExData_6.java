/*
1. ��Ģ���� ���α׷� �����
2. ��Ģ������ : +, -, *, /
3. ���� : main�Լ� ���������� int x, int y
	�ʱ�ȭ�� 20, 10���� ��
4. ���ϱ� �Լ� �̸� : public int addM(int x, int y)
5. ���� �Լ� �̸� : public int subM(int x, int y)
6. ���ϱ� �Լ� �̸� : public int ,mulM(int x, int y)
7. ������ �Լ� �̸� : public int dicM(int x, int y)
8. �� ������ �Լ� ������ �ϰ� ����� int sum���� ����
9. �� ������ �Լ� ������ ������ �������� int sum
10. main() �Լ����� �� ������ �Լ��� ȣ���ؼ� �������
	�ϱ� ���������� �޾Ƽ� �ֿܼ� ����Ѵ�.
	�� ������ �Լ� ȣ���� ���������� �̿��Ѵ� -> static ��� X
	int addV, int subV, int mulV, int divV
11. ��Ű���� a.b.c.ch3; 
*/

//package
package a.b.c.ch3;

//import

public class ExData_6{
	//���
	//�������
	//������
	
	//�Լ�
	
	//���ϱ� �Լ�
	//�Ű����� 2���� ������ �Ϲ��Լ� (int ��, int ��)
	//�Ϲ��Լ��̱� ������ main()���� �������� ���� �� ��� ����
	public int addM(int x, int y){

		System.out.println("\naddM�Լ� ����>>>>>>\n");

		//�ֿܼ� �Լ��� ���� ���ͷ��� ���
		System.out.println("ExData.addM() x>>>>>:"+x);
		System.out.println("ExData.addM() y>>>>>:"+y);

		//���� ��� ���� sum�̶�� int�� ������ ����
		int sum = x + y;

		System.out.println("\nExData.addM() ��>>>>>>\n");

		//��� �� ������ sum�� ���Ͽ� ����
		return sum;



	}//end of addM �Լ�

	//�����Լ�
	//�Ű����� 2���� ������ �Ϲ��Լ� (int ��, int ��)
	//�Ϲ��Լ��̱� ������ main()���� �������� ���� �� ��� ����
	public int subM(int x, int y){
		System.out.println("\nsubM�Լ� ����>>>>>>\n");

		//�ֿܼ� �Լ��� ���� ���ͷ��� ���
		System.out.println("ExData.subM() x>>>>>:"+x);
		System.out.println("ExData.subM() y>>>>>:"+y);

		//���� ��� ���� sum�̶�� int�� ������ ����
		int sum = x - y;

		System.out.println("\nExData.subM() ��>>>>>>\n");
		
		//��� �� ������ sum�� ���Ͽ� ����
		return sum;



	}//end of addM �Լ�

	//���ϱ��Լ�
	//�Ű����� 2���� ������ �Ϲ��Լ� (int ��, int ��)
	//�Ϲ��Լ��̱� ������ main()���� �������� ���� �� ��� ����
	public int mulM(int x, int y){
		System.out.println("\nmulM�Լ� ����>>>>>>\n");

		//�ֿܼ� �Լ��� ���� ���ͷ��� ���
		System.out.println("ExData.mulM() x>>>>>:"+x);
		System.out.println("ExData.mulM() y>>>>>:"+y);

		//���� ��� ���� sum�̶�� int�� ������ ����
		int sum = x * y;

		System.out.println("\nExData.mulM() ��>>>>>>\n");
		
		//��� �� ������ sum�� ���Ͽ� ����
		return sum;



	}//end of addM �Լ�

	//������ �Լ�
	//�Ű����� 2���� ������ �Ϲ��Լ� (int ��, int ��)
	//�Ϲ��Լ��̱� ������ main()���� �������� ���� �� ��� ����
	public int divM(int x, int y){
		System.out.println("\ndivM�Լ� ����>>>>>>\n");

		//�ֿܼ� �Լ��� ���� ���ͷ��� ���
		System.out.println("ExData.divM() x>>>>>:"+x);
		System.out.println("ExData.divM() y>>>>>:"+y);
		
		//���� ��� ���� sum�̶�� int�� ������ ����
		int sum = x / y;


		System.out.println("\nExData.divM() ��>>>>>>\n");
		
		//��� �� ������ sum�� ���Ͽ� ����
		return sum;

	}

	//main() �Լ� : ���α׷� ������
	public static void main(String[] args){ 
		//TODO Auto-generated method stub.
		
		System.out.println("\nmain�Լ� ����>>>>>>\n");

		//�������� ���� �� �ʱ�ȭ
		int x = 20;
		int y = 10;

		//�������� - new �ν��Ͻ�
		//�Ϲ��Լ��̱� ������(static ���x) �ʿ�
		ExData_6 ed6 = new ExData_6();
		System.out.println("ExData_6() ed6 �ּҰ�>>>>>>>"+ ed6);

		//�� �Լ��� sum ���� ���������� ȣ�� 
		//���ϱ� �� ȣ��
		int addV = ed6.addM(x, y);
		
		//���� �� ȣ��
		int subV = ed6.subM(x, y);
		
		//���ϱ� �� ȣ��
		int mulV = ed6.mulM(x, y);
		
		//������ �� ȣ��
		int divV = ed6.divM(x, y);

		//�� ���� �ַܼ� ��� �� ���
		//���ϰ��� �ִ� �Լ��̱� ������ println �� �̿� �� �� ����
		
		//���ϱ� �����
		System.out.println("ed6.addM(x,y);>>>>>:"+addV);
		
		//���� ��� ��
		System.out.println("ed6.subM(x,y);>>>>>:"+subV);
		
		//���ϱ� ��� ��
		System.out.println("ed6.mulM(x,y);>>>>>:"+mulV);
		
		//������ �����
		System.out.println("ed6.divM(x,y);>>>>>:"+divV);
		
		
		System.out.println("\nmain�Լ� ��>>>>>>\n");
	}//end of main �Լ�
}//end of ExData_6 Ŭ����
