// package
package a.b.c.ch3;

// import


public class ExFlow_5 
{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		// ��������, �����ڷ������� 
		int ranking = 1;
		// ��������, �����ڷ�������
		char medalColor = '\u0000'; // �����ڵ�� �ʱ�ȭ 

		// switch Ű���� : ���̽��� �б��ϴ� �б⹮ : if ���� ������ ����� �Ѵ�. 
		// () : ���ǽ� : jdk 1.7 �������� ���ڸ� ��� ���� �ߴ�.
		//               jdk 1.7 ���ʹ� ���� �� ���ڿ��� ��� �����ϴ�.
		// case : ���ǽĿ� �ִ� ���� case Ű���忡 �ִ� ���� �����ϸ� �� ǥ������ ���� �ȴ�. 
		//  if (ranking == 1) case 1 ���� �ȴ�. 
		//  else if (ranking == 2) case 2 ���� �ȴ�. 
		// break Ű����� �� ������ �Ǵ� �� ���� �����ÿ� : switch ���� �����ÿ� 
		switch (ranking)
		{
			case 1: medalColor = 'G';					
					break;
			case 2: medalColor = 'S';
					break;
			case 3: medalColor = 'B';
					break;
			default:
					medalColor = 'A';
		}

		System.out.println(ranking + "�� �޴��� ������ " + medalColor + "�Դϴ�.");

		ranking = 3;
		// ��������, ��������
		String mColor = "";
		switch (ranking)
		{
			case 1: mColor = "�ݸ޴�";
					break;
			case 2: mColor = "���޴�";
					break;
			case 3: mColor = "���޴�";
					break;
			default:
					mColor = "�Ϲݸ޴�";
		}

		System.out.println(ranking + "�� �޴��� ������ " + mColor + "�Դϴ�.");

		String medal = "GOLD";
		switch (medal)
		{
			case "GOLD": 
					System.out.println("�ݸ޴��Դϴ�.");
					break;
			case "SILVER": 
					System.out.println("���޴��Դϴ�.");
					break;
			case "BRONZE": 
					System.out.println("���޴��Դϴ�.");
					break;
			default:
					System.out.println("��޴��Դϴ�.");
					break;
		}
	}
}
