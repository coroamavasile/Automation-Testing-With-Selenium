package storeTests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

import java.util.concurrent.TimeUnit;

public class BasedTests {
    public WebDriver driver;
    public HomePage homePage;
    public AuthentificationPage authentificationPage;
    public MyAccountPage myAccountPage;
    public MyPersonalInformationPage myPersonalInformationPage;
    public DressesPage dressesPage;
    public MyAddressesPage myAddressesPage;
    public MyWishlistPage myWishlistPage;

    @Before
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        homePage = PageFactory.initElements(driver,HomePage.class);
        authentificationPage=PageFactory.initElements(driver,AuthentificationPage.class);
        myAccountPage=PageFactory.initElements(driver,MyAccountPage.class);
        myPersonalInformationPage = PageFactory.initElements(driver,MyPersonalInformationPage.class);
        dressesPage = PageFactory.initElements(driver, DressesPage.class);
        myAddressesPage = PageFactory.initElements(driver,MyAddressesPage.class);
        myWishlistPage = PageFactory.initElements(driver, MyWishlistPage.class);

    }

    @After
    public void after()
    {
        driver.quit();
    }
}
