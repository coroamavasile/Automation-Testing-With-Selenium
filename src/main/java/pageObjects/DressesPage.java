package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressesPage {
    private WebDriver webDriver;

    @FindBy(xpath = "(//a[@title='Add to cart'])[1]")
    private WebElement addButton1;

    @FindBy(xpath = "(//a[@class='btn btn-default button button-medium'])[1]")
    private WebElement proceedButton;

    @FindBy(xpath="(//a[@class='button btn btn-default standard-checkout button-medium'])[1]")
    private WebElement proceedButton2;

    @FindBy(xpath="//*[@name='processAddress']")
    private WebElement proccedButtonAddress;

    @FindBy(xpath = "//*[@name='cgv']")
    private WebElement checkBox;

    @FindBy(xpath = "//*[@name='processCarrier']")
    private WebElement proccessCarrierButton;

    @FindBy(xpath = "//*[@title='Pay by check.']")
    private WebElement payByCheckButton;

    @FindBy(xpath = "//*[@class='button btn btn-default button-medium']")
    private WebElement confirmButton;

    @FindBy(xpath = "//*[@class='alert alert-success']")
    private WebElement alertSuccessMessage;

    public DressesPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void checkAddButton1(){
        addButton1.click();
    }

    public void checkProceedButton()
    {
        proceedButton.click();
    }

    public void checkProceedButton2(){
        proceedButton2.click();
    }

    public void checkProceedButtonAddress()
    {
        proccedButtonAddress.click();
    }

    public void checkCheckBox()
    {
        checkBox.click();
    }

    public void clickProccessCarrier(){
        proccessCarrierButton.click();
    }

    public void clickPayByCheckButton(){
        payByCheckButton.click();
    }

    public void clickConfirmButton(){
        confirmButton.click();
    }

    public void checkSuccessMessage(String expectedString){
        System.out.println(alertSuccessMessage.getText());
        Assert.assertTrue(expectedString.equals(alertSuccessMessage.getText()));
    }
}
