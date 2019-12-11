package Tests;

import org.testng.annotations.Factory;

import Tests.TestFigures.CircleTest;
import Tests.TestFigures.QuadratTest;
import Tests.TestFigures.RectangleTest;

public class NewFactory {
	@Factory()
	public Object[] getTestClasses() {
		Object[] tests = new Object[3];
		tests[0] = new CircleTest();
		tests[1] = new QuadratTest();
		tests[2] = new RectangleTest();
		return tests;
	}

}
