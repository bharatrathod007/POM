import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com ");
		
		
		//Navigation Commands
		//driver.navigate().to("https://www.utkarshaaacademy.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.get("https://www.google.com");
		//Thread.sleep(5000);
		driver.close(); 
		//driver.quit();
		}

}
