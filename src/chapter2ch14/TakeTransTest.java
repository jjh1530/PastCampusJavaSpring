package chapter2ch14;

public class TakeTransTest {

	public static void main(String[] args) {

		Student kim = new Student("kim", 10000);
		Student lee = new Student("lee", 8000);
		
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		Subway blue = new Subway(77);
		
		kim.takeBus(bus500);
		lee.takeSubway(blue);
		
		kim.showInfo();
		lee.showInfo();
		bus500.showBusInfo();
		blue.showSubInfo();
		
	}

}
