package variousConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	static WebDriver driver;
	public static void main(String[] args) {
		
		launchBrowser();
		loginTest();
		tearDown();
		
		launchBrowser();
		NegloginTest();
		tearDown();
		
	}
	
	public static void launchBrowser() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omar Faruk\\June22_Selenium\\crm1\\driver\\chromedriver.exe");
				//System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
				
				driver = new ChromeDriver();
				
				// clear cookies
				driver.manage().deleteAllCookies();
				
				// Get url
				driver.get("https://www.techfios.com/billing/?ng=admin/");
				
				//max window
				driver.manage().window().maximize();
				
				//Apply implicity wait
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		
	}
	public static void loginTest() {
		// Identify user name and insert value
				driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
				
				// Identify password and insert value
				driver.findElement(By.id("password")).sendKeys("abc123");
				
				//identify sign in button and click
				driver.findElement(By.name("login")).click();
		
	}
	public static void NegloginTest() {
		// Identify user name and insert value
				driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
				
				// Identify password and insert value
				driver.findElement(By.id("password")).sendKeys("abc123123");
				
				//identify sign in button and click
				driver.findElement(By.name("login")).click();
		
	}
	public static void tearDown() {
		//driver close
		driver.close();
		
	}

}
