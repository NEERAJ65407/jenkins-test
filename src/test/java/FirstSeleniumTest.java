import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
		WebDriver driver;
		@BeforeClass
		public void setUp(){
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless=new"); // Use new headless mode (Chrome 109+)
			options.addArguments("--no-sandbox");   // Required in some Jenkins environments
			options.addArguments("--disable-dev-shm-usage"); // Avoid shared memory issues
			WebDriver driver = new ChromeDriver(options);

				driver.manage().window().maximize();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		@AfterClass
		public void tearDown(){
//				driver.quit();
		}
		@Test
		public void testApplication() throws InterruptedException {
				Thread.sleep(6000);
				WebElement username = driver.findElement(By.name("username"));
				username.sendKeys("Admin");
				var password = driver.findElement(By.name("password"));
				password.sendKeys("admin123");
				WebElement login = driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
				login.click();
				Thread.sleep(2000);
				var actualResult = driver.findElement(By.tagName("h6"));
				String expeectedResult = "Dashboard";
				Assert.assertEquals(actualResult.getText(), expeectedResult);
		}
}
