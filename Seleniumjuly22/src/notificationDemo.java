import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificationDemo {

	public static void main(String[] args) throws IOException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("--headless");
		WebDriver driver = new ChromeDriver(option);
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		FileInputStream fis = new FileInputStream("C:\\Users\\Rohit\\eclipse-workspace\\Seleniumjuly22\\fb.properties");
		Properties prop = new Properties();
		prop.load(fis);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		String userName driver.findElement(By.xpath("//span[contains(text().'Er Bharat Jagannathrao Rathod')]")).getText();
		
		
		

	}

}
