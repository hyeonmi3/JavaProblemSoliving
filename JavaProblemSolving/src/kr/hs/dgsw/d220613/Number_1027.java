package kr.hs.dgsw.d220613;

import java.util.Scanner;

public class Number_1027 {
	// ����� �Է� �޾� ���� �ٲ� ����ϱ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ymd = sc.next();
		String[] dmy = ymd.split("\\.");
		
		System.out.printf("%02d-%02d-%04d", Integer.parseInt(dmy[2]), Integer.parseInt(dmy[1]), Integer.parseInt(dmy[0]));
	}
}
