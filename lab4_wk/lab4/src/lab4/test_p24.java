package lab4;

public class test_p24 {

	public static void main(String[] args) {
		
		car24 car1;
		car1 =new car24();
		
		car1.setcar24(1234, 20.5);
		System.out.println(car1);
		
	}
}

class car24{
	
	protected int num;
	protected double gas;
	
	public car24() {
		num=0;
		gas=0;
		System.out.println("生產了車子");
	}
	public void setcar24(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"汽油量設為"+gas);
	}
	
	public String  toString24() {
		String str="車號"+num+"汽油量"+gas;
		return str;
	}
}
