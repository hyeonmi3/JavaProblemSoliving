package kr.hs.dgsw.d220824;

import java.util.Iterator;
import java.util.Scanner;

public class Step1_10 {
	// 3003
	// BaekJoon 1´Ü°è 10¹ø
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cnt = new int[6];
		int[] full = new int[] { 1, 1, 2, 2, 2, 8 };
		for (int i = 0; i < 6; i++) {
			cnt[i] = sc.nextInt();
		}

		for (int i = 0; i < full.length; i++) {
			cnt[i] = full[i] - cnt[i];
			System.out.printf("%d ",cnt[i]);
		}
	}
}
