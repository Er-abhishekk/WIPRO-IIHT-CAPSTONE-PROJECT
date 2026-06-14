package Tests;

import org.testng.annotations.Test;
import Base.BaseTest;
import Pages.AutomationPracticePage;

public class TC09_ConfirmationAlertTest extends BaseTest {

	 @Test(priority = 9)
    public void verifyConfirmationAlert() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.handleConfirmationAlert();
        System.out.println(
                "TC09_ConfirmationAlertTestt PASSED");
    }
}