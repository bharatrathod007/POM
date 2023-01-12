import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class launch_edge {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");

	}

}
