package com.velan.restapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
 

@SpringBootTest
class SpringBootRestApplicationTests {

	@Test
	@Disabled
	void testMain() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
		assertEquals("React App",driver.getTitle());	
	}
	@Test
	void testAddMovie1() {
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://localhost:3000/addAttend");
		 driver.manage().window().setSize(new Dimension(1536, 815));
		 driver.findElement(By.name("date")).click();
		 driver.findElement(By.name("date")).sendKeys("2024-07-22");
		 driver.findElement(By.name("day")).click();
		 driver.findElement(By.name("day")).sendKeys("Monday");
		 driver.findElement(By.name("attend")).click();
		 driver.findElement(By.name("attend")).sendKeys("Absent");
		 driver.findElement(By.name("submit")).click();
		 assertEquals("Data added Successfully", "Data added Successfully");
	}

	
}
