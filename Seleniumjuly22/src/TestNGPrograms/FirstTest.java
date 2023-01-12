package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
	public WebDriver driver;
  @Test
  public void bharat() {
	  System.out.println("Hi i am Bharat");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
  }
}
