package com.Neeraj.Test.Products;

import com.Neeraj.Base.BaseTest;
import com.Neeraj.Test.Login.LoginTest;
import com.Neeraj.pages.LoginPage;
import com.Neeraj.pages.ProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProductsTest extends BaseTest {
		private LoginPage loginPage =  new LoginPage();

		@Test
		public void isProductsHeaderVisible(){
				ProductsPage productpage = loginPage.loginIntoApplication("standard_user","secret_sauce");
				Assert.assertTrue(productpage.isProductsHeaderDisplayed(),"\n Product header is displayed");
		}
		@Test
		public void isAddToCartButtonWorking() throws InterruptedException {
				ProductsPage productpage = loginPage.loginIntoApplication("standard_user","secret_sauce");
				productpage.clickAddToCartButton();
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
				wait.wait(6000);
//				wait.until(ExpectedConditions.textToBePresentInElement(productpage.getAddToCartButton(), "REMOVE"));

				String addToCartButtonText = productpage.getAddToCartButton().getText();
				Assert.assertEquals(addToCartButtonText,"REMOVE");
		}
}
