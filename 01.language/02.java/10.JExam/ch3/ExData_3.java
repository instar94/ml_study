package a.b.c.ch3;

/*
ExData_3Ŭ�������� 
public void primeVal()�� ����Ǹ�
byte, char, short, int, float, double�� �ִ�/�ּڰ��� �������� �Ұ�
*/

public class ExData_3{
//���
//�������
//������


	//�Լ�
	//�Ϲ��Լ� + ������ ����
	//�Ϲ��Լ� = ���������� �̿��ؾ��� => new  Ű���带 ���
	//����� : ��������.�Լ���();
	//ExData_3 ed3 = new ExData_3();
	//ed3.primeVal();

	public void primeVal(){

		//\n ���� �� �� �����̽� ����
		System.out.println("primeVal()�Լ� ����>>>:\n");
	
		//byte	Byte		:�ִ밪/�ּҰ�
		System.out.println("Byte.MAX_VALUE>>>:"+Byte.MAX_VALUE);
		System.out.println("Byte.MIN_VALUE>>>:"+Byte.MIN_VALUE);

		//char	Character	:�ִ밪/�ּҰ�
		System.out.println("Character.MAX_VALUE>>>:"+Character.MAX_VALUE);
		System.out.println("Character.MAX_VALUE>>>:"+Character.MIN_VALUE);
		
		//short	Short		:�ִ밪/�ּҰ�
		System.out.println("Short.MAX_VALUE>>>:"+Short.MAX_VALUE);
		System.out.println("Short.MIN_VALUE>>>:"+Short.MIN_VALUE);
		
		//int	Integer		:�ִ밪/�ּҰ�
		System.out.println("Integer.MAX_VALUE>>>>:"+Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE>>>>:"+Integer.MIN_VALUE);
		
		//long	Long		:�ִ밪/�ּҰ�
		System.out.println("Long.MAX_VALUE>>>:"+Long.MAX_VALUE);
		System.out.println("Long.MIN_VALUE>>>:"+Long.MIN_VALUE);
		
		//float	Float		:�ִ밪/�ּҰ�
		System.out.println("Float.MAX_VALUE>>>:"+Float.MAX_VALUE);
		System.out.println("Float.MIN_VALUE>>>:"+Float.MIN_VALUE);
		
		//double	Double	:�ִ밪/�ּҰ�
		System.out.println("Double.MAX_VALUE>>>:"+Double.MAX_VALUE);
		System.out.println("Double.MIN_VALUE>>>:"+Double.MIN_VALUE);

		System.out.println("\nExData_3 primeVal()�Լ� ��>>>:");
	}//end of primeVal �Լ�


	public static void main(String[] args){
	
		System.out.println("ExData_3 main()�Լ� ����>>>:\n");
	
		//�������� ����
		ExData_3 ed3 = new ExData_3();
		
		//void �Լ����� System.out.println�� ��� �� �� ����
		//��������.�Լ���();���� ���
		ed3.primeVal();
		System.out.println("\nExData_3 main()�Լ� ��>>>:");

	}//end of main �Լ�
}//end of ExData_3 Ŭ����