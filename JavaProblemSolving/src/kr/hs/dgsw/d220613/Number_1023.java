package kr.hs.dgsw.d220613;

import java.util.Scanner;

public class Number_1023 {
	// CodeUp �Ǽ� 1�� �Է¹޾� �κк��� ����ϱ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();

		String arr[] = n.split("\\.");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);

		System.out.printf("%d\n%d", a, b);
	}
}
