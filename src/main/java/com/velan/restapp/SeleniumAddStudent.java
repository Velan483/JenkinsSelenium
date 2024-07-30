package com.velan.restapp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAddStudent {

	public static void main(String[] args) {
		
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://localhost:3000/addStud");
		  driver.manage().window().maximize();
	       driver.findElement(By.name("sname")).sendKeys("Bala");
	       driver.findElement(By.name("dept")).sendKeys("AIDS");
	       driver.findElement(By.name("section")).sendKeys("D");
	       driver.findElement(By.name("aid")).sendKeys("18");
	       driver.findElement(By.name("submit")).submit();
	       Alert alert1 = driver.switchTo().alert();
	       System.out.println(alert1.getText());
	       alert1.accept();
	       driver.get(driver.getCurrentUrl() + "/view");
	}
}
