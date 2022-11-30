package lab4;

public class test_p29 {

	public static void main(String[] args) {
		
		vehicle29[] vc =new vehicle29[2];
		
		vc[0]=new car29(1234,20.5);
		vc[0].setspeed29(60);
		
		vc[1]=new plane29(232);
		vc[1].setspeed29(500);
	
	for(int i=0;i<vc.length;i++)
	{
		vc[i].show();
	}
	}
}

abstract class vehicle29 {
	protected int speed;
	
	public void setspeed29(int s)
	{
		speed=s;
		System.out.println("將速度設為"+speed+"了");
	}
	abstract void show();
}

class car29 extends vehicle29{
	private int num;
	private double gas;
	
	public car29(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("速度是"+speed);
	}
}

class plane29 extends vehicle29{
	private int flight;
	
	public plane29(int f) {
		flight =f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show() {
		System.out.println("飛機的班次是"+flight);
		System.out.println("速度是"+speed);
	}
}