package kr.hs.dgsw.d220613;

import java.util.Scanner;

public class Number_1026 {
	// 시분초 입력받아 분만 출력하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hms = sc.next();
		String[] arr = hms.split("\\:");

		if (Integer.parseInt(arr[1]) == 0) System.out.printf("0");
		else System.out.println(arr[1]);
	}
}
