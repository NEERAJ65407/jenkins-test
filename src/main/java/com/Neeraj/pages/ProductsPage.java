package com.Neeraj.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage {
		private By productsHeader = By.xpath("//*[@id=\"inventory_filter_container\"]/div");
		private By addToCartButton = By.cssSelector(".btn_primary.btn_inventory");
		public boolean isProductsHeaderDisplayed(){
			return find(productsHeader).isDisplayed();
		}
		public void clickAddToCartButton(){
				click(addToCartButton);
		}
		public WebElement getAddToCartButton(){
				return find(addToCartButton);
		}
}
