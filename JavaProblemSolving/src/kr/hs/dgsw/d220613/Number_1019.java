package kr.hs.dgsw.d220613;

import java.util.Scanner;

public class Number_1019 {
	// CodeUp ������ �Է¹޾� �״�� ����ϱ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		String[] arr = a.split("\\.");
		int A = Integer.valueOf(arr[0]); // String ���� ���ڷ� �����ؼ� �ֱ�
		int B = Integer.valueOf(arr[1]); // ���� �����Ͱ� �ʿ��� �� Integer.parseInt();
		int C = Integer.valueOf(arr[2]); // ��ü�� �ʿ��� �� Integer.valueOf();
		
		System.out.printf("%04d.%02d.%02d", A, B, C);
	}
}
