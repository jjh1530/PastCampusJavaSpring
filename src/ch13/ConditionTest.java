package ch13;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int max = (num1>num2)? num1: num2;
		System.out.println(max);
	}

}
