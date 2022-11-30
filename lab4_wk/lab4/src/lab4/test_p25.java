package lab4;

public class test_p25 {

	public static void main(String[] args) {
		
	
	car25 car1=new car25();
	car25 car2=new car25();
	
	car25 car3;
	car3=car1;
	System.out.println("car1與car2相同:"+car1.equals(car2));
	System.out.println("car1與car3相同:"+car1.equals(car3));
	}
}

class car25{
	protected int num;
	protected double gas;
	
	public car25() {
		num=0;
		gas=0;
		System.out.println("生產了車子");
	}

}