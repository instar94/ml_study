//package
package a.b.c.ch3;
//import
import java.util.Scanner;

public class  ExFlow_4{
	//���
	//�������
	//������
	
	//�Լ�
	
	//main() �Լ� : ���α׷� ������
	public static void main(String[] args){
		
		System.out.println("���̸� �Է��Ͻÿ�!!");

		//static�� ���� �ʾ����Ƿ� �������� �����ؼ� ���
		//Scanner Ŭ���� �̸� (�Ҽ� : java.util.Scanner)<-lang �� �����Ƿ� import�ؼ� ���
		//sc ���������� 
		//new : �������� �ν��Ͻ�
		//Scanner(System.in) : Scanner��� �����ڸ� ����
		//�׷��� System.in���� �����͸� �Է� ����
		Scanner sc = new Scanner(System.in);

		//���ʵ������� �������� int age�� ����
		//nextInt() : �Է¹��� ���� age�� ������
		int age =sc.nextInt();
		System.out.println("age>>>>>"+age);
		
		//0~100������ �����̸� �Է� or �ʰ��Ǹ� �׳� ������ �� Ȯ���ش޶�� ��û
		//if���ǹ� : ()�� ������ true �̸� ����
		if (0<= age && age<=100){
		if (age>=8){
			System.out.println("�б��� �ٴմϴ�");
		}else{
			System.out.println("�б��� �ٴ��� �ʽ��ϴ�.");
		}
		//TODO Auto-generated method stub.
		//else : ()�ȿ� ������ false�� ����
		}else{
			System.out.println("�����Ͱ��� Ȯ�����ּ���");
		}
	}//end of main�Լ�
}//end of ExFlow_4 Ŭ����
