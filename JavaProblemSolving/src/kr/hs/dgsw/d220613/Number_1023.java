package kr.hs.dgsw.d220613;

import java.util.Scanner;

public class Number_1023 {
	// CodeUp 실수 1개 입력받아 부분별로 출력하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();

		String arr[] = n.split("\\.");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);

		System.out.printf("%d\n%d", a, b);
	}
}
