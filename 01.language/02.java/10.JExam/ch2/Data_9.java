package a.b.c.ch2;

public class Data_9{

	//�Ϲ��Լ� + void(������ ���� �Լ�)
	//�Ϲ��Լ� : newŰ����� �������� �������� -> Ŭ�������� �������� = new �������̸�();
	//void(���ϰ�x) : return Ű���� ���XX
	//�Լ��� �Ű����� 2�� : ù��° �Ű����� int�� / �ι�° �Ű����� int��
	//ȣ�� �� ��: ��������.�Լ��̸�(��Ʈ�� ������,��Ʈ�� ������)
	public void aMethod(int x1, int y1){
		System.out.println("Data_9 Ŭ���� void aMethod()�Լ�");

		int sum1 = x1 + y1;
		System.out.println("sum1>>>:"+ sum1);
	}//end of aMethod() �Լ�

	//static�Լ� + void(������ ���� �Լ�)
	//static�Լ� : new Ű���� ���� Ŭ������.�Լ���();�� ��밡��
	//			->Data_9.aaMethod(int��, int��);
	//���ϰ�x : return Ű���� ���XX
	//�Լ��� �Ű����� 2�� : ù��° �Ű����� int�� / �ι�° �Ű����� int��
	//ȣ�� �� ��: Ŭ������.�Լ��̸�(��Ʈ�� ������,��Ʈ�� ������)
	public static void aaMethod(int x2, int y2){
		System.out.println("Data_9 Ŭ���� static void aaMethod()�Լ�");

		int sum2 = x2 + y2;
		System.out.println("sum2>>>:"+ sum2);
	}//end of aaMethod �Լ�


	//�Ϲ��Լ� + ���ϰ�O
	//�Ϲ��Լ� : ȣ���ϱ� ���ؼ� newŰ���带 �̿��� ���������� �������� (��������.�Լ��̸�();)
	//		-> Ŭ�������� ��������=new �������̸�();
	//���ϰ�O : int�� return���� �־���� : �Լ��� ��� ���� int���̴�.
	//������� int�� ������ �����ؼ� �ޱ�(int i)
	//�Լ��� �Ű����� 2�� : ù��° �Ű����� int�� / �ι�° �Ű����� int��
	//ȣ�� �� ��: int i=��������.�Լ��̸�(��Ʈ�� ������,��Ʈ�� ������)
	
	public int bMethod(int x3, int y3){
		System.out.println("Data_9 Ŭ���� int bMethod()�Լ�");

		int sum3=x3 + y3;
		System.out.println("bMethod() �Լ� sum3>>>:"+sum3);

		return sum3;

	}//end of bMethod()�Լ�

	//static �Լ� + ���ϰ�O
	//static �Լ� : newŰ���� �ʿ�X Ŭ�����̸�.�Լ��̸�();�� �̿밡��->Data_9.
	//���ϰ�O : int�� return���� �־���� : �Լ��� ��� ���� int���̴�.
	//������� int�� ������ �����ؼ� �ޱ�(int i1)
	//�Լ��� �Ű����� 2�� : ù��° �Ű����� int�� / �ι�° �Ű����� int��
	//ȣ�� �� ��: int i1=Ŭ������.�Լ��̸�(��Ʈ�� ������,��Ʈ�� ������)
	public static int bbMethod(int x4, int y4){
		System.out.println("Data_9 Ŭ���� int bbMethod �Լ�");

		int sum4= x4 + y4;
		System.out.println("bbMethod()�Լ� sum4>>>:"+sum4);

		return sum4;

	}//end of bbMethod() �Լ�

	//main �Լ��� ���� : �ܼ� ���ø����̼� ����
	public static void main (String[] args){
	
		//�������� int�� ���� �� �ʱ�ȭ
		int x = 1;
		int y = 2;

		//static �Լ� (aaMethod�� bbMethod)
		//����� : Ŭ������.�Լ���(�Ű�����, �Ű�����);
		//�Ű������� �ƱԸ�Ʈ�� ������ �߿��ϴ� (�̸��� ���X)
		//x1�̴� x2�̴� ������ ������ ������
	
		//aaMethod �Լ� �� ����
		Data_9.aaMethod(x,y);
	
		//bbMethod �Լ� �� ����
		//������ ���ϰ��� �ޱ� ���� int i �Ű����� �ҷ���
		int i=Data_9.bbMethod(x,y);
		System.out.println("i>>>>:"+i);

		//�Ϲ��Լ� (aMethod�� bMethod)
		// ����� : new Ű����� ���������� ����
		Data_9 d9 = new Data_9();

		//aMethod �Ű������� �ƱԸ�Ʈ �ֱ�
		d9.aMethod(x,y);

		//bMethod �Ű������� �ƱԸ�Ʈ �ֱ�
		//������ ���ϰ��� �ޱ� ���� int i1 �Ű����� �ҷ���
		int i1 = d9.bMethod(x,y);
		System.out.println("i1>>>>>>"+i1);

	}//end of main() �Լ�
}//end of Data_9 Ŭ���� 