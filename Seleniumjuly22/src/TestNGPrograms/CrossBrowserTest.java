package TestNGPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class CrossBrowserTest {
	public WebDriver driver;
  @Test
  public void FBlogin() {
	  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
	  UserName.sendKeys("bharatrathod4127@yahoo.com");
	  PassWord.sendKeys("9923757644");
	  LoginBtn.click();
  }
  @Parameters("browser")
  @BeforeClass
  public void beforeClass(String browser) {
	  if (browser.equalsIgnoreCase("chrome")) {
		  driver = new ChromeDriver();
	  }
	  else if (browser.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
	}
	  else if (browser.equalsIgnoreCase("firefox")) {
		driver = new FirefoxDriver();
	}
	  driver.get("htpps://www.facebook.com");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
