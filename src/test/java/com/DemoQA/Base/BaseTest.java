package com.DemoQA.Base;

import com.DemoQA.pages.Homepage;
import com.Neeraj.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
		private WebDriver driver;
		protected Homepage homepage;
		protected BasePage basepage;

		@BeforeClass
		public void setUp(){
				driver = new ChromeDriver();
				driver.manage().window().maximize();
		}

		@BeforeClass
		public void loadApplication() {
				driver.get("https://demoqa.com/");
				basepage =  new BasePage();
				basepage.setDriver(driver);
				homepage = new Homepage();
		}

		@AfterClass
		public void tearDown() throws InterruptedException {
				Thread.sleep(2000);
				driver.quit();
		}
}
