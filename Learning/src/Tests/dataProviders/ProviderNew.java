package Tests.dataProviders;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ProviderNew {
	@Test(dataProvider = "dp")
	public void providerNew(Double lengthOne) {
	}

	@DataProvider(name = "dp")
	public Object[] dp() {
		return new Object[] { 1.0, 10000.0, 2.5 };
	}
}
