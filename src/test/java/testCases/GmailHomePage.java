package testCases;
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
		
//		String browser = System.getProperty("browser");
		
		WebDriver driver = new ChromeDriver();
		
		/*switch (browser) {
		case "chrome" : 
			driver = new ChromeDriver();
			break;
		case "firefox" :
			driver = new FirefoxDriver();
			break;
		case "edge"	:
			driver = new EdgeDriver();
			break;
		default :
			driver = new InternetExplorerDriver();
			break;
		}
		*/
	//	String web = System.getProperty("url");
		
		driver.get("https://www.gmail.ca");
//		Thread.sleep(1000);
//		driver.findElement(By.id("identifierId")).sendKeys("test@gmail.com");
		
		
		
		Thread.sleep(6000);
		driver.close();
		driver.quit();
		
	}
}
