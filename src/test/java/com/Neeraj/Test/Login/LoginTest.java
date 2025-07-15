package com.Neeraj.Test.Login;

import com.Neeraj.Base.BaseTest;
import com.Neeraj.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
		protected LoginPage loginPage = new LoginPage();

		@Test
		public void testLoginErrorMessage(String username, String password) {
				loginPage.setUsername(username);
				loginPage.setPassword(password);
				loginPage.pressLoginButton();
				var errorButton = loginPage.getErrorButton();
				Assert.assertTrue(errorButton);

		}
}
