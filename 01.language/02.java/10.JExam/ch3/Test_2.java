//package
package a.b.c.ch3;
//import

public class Test_2{

	//���
	//�������
	//������

	//�Լ�

	//main() �Լ� : ���α׷� ������
	public static void main(String[] args) 
	{//TODO Auto-generated method stub.
		
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		//for(������?;true�϶�����;�󸶳� �����ҷ�?)
		//length() = ����(���ڼ�)�� ���ϴ� �Լ�
		//=> str�� ���ڼ���ŭ (26��)
		//i�� 0���� 25���� ����ְ�
		//26�� �����ϸ� False �� �Ǳ⶧���� �ݺ��� ����
		for(int i=0;i<str.length() ;i++){

			//���ʵ������� �������� c�� ����
			//�������� c�� str�� charAt(i)�� ȣ���ؼ� �ʱ�ȭ�Ѵ�.
			//charAt=�ε��� ���� (0���� ������)
			char c=str.charAt(i);

			//c�� Integer.toBinarySting(c)�� �ƱԸ�Ʈ�� ��
			//c�� 0���� �ϳ��� ��
			//"0x"��Ʈ�� �׷��� �� �־
			System.out.print(Integer.toBinaryString(c) + " : ");
			System.out.print(Integer.toOctalString(c) + " : ");
			System.out.print((int)c + " : ");
			System.out.print("0x"+Integer.toHexString(c)+" : ");
			System.out.println(c);
			

		}//end of for �Լ�	
		
	}
}
