package com.velan.restapp.seleniumwebdriver;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ViewStudentTest {
	
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@BeforeEach
	public void setUp() {
		 driver = new ChromeDriver();
		 js = (JavascriptExecutor) driver;
		 vars = new HashMap<String, Object>();
		}
	
	@AfterEach
	public void tearDown() {
	 driver.quit();
	}
	
	 @Test
	  public void viewTest() {
	    driver.get("http://localhost:3000/");
	    driver.manage().window().setSize(new Dimension(1552, 840));
	    driver.findElement(By.linkText("View Student")).click();
	  }

}
