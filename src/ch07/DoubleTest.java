package ch07;

public class DoubleTest {

	public static void main(String[] args) {

		double dnum = 3.14;  // 8바이트
		float fnum = 3.14f;  // 4바이트
		
		for(int i =0; i<10000; i++) {  //매우 근소한 오차가 난다
			dnum = dnum+0.1;
		}
		System.out.println(dnum);
	}

}
