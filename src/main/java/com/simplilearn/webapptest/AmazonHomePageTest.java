package com.simplilearn.webapptest;

import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHomePageTest {

	public static void main(String[] args) {
		
		String siteurl = "https://www.amazon.in/";
		String driverPath = "driver/windows/chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(siteurl);
		
		String Exceptedtitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualtitle = driver.getTitle();
		
		System.out.println("Actual title = "+actualtitle);
		System.out.println("Excepted title = "+Exceptedtitle);
		
		if(actualtitle.equals(Exceptedtitle)) {
			System.out.println("Test is Passed");
		}else {
			System.out.println("Test is failed");
		}
		
		driver.close();
	}

}
