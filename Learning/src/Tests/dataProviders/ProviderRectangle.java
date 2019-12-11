package Tests.dataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProviderRectangle {
	@Test(dataProvider = "pr")
	public void providerRetangle(Double lengthOnen, Double lengthTwo) {
	}

	@DataProvider(name = "pr")
	public Object[][] pr() {
		return new Object[][] { new Object[] { 2.0, 2.0 }, new Object[] { 10000, 2.0 }, new Object[] { 2.5, 2.0 },

				new Object[] { 2.0, 10000 }, new Object[] { 10000, 10000 }, new Object[] { 2.5, 10000 },

				new Object[] { 2.0, 2.5 }, new Object[] { 10000, 2.5 }, new Object[] { 2.5, 2.5 } };

	}

}

