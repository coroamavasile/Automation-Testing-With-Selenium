package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAddressesPage {
    public WebDriver webDriver;

    @FindBy(xpath = "//a[@title='Update']")
    public WebElement updateButton;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityField;

    @FindBy(xpath = "//button[@name='submitAddress']")
    public WebElement submitAddressButton;

    @FindBy(xpath = "//input[@name='alias']")
    public WebElement aliasField;

    @FindBy(xpath = "//h3[@class='page-subheading']")
    public WebElement aliasFieldInformation;

    public MyAddressesPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickUpdateButton(){
        updateButton.click();
    }

    public void insertInCityField(String newCity){
        cityField.clear();
        cityField.sendKeys(newCity);
    }

    public void insertInAliasField(String newAlias)
    {
        aliasField.clear();
        aliasField.sendKeys(newAlias);
    }

    public void checkAliasFieldInformationAfterUpdate(String newAlias)
    {
        Assert.assertTrue(newAlias.equals(aliasFieldInformation.getText()));
    }

    public void clickSubmitAddressButton(){
        submitAddressButton.click();
    }
}
