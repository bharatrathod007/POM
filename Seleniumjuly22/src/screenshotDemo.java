import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotDemo {

	public static void main(String[] args) throws IOException  
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcfile, new File("C:\\Users\\Rohit\\eclipse-workspace\\Seleniumjuly22\\sreenshot\\"+timestamp()+".jpeg"));
	}
		public static String timestamp () {
			return new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
			
	}
}


