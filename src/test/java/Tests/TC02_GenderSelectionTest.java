package Tests;

import org.testng.annotations.Test;
import Base.BaseTest;
import Pages.AutomationPracticePage;

public class TC02_GenderSelectionTest extends BaseTest {

	 @Test(priority = 2)
    public void verifyGenderSelection() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.selectGender();
        System.out.println(
                "TC02_GenderSelectionTest PASSED");
        
    }
}
