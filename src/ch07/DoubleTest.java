package ch07;

public class DoubleTest {

	public static void main(String[] args) {

		double dnum = 3.14;  // 8����Ʈ
		float fnum = 3.14f;  // 4����Ʈ
		
		for(int i =0; i<10000; i++) {  //�ſ� �ټ��� ������ ����
			dnum = dnum+0.1;
		}
		System.out.println(dnum);
	}

}
