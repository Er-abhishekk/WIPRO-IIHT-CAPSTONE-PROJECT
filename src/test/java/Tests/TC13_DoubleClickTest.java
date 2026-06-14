package Tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.AutomationPracticePage;

public class TC13_DoubleClickTest extends BaseTest {

	 @Test(priority = 13)
    public void TC13_VerifyDoubleClickAction() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.performDoubleClickAction();

        System.out.println(
                "TC13_VerifyDoubleClickAction PASSED");
    }
}