package Tests.TestFigures;



import org.testng.annotations.Test;

import Tests.dataProviders.ProviderRectangle;
import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Rectangle;

public class RectangleTest {

	@Test(expectedExceptions = RuntimeException.class, expectedExceptionsMessageRegExp = "The values aren't the same", dataProvider = "pr", dataProviderClass = ProviderRectangle.class, priority = 1)
	public void checkRectangle(Double lengthOne, Double lengthTwo) {
		double trueSquare = Tests.roundUp.round(lengthOne * lengthTwo);

		Rectangle rect = new GeometricObjects().getRectangle(lengthOne, lengthTwo);
		double square = Tests.roundUp.round(rect.getSquare());
		
		Tests.Equaliser.equialTwo(square, trueSquare);
		
		}

	@Test(expectedExceptions = RuntimeException.class, expectedExceptionsMessageRegExp = "The values aren't the same", dataProvider = "pr", dataProviderClass = ProviderRectangle.class, priority = 1)
	public void checkPerimetr(Double lengthOne, Double lengthTwo) {
		double truePerimetr = Tests.roundUp.round(lengthOne * 2 + lengthTwo * 2);

		Rectangle rect = new GeometricObjects().getRectangle(lengthOne, lengthTwo);
		double perimetr = Tests.roundUp.round(rect.getPerimeter());
		
		Tests.Equaliser.equialTwo(perimetr, truePerimetr);
	
	}
}

