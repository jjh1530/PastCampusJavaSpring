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
		System.out.println(subNumber +"���� �°���" + passengerCount +"�̰� ������ " + money + "�� �̴�.");
	}
	
	
}
