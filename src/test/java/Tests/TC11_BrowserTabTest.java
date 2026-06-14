package Tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.AutomationPracticePage;

public class TC11_BrowserTabTest extends BaseTest {

	 @Test(priority = 11)
    public void TC11_VerifyBrowserTabHandling() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.handleBrowserTab();

        System.out.println(
                "TC11_VerifyBrowserTabHandling PASSED");
    }
}