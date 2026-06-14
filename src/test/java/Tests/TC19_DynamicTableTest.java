package Tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.AutomationPracticePage;

public class TC19_DynamicTableTest extends BaseTest {

	 @Test(priority = 19)
    public void TC19_VerifyDynamicWebTable() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.verifyDynamicWebTable();

        System.out.println(
                "TC19_VerifyDynamicWebTable PASSED");
    }
}