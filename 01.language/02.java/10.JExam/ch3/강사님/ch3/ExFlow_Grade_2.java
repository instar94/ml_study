// package
package a.b.c.ch3;

// import

/*
��Ű���̸� : a.b.c.ch3
Ŭ�����̸� : ExFlow_Grade
�Լ��̸� : gradeFun
���� : ���� : int score
    : ���� : char grade

1. Scanner Ŭ����, nextInt() �Լ� �̿��ؼ� 
2. Scanner  ���� �ϴ� ��� 
����         ���� 
100 ~ 90�� : A
89 ~ 80��  : B
79 ~ 70��  : C
69 ~ 60��  : D
������ F
�ֿܼ� ����ϱ� 
*/

public class ExFlow_Grade_2
{
	// ��� 
	// �������
	// ������

	// �Լ� 
	public void gradeFun(int score){
		
		char grade = ' ';

		if (score >= 90)
		{
			grade = 'A';
		}
		else if (score >= 80)
		{
			grade = 'B';
		}
		else if (score >= 70)
		{
			grade = 'C';
		}
		else if (score >= 60)
		{
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.println(score + "�� ������ " + grade + "�Դϴ�.");

	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		int score = 1;
		

		if (0 <= score && score <= 100)
		{
			ExFlow_Grade_2 eg2 = new ExFlow_Grade_2();
			eg2.gradeFun(score);
				
		}else{
			System.out.println("������ �� �Է��Ͻÿ� !!");
		}
	}
}
