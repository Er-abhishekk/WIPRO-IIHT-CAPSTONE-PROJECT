package Tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.AutomationPracticePage;

public class TC20_PaginationTableTest extends BaseTest {

	 @Test(priority = 20)
    public void TC20_VerifyPaginationTable() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.verifyPaginationTable();

        System.out.println(
                "TC20_VerifyPaginationTable PASSED");
    }
}