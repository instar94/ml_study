package a.b.c.ch1;

public class EX_1{

	//main �Լ�
	//�ڹ� ����� �ӽ� : Java Virtual Machine : JVM(=java.exe)
	//main() �Լ��� �ڹ� �ܼ� ���ø����̼��� ������
	/* �� ��Ű���� cmd�� ����Ǵ� ����
	0. cmd�� java.a.b.c.ch1.Ex_1  �Է�
	1. ������ ���� ��ġ(a.b.c.ch1)���� ���� Ex_1.class�� ����
	2. Ex_1.class�� ��ǻ�� �޸𸮿� �ε� (���� ����� �� X)
	3. �ε��� a.b.c.ch1.Ex_1 Ŭ������ main () �Լ� ȣ��
	4. ȣ��� main �Լ� ����� ù ���� ���� ����
	5. System.out.println() ����
	�� �Լ��� �ִ� ����(�ƱԸ�Ʈ)�� �ֿܼ� ���!
	* ���� return �ϴ� ���� �ƴ�!!
	-return : ���� ������ ���� ���� 
	=> ������ ���� ���� �� �� => return��
	- println : ���� ���� Ǫ�� �������� �߰� ���� �˷��� 
	=> ������ ���� ���� �� ��X => return ���� �ƴ�
	*/
	public static void main(String [] args){
		//�ֿܼ� ����Ͻÿ�
		System.out.println("�ڹ� ���� ù��° ���� EX_1!!");
		/*
		System : java.lang.System Ŭ���� �ڹ����α׷����� �����, ������Ƽ 
				 �� �ý��� ���� ���� ����ϴ� Ŭ����
		out : System Ŭ������ �ִ� out �ʵ� (����) : �ֿܼ� ����ϴ� ��� ������ ��
		println() : �ֿܼ� println �Լ��� �ƱԸ�Ʈ�� ����Ʈ �ϴ� �Լ�
				  : ����Ʈ �ϰ� ���� �ϳ��� ���� Ʈ����.
			public void println(String x)
		*/
	}//end of main �Լ�
}//end of EX_1 Ŭ����