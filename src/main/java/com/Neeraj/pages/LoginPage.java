package com.Neeraj.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
		private By usernameField = By.id("user-name") ;
		private By passwordField = By.id("password") ;
		private By loginButton = By.id("login-button") ;
		private By errorMessage = By.xpath("//button[@class='error-button']");

		public void setUsername(String username){
				set(usernameField,username);
		}

		public void setPassword(String password){
				set(passwordField,password);
		}

		public ProductsPage pressLoginButton(){
				click(loginButton);
				return new ProductsPage();
		}

		public ProductsPage loginIntoApplication(String username, String password){
			setUsername(username);
			setPassword(password);
			return pressLoginButton();
		}

		public boolean getErrorButton(){
				return find(errorMessage).isDisplayed();
		}


}
