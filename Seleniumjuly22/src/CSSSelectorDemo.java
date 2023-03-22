import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://utkarshaaacademy.com");
		driver.manage().window().maximize();
		// css Selector with parent child relationship
		driver.findElement(By.cssSelector("nav>ul>li>a[title='Automation Practice']")).click();
		
		//Css selector
		
		driver.findElement(By.cssSelector("#name-firstname")).sendKeys("Bharat");
		//driver.findElement(By.cssSelector("input[id='name=fristname']")).sendKeys("Bharat");
			
		 //driver.findElement(By.cssSelector("input[class='coblocks-field coblocks-field--name last']")).sendKeys("Rathod");
	driver.findElement(By.cssSelector("input.coblocks-field.coblocks-field--name.last")).sendKeys("Rathod");
	driver.findElement(By.cssSelector("input[name='field-phone[value]']")).sendKeys("9112121122");
	//driver.findElement(By.cssSelector("button[class='wp-block-search__button wp-element-button']")).click();
	//css selector with combinations
	//driver.findElement(By.cssSelector("input.coblocks-field--email#email")).sendKeys("bharatrathod@gmail.com");
	//css selector with id along with other attribute
	driver.findElement(By.cssSelector("input#email[type='email']")).sendKeys("bharatrathod@gmail.com");
	driver.get("https:www.facebook.com");
		driver.findElement(By.cssSelector("div._6ltg>button")).click();
		driver.get("https://demoqa.com/select-menu");
		driver.findElement(By.cssSelector("select>option:nth-of-type(5)")).click();
	}

}
