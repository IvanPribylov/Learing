package Tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Rectangle;

public class RectangleTest {

	@Test(expectedExceptions = RuntimeException.class, expectedExceptionsMessageRegExp = "The values aren't the same", dataProvider = "pr", dataProviderClass = ProviderRectangle.class, priority = 1)
	public void checkRectangle(Double lengthOne, Double lengthTwo) {
		double trueSquare = lengthOne * lengthTwo;

		Rectangle rect = new GeometricObjects().getRectangle(lengthOne, lengthTwo);
		double square = rect.getSquare();

		assertEquals(square, trueSquare);

		if (square != trueSquare) {
			throw new RuntimeException("The values aren't the same");
		}

	}

	@Test(expectedExceptions = RuntimeException.class, expectedExceptionsMessageRegExp = "The values aren't the same", dataProvider = "pr", dataProviderClass = ProviderRectangle.class, priority = 1)
	public void checkPerimetr(Double lengthOne, Double lengthTwo) {
		double truePerimetr = lengthOne * 2 + lengthTwo * 2;

		Rectangle rect = new GeometricObjects().getRectangle(lengthOne, lengthTwo);
		double perimetr = rect.getPerimeter();

		assertEquals(perimetr, truePerimetr);

		if (perimetr != truePerimetr) {
			throw new RuntimeException("The values aren't the same");
		}

	}
}

