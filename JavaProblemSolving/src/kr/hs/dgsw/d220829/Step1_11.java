package kr.hs.dgsw.d220829;

import java.util.Scanner;

public class Step1_11 {
	// 10430
	// BaekJoon 1´Ü°è 11¹ø
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		sc.close();
		
		System.out.println((A+B)%C);
		System.out.println((A%C)+(B%C));
		System.out.println((A*B)%C);
		System.out.println((A%C)*(B%C));
	}
}
