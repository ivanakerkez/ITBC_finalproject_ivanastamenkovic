package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementsPageTests extends BaseTests {

    @Test
    public void verifyElementsPageLoads () {
        getElementsPage().openElementsPage();
        Assert.assertTrue(getElementsPage().isElementsPageOpened());
        Assert.assertEquals(getElementsPage().getMainHeaderText(), "Elements");
        Assert.assertTrue(getElementsPage().isContentMessageDisplayed());
        Assert.assertTrue(getElementsPage().isLeftPanelDisplayed());
    }

    @Test
    public void checkLeftPanel() {
        getElementsPage().openElementsPage();
        Assert.assertTrue(getElementsPage().isLeftPanelDisplayed());
        Assert.assertTrue(getElementsPage().isTextBoxCardDisplayed());
        Assert.assertTrue(getElementsPage().isCheckBoxCardDisplayed());
        Assert.assertTrue(getElementsPage().isRadioButtonCardDisplayed());
        Assert.assertTrue(getElementsPage().isWebTablesCardDisplayed());
        Assert.assertTrue(getElementsPage().isButtonsCardDisplayed());
        Assert.assertTrue(getElementsPage().isLinksCardDisplayed());
        Assert.assertTrue(getElementsPage().isBrokenLinksImagesCardDisplayed());
        Assert.assertTrue(getElementsPage().isUploadDownloadCardDisplayed());
        Assert.assertTrue(getElementsPage().isDynamicPropertiesCardDisplayed());
    }
}
