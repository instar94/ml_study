//package
package a.b.c.ch3;

//import
//nextInt()�� ����ϱ� ���� Scanner Ŭ������ import��
import java.util.Scanner;


public class ExFlow_Grade{

	//���
	//�������
	//������

	//�Լ�
	//�Ϲ��Լ� + void �Լ� ����
	//�Ϲ��Լ� : ����ϱ� ���ؼ� ���������� ���� -> main�Լ����� �����Լ� ����
	//void �Լ� : return Ű���� ��� �Ұ���
	//�Ű������� int score ��� ���ʵ������� �������� ��� -> main���� ���� �� �ʱ�ȭ ����
	public void gradeFun(int score){

		System.out.println("\nExFlow_Grade.gradeFun()�Լ� ����>>>>\n");
		System.out.println("ExFlow_Grade.gradeFun score ��>>>>" + score);
		
		//������ ��Ÿ�� ���� ������ �������� ����
		//grade ���� ����Ʈ��(null)�� �ʱ�ȭ
		char grade = '\u0000';
		//char grade=' ';
		//'\u0000'= ' ' �����ڵ�� ���� null ����



		//������ ���� �з� if
		//���� ���� ������ X => if�� swich���� ����
		if(score>= 90){ //90~100 : A����
			grade = 'A';

		}else if (score >= 80){
			grade = 'B';

		}else if (score >= 70){
			grade = 'C';

		}else if (score >= 60){
			grade = 'D';

		}else{
			grade = 'F';

		}
		
		System.out.println("ExFlow_Grade.gradeFun grade ��>>>>" + grade);
		
		System.out.println(score+"���̹Ƿ� "+grade+"���� �Դϴ�.");

		System.out.println("\nExFlow_Grade.gradeFun()�Լ� ��>>>>\n");
		}//end of gradeFun�Լ�
	
	//main() �Լ� : ���α׷� ������
	public static void main(String[] args) 
	{//TODO Auto-generated method stub.
		System.out.println("\nExFlow_Grade.main()�Լ� ����>>>>\n");
		System.out.println("������ �Է����ּ���");

		//nextInt();�� ����ϱ� ���ؼ� Scanner Ŭ������ ���������� ����
		//�Ű������� System.in���� ȣ��
		//System.in : �ֿܼ��� input�� �޾Ƽ� ���� ������
		Scanner sc = new Scanner(System.in);
		//nextInt(); Intput���� ������ ������
		//score���� ��ǲ���� ���� ������
		int score = sc.nextInt();

		//0 ~ 100 ������ ���ڰ� �Էµ� ��� ���� ��� ����
		//()�� ������ ��� ���� true�� ��� ����
		//score : main �Լ����� score ���� ȣ����
		if(score > 0 && score <= 100){

			//�Ϲ��Լ��� gradeFun() �Լ��� ����ϱ� ���ؼ� �������� ����
			ExFlow_Grade ef_g = new ExFlow_Grade();
			ef_g.gradeFun(score);
		
		}else{
			System.out.println("�����͸� Ȯ�����ּ���"); //0~100���� ���� �Է����� ���� ���
		}

		System.out.println("\nExFlow_Grade.main()�Լ� ��>>>>\n");

	}//end of main �Լ�
}//end of ExFlow_Grade
