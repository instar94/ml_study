//package
package a.b.c.ch3;
//import

public class ExFlow_7_1 {

	//���
	//�������
	//������

	//�Լ�

	//main() �Լ� : ���α׷� ������
	public static void main(String[] args){
	//TODO Auto-generated method stub.
		System.out.println("for��>>>>>>>>");
		//for������ ���� ���� �� �ʱ�ȭ�� �ʱ�ȭ�Ŀ��� �ϴ� ���� �Ϲ���
		//���α׷����� ��� �����ʹ� ���������� ���(�迭)
		//������ ������ Ư�� �ڹٴ� 0
		//for���� �׻� �迭�� ���� ���Ǿ�� ��
		//�ʱ�ȭ�� 0����
		//�ʱ�ȭ�� : i�� 0��
		//���ǹ� : i�� 10�� �ɶ�����
		//������ : 1�� ����
		//���๮ : �ȳ��ϼ��� ����ϱ�


		for(int i=0; i<10; i++){
			System.out.println(i+" �ȳ��ϼ��� ");
		}//end of if��

		System.out.println("\nwhile ��>>>>>>>>");
		//while������ ����� �������� i�� ����
		//�迭�� ���� i�� 0���� �ʱ�ȭ
		int i = 0;
		//10�� �ؾ������� i�� 0~9���� �ؾ��� => 10���� ���� ����
		//i++ : i�� 1�� Ŀ�� ����
		while(i<10){
			System.out.println(i+" �ȳ��ϼ��� ");
			i++;
		}//end of while��
	}//end of main �Լ�
}//end of ExFlow_7_1 Ŭ����