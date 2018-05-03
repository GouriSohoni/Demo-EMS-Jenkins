package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {
	WebDriver driver;
	@Test
		public void TestSSGSWeb() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "e:/program files/java/eclipse/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			driver = new ChromeDriver(options);
			driver.get("http://ssgs-web-app-java.azurewebsites.net/ssgs-ems-profile-editor/");
			WebElement elementName = driver.findElement(By.name("uname"));
			elementName.sendKeys("Gouri");
			elementName.sendKeys(Keys.TAB);
			WebElement elementPwd= driver.findElement(By.name("pwd"));
			elementPwd.sendKeys("Sohoni");
			elementPwd.sendKeys(Keys.TAB);
			WebElement elementLogin = driver.findElement(By.name("submoit"));
			elementLogin.sendKeys(Keys.ENTER);
			assertEquals(true, false);
			Thread.sleep(4000);
			driver.quit();
		}
}
