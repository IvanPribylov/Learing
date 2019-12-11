package Tests.TestFigures;



import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Tests.dataProviders.ProviderNew;
import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Circle;

public class CircleTest {
	@Test(expectedExceptions = RuntimeException.class, expectedExceptionsMessageRegExp = "The values aren't the same", dataProvider = "dp", dataProviderClass = ProviderNew.class)
	@Parameters(value = "formulaIndex")
	public void checkCircumference(@Optional ("") Double formulaIndex, Double lengthOne) {
		double curumTrue = Tests.roundUp.round(Math.PI * formulaIndex * lengthOne);

		Circle circl = new GeometricObjects().getCircle(lengthOne);
		double curum = Tests.roundUp.round(circl.getCircumference());

		Tests.Equaliser.equialTwo(curum, curumTrue);

	}

	@Test(expectedExceptions = RuntimeException.class, expectedExceptionsMessageRegExp = "The values aren't the same", dataProvider = "dp", dataProviderClass = ProviderNew.class)

	public void checkSquare(Double lengthOne) {
		double squareTrue = Tests.roundUp.round(Math.PI * lengthOne * lengthOne);

		Circle circl = new GeometricObjects().getCircle(lengthOne);
		double square = Tests.roundUp.round(circl.getSquare());

		Tests.Equaliser.equialTwo(square, squareTrue);	
		
	}
}

