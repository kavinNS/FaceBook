package org.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\JAVA\\Eclipse program\\FaceBook\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement crt = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
		crt.click();
		Thread.sleep(6000);
		driver.findElement(By.name("firstname")).sendKeys("kavin");
		driver.findElement(By.name("lastname")).sendKeys("gamer");
		driver.findElement(By.name("reg_email__")).sendKeys("kavinpps@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kavinpps@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("password");
		
		WebElement birth = driver.findElement(By.id("day"));
		Select a = new Select(birth);
		a.selectByIndex(7);
		WebElement month = driver.findElement(By.id("month"));
		Select b = new Select(month);
		b.selectByVisibleText("Feb");
		WebElement year = driver.findElement(By.id("year"));
		Select c = new Select(year);
		c.selectByValue("1998");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
 }
}
