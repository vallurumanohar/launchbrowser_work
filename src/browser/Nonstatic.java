package browser;

public class Nonstatic {

	public int x,y,z;
	
	public void addition()
	
	{
		x=56;
		y=7;
		z=x+y;
		System.out.println(z);
	}
	public void mulltiplication()
	{
		x=56;
		y=7;
		z=x*y;
		System.out.println(z);
	}
	
	public static void main(String[]args) {
		
		Nonstatic obj =new Nonstatic();
	
	obj.addition();
	
	obj.mulltiplication();
				

	}

}
