//package
package a.b.c.ch3;

//import
//nextInt()�� ����ϱ� ���� Scanner Ŭ���� import
import java.util.Scanner;

public class ExFlow_5_1{

	//���
	//�� �޴� ���� �Ҵ� �� ������ ������ �����Ƿ� ����� �����ص�
	//public : ��� ��Ű������ ��밡��
	//static : �޸𸮿� �ڵ����� �ε��� -> new�� �ν��Ͻ� �� �ʿ� X
	//			��� ���� Ŭ�����̸� . ���������� ���
	//final : ����� ���� ���� �� ����
	//char : �����ڷ��� (����)
	public static final char MEDAL_COLOR_GOLD = 'G';
	public static final char MEDAL_COLOR_SILVER = 'S';
	public static final char MEDAL_COLOR_BRONZE = 'B';
	public static final char MEDAL_COLOR_A = 'A';

	//�������
	//������

	//�Լ�
	//public : � ��Ű���������� ��밡��
	//String : ���ڿ� + return�� ����ؾ��ϴ� �Լ�
	//�Ű����� : int ranking <= �����ڷ���(������) ����
	public String rankFun(int ranking){
		System.out.println("ExFlow_5_1.rankFun ���� >>>>>>>>>>");
		//medalColor : �޴� ������ ǥ���ϴ� ��������
		//char : �����ڷ���
		//���������� ����� ���ÿ� �ʱ�ȭ �ؾ������� ' '�� �ʱ�ȭ
		//' ' = '\u0000'
		char medalColor ='\u0000';

		//ranking�� �̹� main���� �����߱� ������ ���� ��
		System.out.println("ranking>>>>>" + ranking);

		//switch �� : ()�� ���ǿ� �´� case�� �����ϰ� break��
		//default : if���� else�� ������ ����� ������
		//����� �̹� ����Ǿ� �ֱ� ������ ����� ����� ���� ���´�.
		//�� ExFlow_5_1 Ŭ�������� ����߰� static�� ���Ʊ� ������
		//ex) ExFlow_5_1.MEDAL_COLOR_GOLD
		//         Ŭ���� . �����̸� ���� ����ؾ���
		switch (ranking){
			case 1: medalColor = ExFlow_5_1.MEDAL_COLOR_GOLD;
				break;
			case 2: medalColor = ExFlow_5_1.MEDAL_COLOR_SILVER;
				break;
			case 3: medalColor = ExFlow_5_1.MEDAL_COLOR_BRONZE;
				break;
			default:
					medalColor = ExFlow_5_1.MEDAL_COLOR_A;

				/*��� ���� ���� ����� ���
				case 1: medalColor = 'G';
				break;
				case 2: medalColor = 'S';
				break;
				case 3: medalColor = 'B';
				break;
				default:
						medalColor = 'A';
				
				*/
		}//end of switch ����
		
		//medalColor�� �� ���Դ��� ���� ��
		System.out.println("medalColor>>>>" + medalColor);
		//return ���� �����!
		System.out.println("ExFlow_5_1.rankFun �� >>>>>>>>>>");
		//return�� ()�� {}�� ������ �ʴ´�!
		return ranking + "���� �޴� ���� "+ medalColor + " �Դϴ�.";
	}

	//main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		System.out.println("ExFlow_5_1.main �Լ� ����>>>>");
		
		//�Է��� ���� �� �ֵ��� ������ ����Ʈ
		System.out.println("����� �Է����ּ��� (1~100)");
		
		//ranking : ������ �ǹ��ϴ� ��������
		//ranking�� ���� nextInt()�� ����� ���� �ֿܼ��� �޾Ƽ� �ʱ�ȭ
		//Scanner�� �ִ� nextInt �Լ��� ����ϱ� ���ؼ� ���������� ����
		Scanner sc = new Scanner(System.in);
		int ranking = sc.nextInt();

		//�����ο��� 100���̹Ƿ� ����� 1~100������ ���� ����
		if(ranking>=1 && ranking<=100){
		
			//���ڸ� ����� �Է��� ��� rankFun �Լ��� �����Ѵ�.
			//rankFun �Լ��� static ���� �ʾ����Ƿ� ���������� �̿�
			//return�� �ִ� �Լ���⶧���� ���� String ������ msg�� �ƱԸ�Ʈ�� ���� ���� ����Ѵ�.
			ExFlow_5_1 ef5_1 = new ExFlow_5_1();
			String msg = ef5_1.rankFun(ranking);

			System.out.println(msg);

		//else : 1~100 ���� ���ڸ� �Է��� ���(= ������ ���� false�� ���)
		}else{
			System.out.println("�����͸� �ٽ� �Է����ּ���");
		}

		System.out.println("ExFlow_5_1.main �Լ� ��>>>>");

	}//end of main �Լ�
}//end of ExFlow_5_1 Ŭ����

