package com.instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Balubalaji\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("balu_3218");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Balaji1997@");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div/div[1]/div[1]/div[1]/div/div/div/div/div[3]/div/div/a/div/div[1]/div/div/svg")).click();
		Thread.sleep(3000);
		
		
		
		
		
		driver.close();
		
		

	
	}

}
