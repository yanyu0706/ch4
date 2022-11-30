package lab4;

public class test_p41 {

	public static void main(String[] args) {
		car41 car1=new car41(1234,20.5);
		car1.vshow();
		car1.mshow();
	}
}
 
interface ivehicle41{
	void vshow();
}

interface imaterial41{
	void show();
	
}

class car41 implements ivehicle41,imaterial41{
	private int num;
	private double gas;
	
	public car41(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
	}
	
	public void vshow() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	public void mshow() {
		System.out.println("車子的材質是鐵");
	}
}