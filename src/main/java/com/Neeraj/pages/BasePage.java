package com.Neeraj.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
		public static WebDriver driver;
		public void setDriver(WebDriver driver) {
				BasePage.driver = driver;
		}
		public WebElement find(By locator) {
				return driver.findElement(locator);
		}
		protected void set(By locator, String value) {
				driver.findElement(locator).clear();
				driver.findElement(locator).sendKeys(value);
		}
		protected void click(By locator) {
				driver.findElement(locator).click();
		}
}
