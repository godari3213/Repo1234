package com.testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class DemoTest1 {
	WebDriver driver;
	
	Logger log = Logger.getLogger(DemoTest1.class);
  @Test
  public void launch() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");
  }
  @Test
  public void register() {
	  String s =driver.getTitle();
//	  Assert.assertEquals(s, "SriniGodari");
//	  System.out.println("good to go");
//	  
  }
	  
}
