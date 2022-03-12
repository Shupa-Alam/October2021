package selenium3;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	WebDriver driver;

	@Before
	public void LaunchBrowser() {


		System.setProperty("webdriver.chrome.driver", "drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}	
		@Test
		public void loginTest()	{
			
		System.out.println("test");
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		    driver.findElement(By.id("password")).sendKeys("abc123");
			driver.findElement(By.name("login")).click();
		}

	

	
		
	


		
	

		
	}


