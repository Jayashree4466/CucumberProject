package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\New folder\\SeleniumProject\\Driver\\chromedriver.exe ");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//webElement
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Greens Technology");
	
}
}
