package Tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Quadrate;

public class QuadratTest {

	@Test(expectedExceptions = RuntimeException.class, expectedExceptionsMessageRegExp = "The values aren't the same", dataProvider = "dp", dataProviderClass = ProviderNew.class, priority = 0)
	public void checkSquare(Double lengthOne) {
		double trueSquare = lengthOne * lengthOne;

		Quadrate quad = new GeometricObjects().getQuadrate(lengthOne);
		double square = quad.getSquare();

		assertEquals(square, trueSquare);

		if (square != trueSquare) {
			throw new RuntimeException("The values aren't the same");
		}
	}

	@Test(expectedExceptions = RuntimeException.class, expectedExceptionsMessageRegExp = "The values aren't the same", dataProvider = "dp", dataProviderClass = ProviderNew.class, priority = 1)
	public void checkPerimetr(Double lengthOne) {
		double truePerimetr = lengthOne * 4;

		Quadrate quad = new GeometricObjects().getQuadrate(lengthOne);
		double perimetr = quad.getPerimeter();

		assertEquals(perimetr, truePerimetr);

		if (perimetr != truePerimetr) {
			throw new RuntimeException("The values aren't the same");
		}

	}

}
