package lab4;

public class test_p17 {

	public static void main(String[] args) {
		
		car17 cars[];
		cars=new car17[2];
		
		cars[0]=new car17();
		cars[0].setcar17(1234,20.5);
		
		cars[1]=new racingcar17();
		cars[1].setcar17(4567,30.5);
		
		
		for(int i=0;i<cars.length;i++) {
			cars[i].show();
		}
		
	}
}

class car17{
	
	protected int num;
	protected double gas;
	
	public car17() {
		num=0;
		gas=0;
		System.out.println("生產了車子");
	}
	
	public void setcar17(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"汽油量設為"+gas);
	}
	
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}

class racingcar17 extends car17{
	private int course;
	
	public racingcar17() {
		course=0;
		System.out.println("生產了賽車");
	}
	
	public void setcourse(int c) {
		course=c;
		System.out.println("將賽車編號設為"+course);
	}
	
	public void show() {
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
}
