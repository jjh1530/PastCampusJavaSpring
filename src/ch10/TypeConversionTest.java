package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
		
		int iNum = 255;
		byte bNum = (byte)iNum;
		
		
		System.out.println(bNum); //강제 캐스팅시 값이 이상하면 -1]
		
		double dNum = 3.14;
		int inum = (int)dNum;
		
		System.out.println(inum);
		
		double dNum2 = 1.2;
		float fNum = 0.9F;
		
		int num1 = (int)dNum2+(int) fNum;  // 1 +0
		int num2 = (int)(dNum2+fNum);  // 2.1
		
		System.out.println(num1);
		System.out.println(num2);
		
		int myNum = 10;
		int yourNum = 20;
		
		myNum = myNum + yourNum;
		System.out.println(myNum);
	}

}
