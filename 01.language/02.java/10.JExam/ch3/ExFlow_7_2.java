//package
package a.b.c.ch3;
//import

public class ExFlow_7_2 {

	//���
	//�������
	//������

	//�Լ�

	//main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		// =�� ������ �� �� �� �� (�̸� => �ش� ���� �������� ����)
		System.out.println("i <= 3");
		for (int i = 0; i < 3 ; i++){
			System.out.println(i);
		}

		// =�� ǥ������ �� �ѹ� �� �� (���� => �ش� ������ ������ ��)
		System.out.println("\ni <= 3");
		for (int i = 0; i <= 3 ; i++){
			System.out.println(i);
		}
		/*
		//�ȳ��ϼ��� ���ڿ��� �ֿܼ� 1000000�� ���
		//�ʱ�ȭ�� : int i = 0
		//���ǽ� : i<1000000
		//������ : i++
		for (int i = 0; i<=1000000;i++ ){
			System.out.println("�ȳ��ϼ��� "+ i);
		}//end of for��
	
		//i�� 0���� �����ϴ� �ͺ��� �� �������� �����ϴ� ���� 
		//�ӵ��� �̼��ϰ� ����
		for (int i =1000000 ;i>=0 ;i-- ){
			System.out.println("�ȳ��ϼ���"+i);
		}//end of for��
		*/
	}//end of main �Լ�
}//end of ExFlow_7_2 Ŭ����
