//package
package a.b.c.ch3;
//import

public class ExFlow_1{
	//���
	//�������
	//������
	
	//�Լ�
	
	//main() �Լ� : ���α׷� ������
	public static void main(String[] args){ 
		//TODO Auto-generated method stub.
		
		//if���� ���� : if (){}
		//() : ���ǽ��� ���� ��
		//if ���� ������ true�϶��� ������
		//���ǹ� Ȥ�� ������ ��� true������
		//������ �����򰡰� �߻� �� �� �ִ�. -> ���α׷��� ���� �� �� �ִ�.

		//if�� ������ true ���߸� ���ư���.
		if (true){
			System.out.println("if���� ���ǽ��� ����� true�� ��쿡�� ����ȴ�.");	
		}

		//if�� ������ false�� ���ư��� �ʴ´�.
		//else�� �����ϸ� if�� ������ false�϶� ���ư���.
		if (false){
			
		}else{
			System.out.println("else���� if���� ���ǽ��� ����� false�϶��� ����ȴ�.");
		}

		//�����ڷ��� (boolean) �������� bool�� �����ϰ�
		//�� ���� false�� �ʱ�ȭ
		boolean bool = false;

		if (!bool){ //!bool=true / ������ �� �Լ������� �ѽ������� true�� ��������
			System.out.println("if���� ���ǽ��� ����� true�� ��쿡�� ����ȴ�.");
		}

		if (bool){ //<=bool�� false �̱� ������ else���� �����
				  //���� if������ !bool�� �ߴٰ� bool�� true�� ���Ե� ���� �ƴϴ�.
		}else{
			System.out.println("else ���� if���� ���ǽ��� ����� false �϶� ����ȴ�.");
		}
		

		//if�� ���� true�϶���
		//else�� ���� false �϶���
		//=> true�� false�� �ƴ� ���� ���� ������ ����
		int x = 1;
		int y = 0;
		int sum = x / y; //1 ������ 0�� �������� ����

		if(sum>0){
			
		}
	}//end of main �Լ�
}//end of ExFlow_1
