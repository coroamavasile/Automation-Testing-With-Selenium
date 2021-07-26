package storeTests;

import org.junit.Test;

public class LoginTests extends BasedTests{

    @Test
    public void shouldSuccessfullyLogin()
    {
        homePage.clickSingInButton();
        authentificationPage.enterEmailAddress("testvasi1999@gmail.com");
        authentificationPage.enterPassword("123456789");
        authentificationPage.clickSingInButton();
        myAccountPage.checkWelcomeMessage("Welcome to your account. Here you can manage all of your personal information and orders.");
        myAccountPage.checkContactUsButtom();
        myAccountPage.loggingOut();
    }

    @Test
    public void shouldNotLogin()
    {
        homePage.clickSingInButton();
        authentificationPage.enterEmailAddress("testvasi1999@gmail.com");
        authentificationPage.enterPassword("1234567891");
        authentificationPage.clickSingInButton();
        authentificationPage.checkAlertMessage("There is 1 error"+ "\n" +"Authentication failed."
        );
    }




}
