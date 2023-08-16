package com.banking.obs.sampleTestCases;

import org.testng.annotations.Test;

public class ApplyAccount {
	
	
	@Test(groups = "smoke")
	public void createAccount() {
		
		System.out.println("----create account -----");
		
	}
	
	@Test(groups = "regression")
	public void modifyAccount() {
		
		System.out.println("----modify account ----");
		
	}
	
	@Test(groups = "smoke")
	public void deleteAccount() {
		
		System.out.println("---- delete account ----");
	}

}
