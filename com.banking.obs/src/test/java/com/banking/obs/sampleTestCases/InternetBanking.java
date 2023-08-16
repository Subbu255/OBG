package com.banking.obs.sampleTestCases;

import org.testng.annotations.Test;

public class InternetBanking {

	@Test(groups = "smoke")
	public void registerInternetBanking() {
		
		System.out.println("---register internet banking ----");
	}
	
	
	@Test(groups = "regression")
	public void loginInternetBanking() {
		
		System.out.println("----login to internet banking ----");
	}
	
	
	@Test(groups = "regression")
	public void modifyInternetBanking() {
		
		System.out.println("--- modify internet banking ----");
	}
	
	@Test(groups = "regression")
	public void transferAmount() {
		
		System.out.println("---- transfer amount -----");
	}
	
	@Test(groups = "smoke", dependsOnMethods = "registerInternetBanking")
	public void deleteInternetBanking() {
		
		System.out.println("----delete internet banking account ----");
	}
	
}
