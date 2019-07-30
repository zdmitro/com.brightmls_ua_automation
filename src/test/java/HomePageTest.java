import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest{

    @Test
    public void validHomeTest_OpenHomePage() {
        HomePage homePage = new HomePage(getDriver());
        homePage
                .goToHomePage()
                .checkForGoToHomePage();
    }

    @Test (priority = 1)
    public void validHomeTest_CheckForElements() {
        HomePage homePage = new HomePage(getDriver());
        homePage
                .goToHomePage()
                //.waitForTextToAppear()
                .checkHomepageElementsDisplayed();
    }

    @Test (priority = 2)
    public void validHomeTest_TestForText() {
        HomePage homePage = new HomePage(getDriver());
        homePage
                .goToHomePage()
                //.waitForTextToAppear()
         //       .isElementVisible("Learn how to perform basic tasks, get definitions for fields, statuses and much more. ");
                .isInnerElementVisible("Access the Bright Online Support Center.");
    }


}
