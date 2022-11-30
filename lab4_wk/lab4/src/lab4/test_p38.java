package lab4;

public class test_p38 {

	public static void main(String[] args ) {
		ivehicle38[] ivc;
        ivc =new ivehicle38[2];
        
        ivc[0]=new car38(1234,20.5);
        ivc[1] = new plane38(232);
        
        for(int i=0;i<ivc.length;i++)
        {
        	ivc[i].show();
        }
	}
}

interface ivehicle38
{
	int weight =1000;
	void show();
}

class car38 implements ivehicle38 {
	private int num;
	private double gas;
	
	public car38(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
	}
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}

class plane38 implements ivehicle38{
	
	private int flight;
	
	public plane38(int f) {
		flight=f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show()
	{
		System.out.println("飛機的班次是"+flight);
	}
}