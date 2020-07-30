package com.localproject.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Cart {

	 WebDriver driver;
	@Test(priority=0)
	void openPage()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Roster\\Roster\\Chromedriver.exe");
			
	     driver= new ChromeDriver();
	     driver.get("http://localhost:8080/examples/jsp/sessions/carts.jsp");
	     //Assert.assertEquals(driver.findElement(By.xpath("/html/body/font[1]/text()")), "You have the following items in your cart:");
	}
	
	@Test(priority=1)
     void selectItem()
     {
		Select s = new Select(driver.findElement(By.name("item")));
		s.selectByIndex(2);
		System.out.println("o/p:"+s.getFirstSelectedOption().getText());
		Assert.assertEquals(s.getFirstSelectedOption().getText(), "Twin peaks tapes");
     }
}
