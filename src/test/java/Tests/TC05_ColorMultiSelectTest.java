package Tests;

import org.testng.annotations.Test;
import Base.BaseTest;
import Pages.AutomationPracticePage;

public class TC05_ColorMultiSelectTest extends BaseTest {

	 @Test(priority = 5)
    public void verifyColorMultiSelect() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.selectColorsFromMultiSelect();
        System.out.println(
                "TC05_ColorMultiSelectTest PASSED");
    }
}