package kr.hs.dgsw.d220613;

import java.util.Scanner;

public class Number_1020 {
	// CodeUp 주민번호 입력받아 형태 바꿔 출력하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();

		String arr[] = num.split("\\-");
		String a = arr[0];
		String b = arr[1];

		System.out.println(a + b);
	}
}
