package storeTests;

import org.junit.Test;

public class ChangePersonalInformationTests extends BasedTests{
    private final String NEW_ALIAS = "NEW_ALIAS";

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

    @Test
    public void changeAddress()
    {
        homePage.clickSingInButton();
        authentificationPage.enterEmailAddress("testvasi1999@gmail.com");
        authentificationPage.enterPassword("123456789");
        authentificationPage.clickSingInButton();
        myAccountPage.clickMyAdrressesButton();
        myAddressesPage.clickUpdateButton();
        myAddressesPage.insertInAliasField(NEW_ALIAS);
        myAddressesPage.insertInCityField("Bucuresti");
        myAddressesPage.clickSubmitAddressButton();
        myAddressesPage.checkAliasFieldInformationAfterUpdate(NEW_ALIAS);
    }
}
