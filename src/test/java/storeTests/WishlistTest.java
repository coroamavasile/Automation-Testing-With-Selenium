package storeTests;

import org.junit.Test;

public class WishlistTest extends BasedTests{

    private final String NEW_ITEM = "NEW_ITEM";

    @Test
    public void addInWishlist()
    {
        homePage.clickSingInButton();
        authentificationPage.enterEmailAddress("testvasi1999@gmail.com");
        authentificationPage.enterPassword("123456789");
        authentificationPage.clickSingInButton();
        myAccountPage.clickMyWishlistButton();
        myWishlistPage.insertItemName(NEW_ITEM);
        myWishlistPage.clickSaveButton();

    }
}
