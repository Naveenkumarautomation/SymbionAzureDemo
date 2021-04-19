import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.symbion.pages.SymbionHomePage;
import com.symbion.pages.SymbionLoginPage;
import com.symbion.pages.SymbionTestBase;

public class SymbionLoginPageTest extends SymbionTestBase{
	
	public static SymbionLoginPage LoginPage;
	SymbionHomePage homePage;
	
	public SymbionLoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		Home_Page_Launch();
		LoginPage = new SymbionLoginPage();
		
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		homePage = LoginPage.login(("shop.qa"), ("password"));
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}


}
