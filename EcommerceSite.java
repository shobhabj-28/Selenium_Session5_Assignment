package com.ibm.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;


public class EcommerceSite {

	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.jcpenney.com/");
		
		//To accept pop-up page 
		WebElement popUpEle= driver.findElement(By.xpath("//button[contains(.,'Continue Shopping')]"));
		popUpEle.click();
		
		//To search for shirts in search box
		Thread.sleep(5000);
		WebElement searchEle= driver.findElement(By.xpath("//*[@name='searchTerm']"));
		searchEle.sendKeys("shirts");
		
		//To search for keyword=shirts
	    WebElement	searchTextEle= driver.findElement(By.xpath("//button[@title=('search')]"));
	    searchTextEle.click();
	    
	    //To select First shirt from search result
	    Thread.sleep(5000);
	    WebElement firstShirtToBeClickable = driver.findElement(By.xpath("//img[@class='productDisplay_image--default']"));
	    firstShirtToBeClickable.click(); 
	    
	    //To select Size\Color before adding to Bag
	    
	    Select oSelect = new Select(driver.findElement(By.id("SIZE")));
		oSelect.selectByVisibleText("small");
		
		WebElement colorToBeClickable = driver.findElement(By.xpath("//img[@title='Blackwatch Plaid']"));
	    colorToBeClickable.click();
	    
	    //To Select Add To BAG
	    
	    WebElement addToBagEle = driver.findElement(By.xpath("//button[@name=('add to bag')]"));
		addToBagEle.click();
		
		//To Check out
		
		WebElement checkOutEle= driver.findElement(By.id("btncheckout"));
		checkOutEle.click();
		
			}
}
