package Tests;

import static org.testng.Assert.assertEquals;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Circle;

public class CircleTest {
	@Test(expectedExceptions = RuntimeException.class, expectedExceptionsMessageRegExp = "The values aren't the same", dataProvider = "dp", dataProviderClass = ProviderNew.class)
	@Parameters(value = "formulaIndex")
	public void checkCircumference(Double lengthOne, Double formulaIndex) {
		double curumTrue = Math.PI * formulaIndex * lengthOne;

		Circle circl = new GeometricObjects().getCircle(lengthOne);
		double curum = circl.getCircumference();

		assertEquals(curum, curumTrue);
		if (curum != curumTrue) {
			throw new RuntimeException("The values aren't the same");
		}

	}

	@Test(expectedExceptions = RuntimeException.class, expectedExceptionsMessageRegExp = "The values aren't the same", dataProvider = "dp", dataProviderClass = ProviderNew.class, dependsOnMethods = {
			"checkCircumference" })

	public void checkSquare(Double lengthOne) {
		double squareTrue = Math.PI * lengthOne * lengthOne;

		Circle circl = new GeometricObjects().getCircle(lengthOne);
		double square = circl.getSquare();

		assertEquals(square, squareTrue);

		if (square != squareTrue) {
			throw new RuntimeException("The values aren't the same");
		}
		
		
		
		
	}
}

