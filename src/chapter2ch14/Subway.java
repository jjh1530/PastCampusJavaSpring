package chapter2ch14;

public class Subway {

	int subNumber;
	int passengerCount;
	int money;
	public Subway(int subNumber) {
		this.subNumber = subNumber;
		
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showSubInfo() {
		System.out.println(subNumber +"번의 승객은" + passengerCount +"이고 수입은 " + money + "원 이다.");
	}
	
	
}
