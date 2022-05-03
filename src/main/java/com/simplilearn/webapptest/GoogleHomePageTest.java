package com.simplilearn.webapptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomePageTest {

	public static void main(String[] args) {
		// 1. formulate a test url
				String siteUrl = "https://www.google.com/";
				String driverPath = "driver/windows/chromedriver.exe";
				
				// 2. set selenium system properties
				System.setProperty("webdriver.chrome.driver", driverPath);
				
				// 3. instantiate selenium web driver
				WebDriver driver = new ChromeDriver();
				
				// 4. launch browser
				driver.get(siteUrl);
				
				
				//checking title 
				
				String ExceptedTitle = "Google";
				String actualTitle = driver.getTitle();
				
				System.out.println("Excepted title = "+ExceptedTitle);
				System.out.println("Actual Title = "+actualTitle);
				
				if(actualTitle.equals(ExceptedTitle)) {
					System.out.println("Test is Passed");
				}else {
					System.out.println("Test is failed");
				}
			driver.close();
		}
		

	}


