
public class thetest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	boolean x=false, y=false, g=true;
	if(!x || !y || g)
	{
	System.out.println("TRUE");
	}
	else
	{
	System.out.println("FALSE");
	}

	
	if(!x || y || !g)
	{
	System.out.println("TRUE");
	}
	else
	{
	System.out.println("FALSE");
	}
	if(x || !y || !g) 
	{
	System.out.println("TRUE");
	}
	else
	{
	System.out.println("FALSE");
	}
				
	if (x || y || !g)
	{
	System.out.println("TRUE");
	}
	else
	{
	System.out.println("FALSE");
	}
	
}}
