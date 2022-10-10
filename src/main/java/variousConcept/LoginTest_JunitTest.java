package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_JunitTest {

	WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before Class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("after Class");
	}

	@Before
	public void LaunchBrowser() {
		System.out.println("@before");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Omar Faruk\\June22_Selenium\\crm1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.techfios.com/billing/?ng=admin/\r\n");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test

	public void LoginTest() {
		System.out.println("@Test1");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();

	}

	@Test
	public void NegLoginTest() {
		System.out.println("@Test2");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc1234");
		driver.findElement(By.name("login")).click();

	}

	@After
	public void TearDown() {
		System.out.println("@After");
		driver.close();
		driver.quit();

	}

}
