package com.velan.restapp.seleniumwebdriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AddStudentTest {

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
	public void addStudentSuccess() {
	 driver.get("http://localhost:3000/addStud");
	 driver.manage().window().setSize(new Dimension(1536, 815));
	 driver.findElement(By.name("sname")).click();
	 driver.findElement(By.name("sname")).sendKeys("Vicky");
	 driver.findElement(By.name("dept")).click();
	 driver.findElement(By.name("dept")).sendKeys("CSE");
	 driver.findElement(By.name("section")).click();
	 driver.findElement(By.name("section")).sendKeys("A");
	 driver.findElement(By.name("aid")).click();
	 driver.findElement(By.name("aid")).sendKeys("54");
	 driver.findElement(By.name("submit")).click();
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
	    assertEquals("Data added Successfully", txt);
	}
	
	@Test
	public void addStudentFailure1() {
	 driver.get("http://localhost:3000/addStud");
	 driver.manage().window().setSize(new Dimension(1536, 815));
	 driver.findElement(By.name("sname")).click();
	 driver.findElement(By.name("sname")).sendKeys("");
	 driver.findElement(By.name("dept")).click();
	 driver.findElement(By.name("dept")).sendKeys("CSE");
	 driver.findElement(By.name("section")).click();
	 driver.findElement(By.name("section")).sendKeys("A");
	 driver.findElement(By.name("aid")).click();
	 driver.findElement(By.name("aid")).sendKeys("54");
	 driver.findElement(By.name("submit")).click();
	 assertEquals("Data Not Added", "Data Not Added");
	}
	
	@Test
	public void addStudentFailure2() {
	 driver.get("http://localhost:3000/addStud");
	 driver.manage().window().setSize(new Dimension(1536, 815));
	 driver.findElement(By.name("sname")).click();
	 driver.findElement(By.name("sname")).sendKeys("Vicky");
	 driver.findElement(By.name("dept")).click();
	 driver.findElement(By.name("dept")).sendKeys("");
	 driver.findElement(By.name("section")).click();
	 driver.findElement(By.name("section")).sendKeys("A");
	 driver.findElement(By.name("aid")).click();
	 driver.findElement(By.name("aid")).sendKeys("54");
	 driver.findElement(By.name("submit")).click();
	 assertEquals("Data Not Added", "Data Not Added");
	}
	
	@Test
	public void addStudentFailure3() {
	 driver.get("http://localhost:3000/addStud");
	 driver.manage().window().setSize(new Dimension(1536, 815));
	 driver.findElement(By.name("sname")).click();
	 driver.findElement(By.name("sname")).sendKeys("Vicky");
	 driver.findElement(By.name("dept")).click();
	 driver.findElement(By.name("dept")).sendKeys("CSE");
	 driver.findElement(By.name("section")).click();
	 driver.findElement(By.name("section")).sendKeys("");
	 driver.findElement(By.name("aid")).click();
	 driver.findElement(By.name("aid")).sendKeys("54");
	 driver.findElement(By.name("submit")).click();
	 assertEquals("Data Not Added", "Data Not Added");
	}
	
	@Test
	public void addStudentFailure4() {
	 driver.get("http://localhost:3000/addStud");
	 driver.manage().window().setSize(new Dimension(1536, 815));
	 driver.findElement(By.name("sname")).click();
	 driver.findElement(By.name("sname")).sendKeys("Vicky");
	 driver.findElement(By.name("dept")).click();
	 driver.findElement(By.name("dept")).sendKeys("CSE");
	 driver.findElement(By.name("section")).click();
	 driver.findElement(By.name("section")).sendKeys("A");
	 driver.findElement(By.name("aid")).click();
	 driver.findElement(By.name("aid")).sendKeys("");
	 driver.findElement(By.name("submit")).click();
	 assertEquals("Data Not Added", "Data Not Added");
	}

}
