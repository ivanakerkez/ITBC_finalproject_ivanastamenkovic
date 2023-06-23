package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage extends BasePage {

    private WebElement mainHeaderTextBoxPage;
    private WebElement inputFullNameField;
    private WebElement inputEmailField;
    private WebElement inputCurrentAddressField;
    private WebElement inputPermanentAddressField;
    private WebElement submitButton;
    private WebElement inputEmailFieldError;
    private WebElement enteredTextBox;

    public TextBoxPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getMainHeaderTextBoxPage() {
        mainHeaderTextBoxPage = getDriver().findElement(By.className("main-header"));
        return mainHeaderTextBoxPage;
    }

    public WebElement getInputFullNameField() {
        inputFullNameField = getDriver().findElement(By.id("userName"));
        return inputFullNameField;
    }

    public WebElement getInputEmailField() {
        inputEmailField = getDriver().findElement(By.id("userEmail"));
        return inputEmailField;
    }

    public WebElement getInputCurrentAddressField() {
        inputCurrentAddressField = getDriver().findElement(By.id("currentAddress"));
        return inputCurrentAddressField;
    }

    public WebElement getInputPermanentAddressField() {
        inputPermanentAddressField = getDriver().findElement(By.id("permanentAddress"));
        return inputPermanentAddressField;
    }

    public WebElement getSubmitButton() {
        submitButton = getDriver().findElement(By.id("submit"));
        return submitButton;
    }

    public WebElement getEnteredTextBox() {
        enteredTextBox = getDriver().findElement(By.xpath("//*[@class='border col-md-12 col-sm-12']"));
        return enteredTextBox;
    }

    public WebElement getInputEmailFieldError() {
        inputEmailFieldError = getDriver().findElement(By.xpath("//*[@class='mr-sm-2 field-error form-control']"));
        return inputEmailFieldError;
    }

    public boolean isTextBoxPageOpened() {
        String currentUrl = getDriver().getCurrentUrl();
        return currentUrl.equals("https://demoqa.com/text-box");
    }

    public String getMainHeaderTextBoxPageText() {
        return getMainHeaderTextBoxPage().getText();
    }

    public boolean isInputFullNameFieldDisplayed() {
        return getInputFullNameField().isDisplayed();
    }

    public boolean isInputEmailFieldDisplayed() {
        return getInputEmailField().isDisplayed();
    }

    public boolean isInputCurrentAddressFieldDisplayed() {
        return getInputCurrentAddressField().isDisplayed();
    }

    public boolean isInputPermanentAddressFieldDisplayed() {
        return getInputPermanentAddressField().isDisplayed();
    }

    public boolean isSubmitButtonDisplayed() {
        return getSubmitButton().isDisplayed();
    }

    public boolean isEnteredTextBoxDisplayed () {
        return getEnteredTextBox().isDisplayed();
    }

    public boolean isInputEmailFieldErrodDisplayed () {
        return getInputEmailFieldError().isDisplayed();
    }

    public void enterDataToFullNameField (String text) {
        getInputFullNameField().sendKeys(text);
    }

    public void enterDataEmailField (String text) {
        getInputEmailField().sendKeys(text);
    }

    public void enterDataToCurrentAddressField (String text) {
        getInputCurrentAddressField().sendKeys(text);
    }

    public void enterDataToPermanentAddressField (String text) {
        getInputPermanentAddressField().sendKeys(text);
    }

    public void clickSubmitButton() {
        getSubmitButton().click();
    }

    public void openTextBoxPage () {
        getDriver().manage().window().maximize();
        getDriver().get("https://demoqa.com/text-box");
    }
}
