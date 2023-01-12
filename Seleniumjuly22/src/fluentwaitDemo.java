import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fluentwaitDemo {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/dynamic-properties");
WebElement colorChangeBtn = driver.findElement(By.xpath("//button[@id='colorChange'] "));
WebElement enableAfterBtn = driver.findElement(By.xpath("//button[@id='enableAfter'] "));
System.out.println("Before button get enable"+enableAfterBtn.isEnabled());
System.out.println("Before visible After Button shown color as"+colorChangeBtn.getCssValue("value")) ;

	}

}
