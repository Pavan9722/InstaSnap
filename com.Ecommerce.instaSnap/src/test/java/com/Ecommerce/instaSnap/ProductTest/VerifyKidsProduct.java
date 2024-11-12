package com.Ecommerce.instaSnap.ProductTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyKidsProduct {

	@Test(priority = 1)
	public void createproduct() {
		Reporter.log("Kids Product Created", true);
	}

	@Test(priority = 2, invocationCount = 2, dependsOnMethods = "createProduct", enabled = false)
	public void createupdate() {
		Reporter.log("Kids Product Created", true);
	}
}
