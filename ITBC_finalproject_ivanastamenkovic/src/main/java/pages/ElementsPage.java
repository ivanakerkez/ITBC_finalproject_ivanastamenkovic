package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage extends BasePage {

    private WebElement mainHeaderElementsPage;
    private WebElement contentMessage;
    private WebElement leftPanel;
    private WebElement textBoxCard;
    private WebElement checkBoxCard;
    private WebElement radioButtonCard;
    private WebElement webTablesCard;
    private WebElement buttonsCard;
    private WebElement linksCard;
    private WebElement brokenLinksImagesCard;
    private WebElement uploadDownloadCard;
    private WebElement dynamicPropertiesCard;

    public ElementsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getMainHeaderElementsPage() {
        mainHeaderElementsPage = getDriver().findElement(By.className("main-header"));
        return mainHeaderElementsPage;
    }

    public WebElement getContentMessage() {
        contentMessage = getDriver().findElement(By.xpath("//div[contains(text(),'Please select an item from left to start practice.')]"));
        return contentMessage;
    }

    public WebElement getLeftPanel() {
        leftPanel = getDriver().findElement(By.className("left-pannel"));
        return leftPanel;
    }

    public WebElement getTextBoxCard() {
        textBoxCard = getDriver().findElement(By.id("item-0"));
        return textBoxCard;
    }

    public WebElement getCheckBoxCard() {
        checkBoxCard = getDriver().findElement(By.id("item-1"));
        return checkBoxCard;
    }

    public WebElement getRadioButtonCard() {
        radioButtonCard = getDriver().findElement(By.id("item-2"));
        return radioButtonCard;
    }

    public WebElement getWebTablesCard() {
        webTablesCard = getDriver().findElement(By.id("item-3"));
        return webTablesCard;
    }

    public WebElement getButtonsCard() {
        buttonsCard = getDriver().findElement(By.id("item-4"));
        return buttonsCard;
    }

    public WebElement getLinksCard() {
        linksCard = getDriver().findElement(By.id("item-5"));
        return linksCard;
    }

    public WebElement getBrokenLinksImagesCard() {
        brokenLinksImagesCard = getDriver().findElement(By.id("item-6"));
        return brokenLinksImagesCard;
    }

    public WebElement getUploadDownloadCard() {
        uploadDownloadCard = getDriver().findElement(By.id("item-7"));
        return uploadDownloadCard;
    }

    public WebElement getDynamicPropertiesCard() {
        dynamicPropertiesCard = getDriver().findElement(By.id("item-8"));
        return dynamicPropertiesCard;
    }

    public boolean isElementsPageOpened() {
        String currentUrl = getDriver().getCurrentUrl();
        return currentUrl.equals("https://demoqa.com/elements");
    }

    public String getMainHeaderText() {
        return getMainHeaderElementsPage().getText();
    }

    public boolean isContentMessageDisplayed() {
        return getContentMessage().isDisplayed();
    }

    public boolean isLeftPanelDisplayed() {
        return getLeftPanel().isDisplayed();
    }

    public boolean isTextBoxCardDisplayed() {
        return getTextBoxCard().isDisplayed();
    }

    public boolean isCheckBoxCardDisplayed() {
        return getCheckBoxCard().isDisplayed();
    }

    public boolean isRadioButtonCardDisplayed() {
        return getRadioButtonCard().isDisplayed();
    }

    public boolean isWebTablesCardDisplayed() {
        return getWebTablesCard().isDisplayed();
    }

    public boolean isButtonsCardDisplayed() {
        return getButtonsCard().isDisplayed();
    }

    public boolean isLinksCardDisplayed() {
        return getLinksCard().isDisplayed();
    }

    public boolean isBrokenLinksImagesCardDisplayed() {
        return getBrokenLinksImagesCard().isDisplayed();
    }

    public boolean isUploadDownloadCardDisplayed() {
        return getUploadDownloadCard().isDisplayed();
    }

    public boolean isDynamicPropertiesCardDisplayed() {
        return getDynamicPropertiesCard().isDisplayed();
    }

    public void clickTextBoxCard () {
        getTextBoxCard().click();
    }

    public void clickCheckBoxCard () {
        getCheckBoxCard().click();
    }

    public void clickRadioButtonCard () {
        getRadioButtonCard().click();
    }

    public void openElementsPage () {
        getDriver().manage().window().maximize();
        getDriver().get("https://demoqa.com/elements");
    }
}
