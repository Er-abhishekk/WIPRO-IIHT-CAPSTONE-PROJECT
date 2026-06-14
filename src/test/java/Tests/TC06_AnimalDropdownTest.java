package Tests;

import org.testng.annotations.Test;
import Base.BaseTest;
import Pages.AutomationPracticePage;

public class TC06_AnimalDropdownTest extends BaseTest {

	 @Test(priority = 6)
    public void verifyAnimalDropdown() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.selectAnimalFromSortedList();
        System.out.println(
                "TC06_AnimalDropdownTest PASSED");
    }
}