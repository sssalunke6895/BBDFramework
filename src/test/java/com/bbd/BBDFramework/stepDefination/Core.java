package com.bbd.BBDFramework.stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Core {
	
	public static WebDriver driver;

	public WebDriver setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
	}
	public void tearDown()
	{
		driver.close();
		driver.quit();
		
	}
}
