package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyPersonalInformationPage {
    private WebDriver webDriver;

    @FindBy(id = "firstname")
    private WebElement firstNameField;

    @FindBy(id = "old_passwd")
    private WebElement oldPassword;

    @FindBy(xpath = "//*[@name='submitIdentity']")
    private WebElement saveButtom;

    @FindBy(xpath = "//*[@class='alert alert-success']")
    private WebElement succesMessage;

    public MyPersonalInformationPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void insertNewFirstName(String firstName)
    {
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
    }

    public void insertOldPassword(String oldPass)
    {
        oldPassword.sendKeys(oldPass);
    }

    public void clickSaveButtom()
    {
        saveButtom.click();
    }

    public void checkSuccesMessage(String msg)
    {
        System.out.println(succesMessage.getText());
        Assert.assertTrue(msg.equals(succesMessage.getText()));
    }
}
