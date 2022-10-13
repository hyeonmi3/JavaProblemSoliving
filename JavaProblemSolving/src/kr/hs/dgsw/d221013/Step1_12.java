package kr.hs.dgsw.d221013;

import java.util.Scanner;

public class Step1_12 {
	// 2588
	// BaekJoon 1´Ü°è 12¹ø
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String first_value = sc.next();
		String second_value = sc.next();
		
		String second_value_split[] = second_value.split("");
		
		System.out.println(Integer.parseInt(first_value) * Integer.parseInt(second_value_split[2]));
		System.out.println(Integer.parseInt(first_value) * Integer.parseInt(second_value_split[1]));
		System.out.println(Integer.parseInt(first_value) * Integer.parseInt(second_value_split[0]));
		System.out.println(Integer.parseInt(first_value) * Integer.parseInt(second_value));
	}
}