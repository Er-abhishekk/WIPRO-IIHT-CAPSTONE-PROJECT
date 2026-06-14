package Tests;

import org.testng.annotations.Test;
import Base.BaseTest;
import Pages.AutomationPracticePage;

public class TC04_CountryDropdownTest extends BaseTest {

	 @Test(priority = 4)
    public void verifyCountryDropdown() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.selectCountryFromDropdown();
        System.out.println(
                "TC04_CountryDropdownTest PASSED");
    }
}