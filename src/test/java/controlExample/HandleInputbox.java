package controlExample;

import java.util.concurrent.TimeUnit;

//import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandleInputbox extends BaseTest {

	// WebDriver driver;

	//

	// @Before

	// public void launchApp() {

	//

	// System.out.println("launch application");

	//

	// WebDriverManager.chromedriver().setup();

	// driver = new ChromeDriver();

	//

	// driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");

	//

	// driver.manage().window().maximize();

	//

	//

	// }

	//

	//

	// @After

	// public void closeApp() throws Exception {

	//

	// System.out.println("close application");

	// Thread.sleep(7000);

	// driver.close();

	// //driver.quit();

	//

	// }

	@Test

	public void verifyInput() throws Exception {

		// xpath/css
		
		WebDriverWait wait = new WebDriverWait(driver, 120);            //seconds //maximum time 

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id='text3']")));
                  //seconds //maximum time 
        wait.until(ExpectedConditions.alertIsPresent());
//        
        
        
        
        System.out.println(driver.switchTo().alert().getText());
        
        Thread.sleep(1000);
        
        driver.switchTo().alert().accept();
        

		//driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("enter username");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.cssSelector("input[id='text3']")).sendKeys("hidden test");
		

	}

}