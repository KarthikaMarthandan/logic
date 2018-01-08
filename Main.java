package abstrac;

public class Main extends Abs{

	public int multiply(int a,int b)
	{
	return a*b;
	}
	public static void main(String[] args) {
	
	
	  Abs m=new Main();
	  System.out.println(m.multiply(6,7));
	  m.display(); 
      
}

}



