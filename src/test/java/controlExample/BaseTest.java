package controlExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;

	@BeforeTest

	public void launchApp() throws Exception {

		System.out.println("launch application");

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		//driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		driver.get("http://only-testing-blog.blogspot.com/2014/01/new-testing.html?");

		driver.manage().window().maximize();

		//Thread.sleep(4000);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterTest

	public void closeApp() throws Exception {

		System.out.println("close application");

		Thread.sleep(7000);

		driver.close();

		// driver.quit();

	}

}