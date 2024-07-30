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
class FindStudentTest {

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
	  public void findTest() {
	    driver.get("http://localhost:3000/");
	    driver.manage().window().setSize(new Dimension(1536, 815));
	    driver.findElement(By.cssSelector("li:nth-child(6) .btn")).click();
	    driver.findElement(By.id("search")).click();
	    driver.findElement(By.id("search")).sendKeys("4");
	    driver.findElement(By.cssSelector(".btn-primary")).click();
	  }

}
