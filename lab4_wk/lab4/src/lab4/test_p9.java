package lab4;

public class test_p9 {

	public static void main(String[] args) {
		
		racingcar9 car9;
		car9=new racingcar9();
		
		car9.newshow();
		
		
	}
}


class car9{
	protected int num;
	protected double gas;
	
	public car9() {
		num=0;
		gas=0;
		System.out.println("生產了車子");
	}
	public void setcar9(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"汽油量設為"+gas);
	}
	
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}

class racingcar9 extends car9
{
	private int course;
	
	public racingcar9() {
		course=0;
		System.out.println("生產了賽車");
		
	}
	
	public void setcaorse9(int c) {
		course =c;
		System.out.println("將賽車邊號設為"+course);
	}
	public void newshow()
	{
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
}