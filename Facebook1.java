package com.ibm.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Facebook1 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement emailEle = driver.findElement(By.xpath("//*[@name='email']"));
		emailEle.sendKeys("balaji0017gmail.com");
		
		WebElement passWordEle = driver.findElement(By.xpath("//*[@name='pass']"));
		passWordEle.sendKeys("Welcome123");
		
		WebElement loginEle= driver.findElement(By.xpath("//input[@value='Log In']"));
		loginEle.click();
		
}
}
