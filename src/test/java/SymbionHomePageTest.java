import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.symbion.pages.SymbionHomePage;
import com.symbion.pages.SymbionLoginPage;
import com.symbion.pages.SymbionTestBase;

public class SymbionHomePageTest extends SymbionTestBase {
	
	SymbionLoginPage LoginPage;
	SymbionHomePage homePage;
	
	public SymbionHomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		Home_Page_Launch();
		LoginPage = new SymbionLoginPage();
		homePage = LoginPage.login(("shop.qa"), ("password"));
}
		
	@Test
	public void OrderingSelection() throws InterruptedException {
		homePage.OrderingMenuSelect();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}


}
