package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class secend {
	
	public WebDriver driver;
@Test
public void launchTest() {
	 driver = new ChromeDriver();
	driver.get("htpps://www.facebook.com");
	
}
@Test
public void loginTest() {
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9112121122");
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456789");
driver.findElement(By.xpath("button")).click();
}
}
