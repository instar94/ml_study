// package
package a.b.c.ch3;

// import
import java.util.Scanner;

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

public class ExFlow_Grade_4
{
	// ��� 
	// �������
	// ������

	// �Լ� 
	public void gradeFun(int score){
		System.out.println("\nExFlow_Grade_4.gradeFun() �Լ� ���� >>> : \n");
		System.out.println("ExFlow_Grade_4.gradeFun() :: score >>> : " + score);
		
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

		System.out.println("\nExFlow_Grade_4.gradeFun() �Լ� �� >>> : \n");
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.	
		System.out.println("\nExFlow_Grade_4.main() �Լ� ���� >>> : \n");
		System.out.println("���� �Է��� �ϸ� ������ ȯ��Ǿ� ���ɴϴ�. >>> : ");

		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if (0 <= score && score <= 100)
		{
			ExFlow_Grade_4 eg4 = new ExFlow_Grade_4();
			eg4.gradeFun(score);
				
		}else{
			System.out.println("������ �� �Է��Ͻÿ� !!");
		}
		System.out.println("\nExFlow_Grade_4.main() �Լ� �� >>> : \n");
	}
}
