package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;

public class MyAccountPage {
    public WebDriver driver;


    @FindBy(xpath="//*[@class='info-account']")
    private WebElement welcomeMessage;
    @FindBy(xpath = "//*[@class='logout']")
    private WebElement logOut;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkWelcomeMessage(String expectedWelcomeMessage)
    {
        Assert.assertTrue(expectedWelcomeMessage.equals(welcomeMessage.getText()));
    }

    public void loggingOut()
    {
        logOut.click();
    }
}
