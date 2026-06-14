package Tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.AutomationPracticePage;

public class TC12_MouseHoverTest extends BaseTest {

	 @Test(priority = 12)
    public void TC12_VerifyMouseHover() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.performMouseHover();

        System.out.println(
                "TC12_VerifyMouseHover PASSED");
    }
}