package com.velan.restapp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAddAttendance {
	
	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver();
	       driver.get("http://localhost:3000/");
	       driver.manage().window().maximize();
	       driver.findElement(By.id("addatt")).click();
	       driver.findElement(By.name("date")).sendKeys("22-07-2024");
	       driver.findElement(By.name("day")).sendKeys("Monday");
	       driver.findElement(By.name("attend")).sendKeys("Monday");
	       driver.findElement(By.name("submit")).submit();
	       Alert alert = driver.switchTo().alert();
	       System.out.println(alert.getText());
	       alert.accept();
	       driver.get(driver.getCurrentUrl() + "/viewAttend");
	}

}
