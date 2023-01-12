package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeTest {
	public WebDriver driver;
	  @Test
	  public void ChromeTest() {
		  ChromeOptions coption = new ChromeOptions();
		  coption.addArguments("--headless");
		  driver = new ChromeDriver(coption);
		System.out.println("The thread ID for Chrome is"+Thread.currentThread().getId());
		  driver.get("https://www.facebook.com");
		  System.out.println(driver.getTitle());
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		  WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
		  WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		  UserName.sendKeys("bharatrathod4127@yahoo.com");
		  PassWord.sendKeys("9923757644");
		  LoginBtn.click();
	  }
}
