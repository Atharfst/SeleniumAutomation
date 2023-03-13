package LoginHrm;

//Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class LoginTest {
private WebDriver driver;
private Map<String, Object> vars;
JavascriptExecutor js;
@Before
public void setUp() {
	
	
	
	//webdriver.chrome.driver system property
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Student\\Downloads\\chromedriver\\chromedriver.exe");
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Student\\Downloads\\chromedriver_win32 (2)_105\\chromedriver.exe");
	
	
	
	//webDriverManager 
	WebDriverManager.chromedriver().setup();    //resolve driver issue
	//WebDriverManager.chromedriver().create()   //for version above 5
	
 driver = new ChromeDriver();    //launch chrome browser
 js = (JavascriptExecutor) driver;
 vars = new HashMap<String, Object>();
}
@After
public void tearDown() {
 driver.quit();
}
@Test
public void test1() throws InterruptedException {
 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 Thread.sleep(4000);
 driver.findElement(By.name("password")).sendKeys("1234");
 driver.findElement(By.cssSelector(".oxd-button")).click();
 
 Thread.sleep(4000);
}
}