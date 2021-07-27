package storeTests;

import org.junit.Test;

public class BuyTests extends BasedTests{

    @Test
    public void shouldSuccessfullyBuy()
    {
        homePage.clickSingInButton();
        authentificationPage.enterEmailAddress("testvasi1999@gmail.com");
        authentificationPage.enterPassword("123456789");
        authentificationPage.clickSingInButton();
        myAccountPage.checkWelcomeMessage("Welcome to your account. Here you can manage all of your personal information and orders.");
        myAccountPage.checkDressesButton();
        dressesPage.checkAddButton1();
        dressesPage.checkProceedButton();
        dressesPage.checkProceedButton2();
        dressesPage.checkProceedButtonAddress();
        dressesPage.checkCheckBox();
        dressesPage.clickProccessCarrier();
        dressesPage.clickPayByCheckButton();
        dressesPage.clickConfirmButton();
        dressesPage.checkSuccessMessage("Your order on My Store is complete.");
    }

    //This test should fail
    @Test
    public void tryToBuyWithoutCheckTermsOfService()
    {
        homePage.clickSingInButton();
        authentificationPage.enterEmailAddress("testvasi1999@gmail.com");
        authentificationPage.enterPassword("123456789");
        authentificationPage.clickSingInButton();
        myAccountPage.checkWelcomeMessage("Welcome to your account. Here you can manage all of your personal information and orders.");
        myAccountPage.checkDressesButton();
        dressesPage.checkAddButton1();
        dressesPage.checkProceedButton();
        dressesPage.checkProceedButton2();
        dressesPage.checkProceedButtonAddress();
        dressesPage.clickProccessCarrier();
        dressesPage.clickPayByCheckButton();
        dressesPage.clickConfirmButton();
        dressesPage.checkSuccessMessage("Your order on My Store is complete.");
    }
}
