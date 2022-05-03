package com.simplilearn.webapptest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchTest {

	public static void main(String[] args) {
		String siteurl = "https://www.amazon.in/";
		String driverPath = "driver/windows/chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(siteurl);

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Iphone 12 max pro");
		searchBox.submit();
		
		String expectedTitle = "Amazon.in : Iphone 12 max pro";
		String actualTitle = driver.getTitle();
		
		System.out.println("Expected Title : "+expectedTitle);
		System.out.println("Actual Title : "+actualTitle);
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test is passed !");
		} else {
			System.out.println("Test is failed !");
		}
		
		// 6. close driver
		driver.close();

	}

}
