import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailHomePage {

	static {
		 WebDriverManager.chromedriver().setup();
	}
	
	@Test
	public void loadPage() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://gmail.com");
		
		Thread.sleep(9000);
		driver.close();
		driver.quit();
		
	}
}
