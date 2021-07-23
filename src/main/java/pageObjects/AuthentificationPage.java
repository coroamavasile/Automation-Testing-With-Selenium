package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthentificationPage {
    private WebDriver driver;

    public AuthentificationPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id="email")
    private WebElement emailAddress;

    @FindBy(id="passwd")
    private WebElement password;

    @FindBy(xpath="//*[@class='icon-lock left']")
    private WebElement singInButton;

    public void enterEmailAddress(String emailAddress1)
    {

        emailAddress.sendKeys(emailAddress1);
    }

    public void enterPassword(String password1)
    {
        password.sendKeys(password1);
    }

    public void clickSingInButton()
    {
        singInButton.click();
    }



}
