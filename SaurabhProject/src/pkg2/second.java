package pkg2;

import pkgg.first;

public class second extends first
{
	
	public static void main(String[] args) 
	{
	
	 second s=(second)new first();  // downcasting
	 s.abc();
     System.out.println("Changes done here");
	 System.out.println("changes done by gitesh now");
	 
	 
	}

}
