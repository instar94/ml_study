// package
package a.b.c.ch3;

// import
import java.util.Scanner;

public class ExFlow_4 
{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		System.out.println("���̸� �Է��Ͻÿ� !!");
		
		Scanner sc = new Scanner(System.in); // jdk 1.5
		
		int age = sc.nextInt();
		System.out.println("age >>> : " + age);

		if (0 <= age && age <= 100)
		{
			if (age >= 8)
			{
				System.out.println("�б��� �ٴմϴ�.");
			}else{
				System.out.println("�б��� �ٴ��� �ʽ��ϴ�.");
			}
		}
		else {
			System.out.println("���̸� �� �Է��Ͻÿ� !!");
		}
	}
}
