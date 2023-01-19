package ch10;

public class OperatorTest {

	public static void main(String[] args) {

		int score = 150;
		int lastScore = ++score;
		int lastScore2 = score++;
		System.out.println(lastScore);
		System.out.println(lastScore2);
		System.out.println(score);
	}

}
