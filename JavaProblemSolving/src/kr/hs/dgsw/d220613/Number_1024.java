package kr.hs.dgsw.d220613;

import java.util.Scanner;

public class Number_1024 {
	// �ܾ� 1�� �Է¹޾� ������ ����ϱ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String m = sc.next();
		int len = m.length();

		for (int i = 0; i < len; i++) {
			System.out.printf("\'%c\'\n", m.charAt(i));
		}
	} // charAt�� ���ȳ��ϼ��䡯�� �Է��ߴ�������
	// String�� char�� �ٲ㼭 ���ȡ��� charAt(0)�� ����! ���� ����
}
