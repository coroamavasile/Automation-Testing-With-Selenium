package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyWishlistPage {
    public WebDriver webDriver;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement itemName;

    @FindBy(xpath = "//button[@name='submitWishlist']")
    public WebElement saveButton;

    public MyWishlistPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void insertItemName(String newItem){
        itemName.sendKeys(newItem);
    }

    public void clickSaveButton(){
        saveButton.click();
    }

}
