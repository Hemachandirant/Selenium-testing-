package com.simplilearn.webapptest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
		String siteurl = "https://www.google.com/";
		String driverPath = "driver/windows/chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get(siteurl);
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Microsoft net Worth");
		searchBox.submit();
		
		String exceptedtitle = "Microsoft Net Worth - Google Search";
		String actualtitle = driver.getTitle();
		System.out.println("Excepted title : "+exceptedtitle);
		System.out.println("Actual Title : "+actualtitle);
		if(actualtitle.equals(exceptedtitle)) {
			System.out.println("Test is Passed");
		}else {
			System.out.println("Test is Failed");
		}
		driver.close();
	}

}
