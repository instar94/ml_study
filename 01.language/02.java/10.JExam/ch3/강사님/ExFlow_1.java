// package
package a.b.c.ch3;

// import

// ���α׷����� ���� �帧 : Flow Control : ������� ����� ture �� ���� ���� �ȴ�.

// Flow Chart : ������ 
// ���̷��� ������ : Flow Control : if, switch, for, while, do while
// �ڹ� : Flow Control : if, switch, for, while, do while

public class ExFlow_1 
{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		// if ���� ���ǽ��� ����� true �� ���� ���� �ȴ�. 
		// if () {}
		// if �� �־�� �Ѵ�.
		// () : ���ǽ� ���� �� : ���ǽ��� ����� true �� ���� if ���� ���� ���� �ǰų� 
		//                    ���� ���� �ٷ� �� ������ ����ȴ�.

		if (true)
		{
			System.out.println("if���� ���ǽ��� ����� true �� ��쿡 ����ȴ�.");
		}

		if (false)
		{
			
		}else{
			System.out.println("else ���� if���� ���ǽ��� ����� false �� ��쿡 ����ȴ�.");
		}

		boolean bool = false;
		
		if (!bool) // ��������
		{
			System.out.println("if���� ���ǽ��� ����� true �� ��쿡 ����ȴ�.");
		}
		
		System.out.println(bool);

		if (bool)
		{
			
		}else{
			System.out.println("else ���� if���� ���ǽ��� ����� false �� ��쿡 ����ȴ�.");
		}

		
		int x = 1;
		int y = 0;
		int sum = x / y;
		
		if (sum > 0)
		{
		}
	}
}
