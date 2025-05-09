// package
package a.b.c.ch3;

// import
import java.util.Scanner;


public class ExFlow_5_1
{
	// ��� 
	public static final char MEDAL_CLOLOR_GOLD = 'G';
	public static final char MEDAL_CLOLOR_SILVER = 'S';
	public static final char MEDAL_CLOLOR_BRONZE = 'B';
	public static final char MEDAL_CLOLOR_A = 'A';
	// �������
	// ������
	

	// �Լ� 
	public String rankFun(int ranking){
		System.out.println("\nExFlow_5_1.rankFun() �Լ� ���� >>> : \n");
		System.out.println("ExFlow_5_1.rankFun() :: ranking >>> : " + ranking);

		// ��������, �����ڷ�������
		char medalColor = '\u0000'; // �����ڵ�� �ʱ�ȭ 
		
		switch (ranking)
		{
			case 1: medalColor = ExFlow_5_1.MEDAL_CLOLOR_GOLD;					
					break;
			case 2: medalColor = ExFlow_5_1.MEDAL_CLOLOR_SILVER;
					break;
			case 3: medalColor = ExFlow_5_1.MEDAL_CLOLOR_BRONZE;
					break;
			default:
					medalColor = ExFlow_5_1.MEDAL_CLOLOR_A;
			/*
			case 1: medalColor = 'G';					
					break;
			case 2: medalColor = 'S';
					break;
			case 3: medalColor = 'B';
					break;
			default:
					medalColor = 'A';
			*/
		}

		System.out.println("\nExFlow_5_1.rankFun() �Լ� �� >>> : \n");
		return ranking + "�� �޴��� ������ " + medalColor + "�Դϴ�.";		
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		System.out.println("\nExFlow_5_1.main() �Լ� ���� >>> : \n");
		System.out.println("����� �Է��Ͻÿ� !!");
		
		Scanner sc = new Scanner(System.in);
		int ranking = sc.nextInt();

		if (1 <= ranking && ranking <= 100)
		{
			ExFlow_5_1 ef1 = new ExFlow_5_1();
			String msg = ef1.rankFun(ranking);

			System.out.println("" + msg);
				
		}else{
			System.out.println("������ �� �Է��Ͻÿ� !!");
		}

		System.out.println("\nExFlow_5_1.main() �Լ� �� >>> : \n");
	}
}
