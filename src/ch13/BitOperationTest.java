package ch13;

public class BitOperationTest {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 10;
		
		//2진수를 연산
		System.out.println(num1 | num2); // or
		System.out.println(num1 & num2); // and
		System.out.println(num1 ^ num2); // not
		System.out.println(~num1);  // 모두 반대에 음수로 계산
		
		System.out.println(num1<<2);
		System.out.println(num1 <<= 2);
		System.out.println(num1);
	}

}
