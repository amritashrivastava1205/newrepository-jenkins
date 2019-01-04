package com.ibm.jenkins_1205.com.ibm.jenkins_1205;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class Applaunch{
	public WebDriver driver;

  @Test
  public void f() {
	  System.out.println("Browser is launched");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium Set up files\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://realestate.hommelle.com/");
	  String s = driver.getTitle();
	  String expected = "Real Estate";
	  assertEquals(s,expected);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

} 
