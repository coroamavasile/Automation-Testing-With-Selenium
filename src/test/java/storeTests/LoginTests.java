package storeTests;

import org.junit.Test;

public class LoginTests extends BasedTests{

    @Test
    public void shoudSuccessfullyLogin()
    {
        homePage.clickSingInButton();
        authentificationPage.enterEmailAddress("testvasi1999@gmail.com");
        authentificationPage.enterPassword("123456789");
        authentificationPage.clickSingInButton();
        myAccountPage.checkWelcomeMessage("Welcome to your account. Here you can manage all of your personal information and orders.");
        myAccountPage.loggingOut();
    }
}
