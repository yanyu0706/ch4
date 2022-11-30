package lab4;

public class test_p14 {

	public static void main(String[] args) {
	car14 car1;
	car1=new racingcar14();
	
	car1.setcar14(1234,20.5);
	car1.show();
	}
}


class car14{
	protected int num;
	protected double gas;
	
	public car14() {
		num=0;
		gas=0;
		System.out.println("生產了車子");
	}
	
	public void setcar14(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"汽油量設為"+gas);
	}
	
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	
}

class racingcar14 extends car14{
	
	private int course;
	
	public racingcar14() {
		course=0;
		System.out.println("生產了賽車");
	}
	
	public void setcourse14(int c) {
		course=c;
		System.out.println("將賽車編號設為"+course);
	}
	
	public void show() {
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
}