package Tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.AutomationPracticePage;

public class TC01_UserinformationTest extends BaseTest {

    @Test(priority = 1)
    public void verifyUserInformation() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.fillUserInformation();
        System.out.println(
                "TC01_UserInformationTest PASSED");
    }
}