package com.velan.restapp.seleniumwebdriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
class UpdateStudentTest {

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
	public void updateStudentSuccess() {
	 driver.get("http://localhost:3000/update/4");
	 driver.manage().window().setSize(new Dimension(1536, 815));
	 driver.findElement(By.name("sname")).click();
	 driver.findElement(By.name("sname")).sendKeys("Vicky");
	 driver.findElement(By.name("dept")).click();
	 driver.findElement(By.name("dept")).sendKeys("AIDS");
	 driver.findElement(By.name("section")).click();
	 driver.findElement(By.name("section")).sendKeys("A");
	 driver.findElement(By.name("submit")).click();
	 assertEquals("Data Updated Successfully", "Data Updated Successfully");
	}
	
	@Test
	public void updateStudentFailure1() {
	 driver.get("http://localhost:3000/update/4");
	 driver.manage().window().setSize(new Dimension(1536, 815));
	 driver.findElement(By.name("sname")).click();
	 driver.findElement(By.name("sname")).sendKeys("");
	 driver.findElement(By.name("dept")).click();
	 driver.findElement(By.name("dept")).sendKeys("AIDS");
	 driver.findElement(By.name("section")).click();
	 driver.findElement(By.name("section")).sendKeys("A");
	 driver.findElement(By.name("submit")).click();
	 assertEquals("Data Not Updated", "Data Not Updated");
	}
	
	@Test
	public void updateStudentFailure2() {
	 driver.get("http://localhost:3000/update/4");
	 driver.manage().window().setSize(new Dimension(1536, 815));
	 driver.findElement(By.name("sname")).click();
	 driver.findElement(By.name("sname")).sendKeys("Vicky");
	 driver.findElement(By.name("dept")).click();
	 driver.findElement(By.name("dept")).sendKeys("");
	 driver.findElement(By.name("section")).click();
	 driver.findElement(By.name("section")).sendKeys("A");
	 driver.findElement(By.name("submit")).click();
	 assertEquals("Data Not Updated", "Data Not Updated");
	}
	
	@Test
	public void updateStudentFailure3() {
	 driver.get("http://localhost:3000/update/4");
	 driver.manage().window().setSize(new Dimension(1536, 815));
	 driver.findElement(By.name("sname")).click();
	 driver.findElement(By.name("sname")).sendKeys("Vicky");
	 driver.findElement(By.name("dept")).click();
	 driver.findElement(By.name("dept")).sendKeys("AIDS");
	 driver.findElement(By.name("section")).click();
	 driver.findElement(By.name("section")).sendKeys("");
	 driver.findElement(By.name("submit")).click();
	 assertEquals("Data Not Updated", "Data Not Updated");
	}

}
