package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonPageTests extends BaseTests {

    @Test
    public void verifyRadioButtonPageLoads () {
        getElementsPage().openElementsPage();
        getElementsPage().clickRadioButtonCard();
        Assert.assertTrue(getRadioButtonPage().isRadioButtonPageOpened());
        Assert.assertEquals(getRadioButtonPage().getMainHeaderRadioButtonPageText(), "Radio Button");
        Assert.assertTrue(getRadioButtonPage().isYesRadioButtonDisplayed());
        Assert.assertTrue(getRadioButtonPage().isImpressiveRadioButtonDisplayed());
        Assert.assertTrue(getRadioButtonPage().isNoRadioButtonDisplayed());
    }

    @Test
    public void clickYesRadioButton () {
        getRadioButtonPage().openRadioButtonPage();
        getRadioButtonPage().clickYesRadioButton();
        Assert.assertEquals(getRadioButtonPage().getYesMessageText(), "Yes");
    }

    @Test
    public void clickImpressiveRadioButton () {
        getRadioButtonPage().openRadioButtonPage();
        getRadioButtonPage().clickImpressiveRadioButton();
        Assert.assertEquals(getRadioButtonPage().getImpressiveMessageText(), "Impressive");
    }

}
