package com.DemoQA.pages;

import com.Neeraj.pages.BasePage;
import org.openqa.selenium.By;

public class Homepage extends BasePage {
		private By formsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
		public Formspage goToFormsPage(){
				click(formsCard);
				return new Formspage();
		}
}
