package a.b.c.ch1;

public class �赿�� {

	//��� ���� ����
	// name�� role�̶�� ���ڿ� ������� ����
	public String name;
	public String role;

	//������
	//�赿��(String role) ��ü�� ����
	//.role�̶� �Ϳ��ٰ� String role�� �־��ּ���
	public �赿�� (String role){
		this.role = role;
	}

	//main �Լ� ���� (�ܼ� ������ ������)
	public static void main(String [] args){

	//�赿�� ����
	//�赿�� Ŭ���� 
	//�����̶� ����
	//new �赿��()�� �̿��� �赿��()��� ��ü�� �����
	//�� �ȿ� "������" �̶�� ���� ���� ����

	//����.role
	//���� = �ּҰ�(@15db9742)�� ������
	// �� �ּ� ���� �赿���̶� Ŭ������ ���� �ּ��� = �赿���̶� Ŭ���� ȣ��
	//.role = �赿�� (String role)�� �� String role�� ������
	// String role�� �������̵�
	// ����.role = �赿��("������") = ������
	�赿�� ���� = new �赿��("������");
	System.out.println("����>>>>"+����);
	System.out.println("����.role >>>"+����.role);

	�赿�� ģ�� = new �赿��("ī���?");
	System.out.println("ģ��>>>>"+ģ��);
	System.out.println("ģ��.role >>>>"+ģ��.role);

	�赿�� ���� = new �赿��("���ΰ�?");
	System.out.println("����>>>>"+����);
	System.out.println("����.role >>>>"+����.role);

	}// end of main �Լ�
} // end of �赿�� Ŭ���� 