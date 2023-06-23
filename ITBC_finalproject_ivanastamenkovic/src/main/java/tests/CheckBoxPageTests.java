package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxPageTests extends BaseTests {

    @Test
    public void verifyCheckBoxPageLoads () {
        getElementsPage().openElementsPage();
        getElementsPage().clickCheckBoxCard();
        Assert.assertTrue(getCheckBoxPage().isCheckBoxPageOpened());
        Assert.assertEquals(getCheckBoxPage().getMainHeaderCheckBoxPageText(), "Check Box");
        Assert.assertTrue(getCheckBoxPage().isCheckBoxHomeDisplayed());
        Assert.assertTrue(getCheckBoxPage().isExpandAllButtonDisplayed());
        Assert.assertTrue(getCheckBoxPage().isCollapseAllButtonDisplayed());
    }
}
