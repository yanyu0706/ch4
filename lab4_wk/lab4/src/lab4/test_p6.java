package lab4;

public class test_p6 {

	public static void main(String[] args) {
		racingcar6 car6;
		car6=new racingcar6(1234,20.5,5);
	}
}

class car6
{
	private int num;
	private double gas;
	
	public car6() {
		num=0;
		gas=0;
		System.out.println("生產了車子");
	}
	public car6(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+" 汽油量為"+gas+"的車");
		
	}
	
	public void setcar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+" 汽油量設為"+gas);
	}
	
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}

class racingcar6 extends car6{
	private int course;
	public racingcar6()
	{
		course=0;
		System.out.println("生產了賽車");
	}
	
	public racingcar6(int n,double g,int c) {
		super(n,g);
		course =c;
		System.out.println("生產了編號為"+course+"的賽車");
	}
	public void setcourse(int c) {
		course =c;
		System.out.println("將賽車編號設為"+course);
	}
}