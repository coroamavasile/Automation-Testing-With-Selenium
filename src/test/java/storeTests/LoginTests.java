package storeTests;

import org.junit.Test;

public class LoginTests extends BasedTests{

    @Test
    public void shoudSuccessfullyLogin()
    {
        homePage.clickSingInButton();
        authentificationPage.enterEmailAddress("coroama.vasile1@gmail.com");
        authentificationPage.enterPassword("123456789");
        authentificationPage.clickSingInButton();
        myAccountPage.checkWelcomeMessage();
        myAccountPage.loggingOut();
    }
}
