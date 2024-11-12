package com.Ecommerce.instaSnap.ProductTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyElectronicProduct {

	@Test(priority = 1)
	public void createproduct() {
		Reporter.log("Electronic Product Created", true);
	}

	@Test(priority = 2, invocationCount = 2, dependsOnMethods = "createProduct", enabled = false)
	public void createupdate() {
		Reporter.log("Electronic Product Created", true);
	}
}
