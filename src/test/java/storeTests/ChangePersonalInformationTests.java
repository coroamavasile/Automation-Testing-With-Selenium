package storeTests;

import org.junit.Test;

public class ChangePersonalInformationTests extends BasedTests{
    @Test
    public void changeFirstName()
    {
        homePage.clickSingInButton();
        authentificationPage.enterEmailAddress("testvasi1999@gmail.com");
        authentificationPage.enterPassword("123456789");
        authentificationPage.clickSingInButton();
        myAccountPage.checkMyPersonalInformationButtom();
        myPersonalInformationPage.insertNewFirstName("Testerr");
        myPersonalInformationPage.insertOldPassword("123456789");
        myPersonalInformationPage.clickSaveButtom();
        myPersonalInformationPage.checkSuccesMessage("Your personal information has been successfully updated.");
    }
}
