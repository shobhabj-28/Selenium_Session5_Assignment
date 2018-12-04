package com.ibm.seleniumconcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement firstNameEle= driver.findElement(By.xpath("//*[@name='firstname']"));
		firstNameEle.sendKeys("shobha");
		
		WebElement surNameEle= driver.findElement(By.xpath("//*[@name='lastname']"));
		surNameEle.sendKeys("bangalore");
		
		WebElement mobileNumberEle= driver.findElement(By.xpath("//*[@name='reg_email__']"));
		mobileNumberEle.sendKeys("9900387464");
		
		WebElement newpasswordEle= driver.findElement(By.xpath("//*[@name='reg_passwd__']"));
		newpasswordEle.sendKeys("Welcome123");
		
		//Not allowing to jump to Signup- Website will ask for Gender selection
		WebElement radioButtonFemalEle=driver.findElement(By.xpath("//input[@value='1']"));
		radioButtonFemalEle.click();
		
		//A pop will shown to select OB is correct or not(manually given as yes
		WebElement signUpEle= driver.findElement(By.xpath("//*[@name='websubmit']"));
		signUpEle.click();
	}	
}
