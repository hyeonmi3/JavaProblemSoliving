package kr.hs.dgsw.d220613;

import java.util.Scanner;

public class Number_1020 {
	// CodeUp �ֹι�ȣ �Է¹޾� ���� �ٲ� ����ϱ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();

		String arr[] = num.split("\\-");
		String a = arr[0];
		String b = arr[1];

		System.out.println(a + b);
	}
}
