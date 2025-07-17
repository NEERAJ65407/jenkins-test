package com.DemoQA.Test;

import com.DemoQA.Base.BaseTest;
import com.DemoQA.pages.Homepage;
import org.testng.annotations.Test;

public class HomepageTest extends BaseTest {
		private Homepage homepage;
		@Test
		public void clickFormsCard(){
				homepage = new Homepage();
				homepage.goToFormsPage();
		}

}
