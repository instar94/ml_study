package com.a.b.c; 
// ��Ű���� ����鼭 ���丮�� ���� com �ȿ� a �ȿ� b �ȿ� c
//�ֿܼ����� -d�� ���丮�� ���� �� �� ����
public class HelloWorld {
//HelloWorld��� Ŭ������ ���� ����
	public static void main (String[] args){
		System.out.println("Java HelloWord!!");
		System.out.println("�ڹ� ��Ű�� ������");
		System.out.println("javac -d . HelloWorld.java");
		System.out.println("-d : ���丮�� ���弼�� �ɼ�");
		System.out.println(".: ������丮 �ɼ�");
		System.out.println("java com.a.b.c.HelloWorld");
	}
}
// ��Ű�� ������ 
/*
1. javac �����Ϸ� �����ϱ�
2. -d : ���丮����� �ɼ� d �����ϱ� (-:��������)
3. . : ������丮���� ����(��Ű��)�� ���弼�� 
       ������丮�� ������ �Ϸ��� �ڹ������� �ִ� ��ġ 
4. HelloWorld.java : �������� �ڹ����ϸ��� *Ȯ����*���� �� ���� 
javac -d . HelloWorld.java
*/

// ��Ű�� Ŭ���� �����ϱ�
/*
1. java ���࿣�� �����ϱ�
2. �������� �ڹ�ȭ�� ��ġ���� ��Ű����+Ŭ������ ���� (Ȯ���ڸ� XX)
3. ��Ű����+Ŭ������
   ��Ű���� : com.a.b.c
   Ŭ������ : HelloWorld
java com.a.b.c.HelloWorld

Type�� ���Ѵٸ� �ش� ��ġ���� cd �ؼ� ������

*/