package com.localproject.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckTitle {
	
	WebDriver driver;
	@Test
	void openPageTitle()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Roster\\Roster\\Chromedriver.exe");
			
	     driver= new ChromeDriver();
	     driver.get("http://localhost:8080/examples/jsp/jsp2/jspx/svgexample.html");
	     Assert.assertEquals(driver.getTitle(), "JSP 2.0 SVG Example");
	}

}
