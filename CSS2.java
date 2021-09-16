package com.dezlearn.qa.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.findElement(By.cssSelector("i.hm-icon")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='Echo & Alexa']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[.='Echo Flex']")).click();
		driver.findElement(By.partialLinkText("Echo Flex")).click();
		Thread.sleep(1000);
		String title = driver.findElement(By.cssSelector("span#productTitle")).getText();
		System.out.println(title);
		if (title.contains("Echo Flex")) {
			System.out.println("Pass");
			
		}
		else {
			System.out.println("Fail");
		}
		driver.quit();
	}

}
