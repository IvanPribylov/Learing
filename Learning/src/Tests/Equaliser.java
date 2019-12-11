package Tests;

import static org.testng.Assert.assertEquals;

public class Equaliser {
	
	public static boolean equialTwo (Double first, Double second)
	{
		assertEquals(first, second);
		
	if (first != second) {
		throw new RuntimeException("The values aren't the same");
	}
	else 
	  System.out.println("The values are the same");
	return true;	
	}
	
}
