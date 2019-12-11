package Tests;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class roundUp {
	
	public static double round (double oldDouble) {
            
       System.out.println("Old double: " + oldDouble);
        double newDouble = new BigDecimal(oldDouble).setScale(3, RoundingMode.UP).doubleValue();
        System.out.println("New double: " + newDouble);
        return newDouble;

	}

}
