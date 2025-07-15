package com.Neeraj.Base;

import com.Neeraj.pages.BasePage;
import com.Neeraj.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
		protected WebDriver driver;
		protected BasePage basePage;
		protected String url = "https://www.saucedemo.com/v1/";
		protected LoginPage loginPage;

		@BeforeClass
		public void setUp(){
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(url);
				BasePage basePage = new BasePage();
				basePage.setDriver(driver);
				loginPage = new LoginPage();
		}

		@AfterClass
		public void tearDown() throws InterruptedException {
				Thread.sleep(2000);
				driver.quit();
		}
}
