package Tests.TestFigures;



import org.testng.annotations.Test;

import Tests.dataProviders.ProviderNew;
import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Quadrate;

public class QuadratTest {

	@Test(expectedExceptions = RuntimeException.class, expectedExceptionsMessageRegExp = "The values aren't the same", dataProvider = "dp", dataProviderClass = ProviderNew.class, priority = 0)
	public void checkSquare(Double lengthOne) {
		double trueSquare = Tests.roundUp.round(lengthOne * lengthOne);

		Quadrate quad = new GeometricObjects().getQuadrate(lengthOne);
		double square = Tests.roundUp.round(quad.getSquare());

		Tests.Equaliser.equialTwo(square, trueSquare);
		
	}

	@Test(expectedExceptions = RuntimeException.class, expectedExceptionsMessageRegExp = "The values aren't the same", dataProvider = "dp", dataProviderClass = ProviderNew.class, priority = 1)
	public void checkPerimetr(Double lengthOne) {
		double truePerimetr = Tests.roundUp.round(lengthOne * 4);

		Quadrate quad = new GeometricObjects().getQuadrate(lengthOne);
		double perimetr = Tests.roundUp.round(quad.getPerimeter());

		Tests.Equaliser.equialTwo(perimetr, truePerimetr);

	}

}
