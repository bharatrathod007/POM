import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framedemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demoqa.com/frames");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		//frame using index
//		//driver.switchTo().frame(2);
//		//frame using name or id
//		//driver.switchTo().frame("frame1");
//		//frame using Webelement
//		WebElement Frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
//		driver.switchTo().frame(Frame1);
//		String frameText = driver.findElement(By.cssSelector("h1#sampleHeading")).getText();
//        System.out.println(frameText);
        driver.get("https://demo.guru99.com/test/guru99home/");
       // WebElement Frame2 = driver.findElement(By.xpath("//iframe[contains(@src,'youtube')]"));
        //driver.switchTo().frame(Frame2);
        driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
       // driver.switchTo().parentFrame();
        driver.switchTo().window(MainWindow);
        driver.switchTo().frame("a077aa5e");
        driver.findElement(By.xpath("//a[contains(@href,'live-selenium-project.html')]//img")).click();
        
	}    

	}
