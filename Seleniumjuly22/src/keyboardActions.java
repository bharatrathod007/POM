import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement UserName = driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement Usermail = driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement UserCurrentAdd = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		WebElement UserPerAdd = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		WebElement SubmitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
		
//		UserName.sendKeys("Bharat Rathod");
//		UserName.sendKeys("bharatrathod@gamil.com");
//		UserCurrentAdd.sendKeys("Rajegaon");
//		UserPerAdd.sendKeys("At Barabhai Tanda tq Majalgaon");
		//SubmitBtn.click();
		
		Actions act = new Actions(driver);
		act.sendKeys(UserName, "Bharat Rathod").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("bharatrathod@gmail.com").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("at barabhai tanda majalgaon beed 431131").perform();
	
		//select a text
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.build().perform();
		
		act.keyUp(Keys.CONTROL).perform();
		//copy a text
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.build().perform();
		act.keyUp(Keys.CONTROL).perform();
		act.sendKeys(Keys.TAB).perform();
		
		// paste a selected text
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.build().perform();
		act.keyUp(Keys.CONTROL).perform();
		
		act.sendKeys(Keys.TAB).perform();
		act.click(SubmitBtn).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		
	
	
	}

}
