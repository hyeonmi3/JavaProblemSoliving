package kr.hs.dgsw.d220613;

import java.util.Scanner;

public class Number_1025 {
	// 정수 1개 입력받아 나누어 출력하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		int num = Integer.parseInt(n);
		int a = num % 10;
		num -= a;
		int b = (num / 10000) * 10000;
		num -= b;
		int c = (num / 1000) * 1000;
		num -= c;
		int d = (num / 100) * 100;
		num -= d;
		int e = (num / 10) * 10;
		
		System.out.printf("[%d]\n[%d]\n[%d]\n[%d]\n[%d]\n", b, c, d, e, a);
	}
}
