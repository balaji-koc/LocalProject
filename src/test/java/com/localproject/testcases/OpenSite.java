package com.localproject.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenSite {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\Roster\\Roster\\Chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.google.com");
	  
  }
}
