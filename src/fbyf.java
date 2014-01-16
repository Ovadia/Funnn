
public class fbyf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		for(int x=5; x>=0; x--)
		{
			//System.out.println("x=" +x);
			if(x==0)
			{
			//System.out.println("x=" +x +" y=0"  +" a=0" + " b=0" /*+" z=0" */);
			System.out.println(count +"__       __");
			spprint(x);
			spprint(0);
			spprint(0);
			spprint(0);
			System.out.println(" __       __");
			System.out.println();	

			count++;
			}
			
			for(int y=x-1; y>=0; y--){
				if(y==0)
					{
					//System.out.println("x=" +x +" y=" +y +" a=0" + " b=0" /*+ " z=0"*/);
					//System.out.println();
					System.out.println(count +"__       __");
					spprint(x);
					spprint(y);
					spprint(0);
					spprint(0);
					System.out.println(" __       __");
					System.out.println();	

					count++;
					}
				
				for(int a=y-1; a>=0; a--){
					if(a==0)
						{
						//System.out.println("x=" +x +" y=" +y +" a=" +a  +" b=0" /*+" z=0" */);
						//System.out.println();
						System.out.println(count +"__       __");
						spprint(x);
						spprint(y);
						spprint(a);
						spprint(0);
						System.out.println(" __       __");
						System.out.println();	

						count++;
						}
					for(int b=a-1; b>=0; b--){
						//if(b==0)
							//{
							//System.out.println("x=" +x +" y=" +y +" a=" +a  +" b=" +b /*+" z=0"*/ );
							System.out.println(count +"__       __");
							spprint(x);
							spprint(y);
							spprint(a);
							spprint(b);
							System.out.println(" __       __");
							System.out.println();	

							count++;
							//	}
					
			//	System.out.println("y=" +y);
					//for(int z=b-1; z>=0; z--)
					//{
						//System.out.println("x=" +x +" y=" +y  +" a=" +a +" b=" +b +" z=" +z);
						//System.out.println();	
					
					//}
					}}}}//for loop closings
		
	
	
	}
	
	public static void spprint(int x)
	{
		if(x==5)
		{
			System.out.println("| 1 0 0 0 0 |");
		}
		else if(x==4)
		{
			System.out.println("| 0 1 0 0 0 |");

		}
		else if(x==3)
		{
			System.out.println("| 0 0 1 0 0 |");
		}
		else if(x==2)
		{
			System.out.println("| 0 0 0 1 0 |");
		}
		else if(x==1)
		{
			System.out.println("| 0 0 0 0 1 |");
		}
		else if(x==0)
		{
			System.out.println("| 0 0 0 0 0 |");
		}
	}
}