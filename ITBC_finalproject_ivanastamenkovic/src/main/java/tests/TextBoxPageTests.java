package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxPageTests extends BaseTests {

    @Test
    public void verifyTextBoxPageLoads () {
        getElementsPage().openElementsPage();
        getElementsPage().clickTextBoxCard();
        Assert.assertTrue(getTextBoxPage().isTextBoxPageOpened());
        Assert.assertEquals(getTextBoxPage().getMainHeaderTextBoxPageText(), "Text Box");
        Assert.assertTrue(getTextBoxPage().isInputFullNameFieldDisplayed());
        Assert.assertTrue(getTextBoxPage().isInputEmailFieldDisplayed());
        Assert.assertTrue(getTextBoxPage().isInputCurrentAddressFieldDisplayed());
        Assert.assertTrue(getTextBoxPage().isInputPermanentAddressFieldDisplayed());
        Assert.assertTrue(getTextBoxPage().isSubmitButtonDisplayed());
    }

    @Test
    public void testTextBoxFormWithValidData() {
        getTextBoxPage().openTextBoxPage();
        getTextBoxPage().enterDataToFullNameField("Lily Potter");
        getTextBoxPage().enterDataEmailField("orderofthephoenix@live.com");
        getTextBoxPage().enterDataToCurrentAddressField("12 Grimmauld Place\n" + "Islington, London\n" + "England");
        getTextBoxPage().enterDataToPermanentAddressField("12 Grimmauld Place\n" + "Islington, London\n" + "England");
        scrollDown(300);
        getTextBoxPage().clickSubmitButton();
        Assert.assertTrue(getTextBoxPage().isEnteredTextBoxDisplayed());
    }

    @Test
    public void testTextBoxFormWithInvalidEmail() {
        getTextBoxPage().openTextBoxPage();
        getTextBoxPage().enterDataToFullNameField("Lily Potter");
        getTextBoxPage().enterDataEmailField("orderofthephoenix");
        getTextBoxPage().enterDataToCurrentAddressField("12 Grimmauld Place\n" + "Islington, London\n" + "England");
        getTextBoxPage().enterDataToPermanentAddressField("12 Grimmauld Place\n" + "Islington, London\n" + "England");
        scrollDown(300);
        getTextBoxPage().clickSubmitButton();
        Assert.assertTrue(getTextBoxPage().isInputEmailFieldErrodDisplayed());
    }
}
