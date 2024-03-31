package com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProject {
	
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Seleninum\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		driver.findElement(By.xpath("//span[text()='Mobile Accessories']")).click();
		
		Thread.sleep(2000);
		
		WebElement penDrive = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[1]"));
		penDrive.click();
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();",penDrive);
//		js.executeScript("window.scrollBy(0-200)");
//		
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[1]")).click();
		
		driver.findElement(By.xpath("(//span[@class='a-badge-text'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
		
		WebElement Mail = driver.findElement(By.xpath("//input[@type='email']"));
		Mail.sendKeys("9345866702");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("Nandha@183");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		driver.findElement(By.xpath("(//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent'])[1]")).click();
		
		
	
	}

}
