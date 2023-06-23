package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage extends BasePage {

    private WebElement mainHeaderRadioButtonPage;
    private WebElement yesRadioButton;
    private WebElement impressiveRadioButton;
    private WebElement noRadioButton;
    private WebElement yesMessage;
    private WebElement impressiveMessage;
    public RadioButtonPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getMainHeaderRadioButtonPage() {
        mainHeaderRadioButtonPage = getDriver().findElement(By.className("main-header"));
        return mainHeaderRadioButtonPage;
    }

    public WebElement getYesRadioButton() {
        yesRadioButton = getDriver().findElement(By.xpath("//label[contains(text(),'Yes')]"));
        return yesRadioButton;
    }

    public WebElement getImpressiveRadioButton() {
        impressiveRadioButton = getDriver().findElement(By.xpath("//label[contains(text(),'Impressive')]"));
        return impressiveRadioButton;
    }

    public WebElement getNoRadioButton() {
        noRadioButton = getDriver().findElement(By.xpath("//label[contains(text(),'No')]"));
        return noRadioButton;
    }

    public WebElement getYesMessage() {
        yesMessage = getDriver().findElement(By.xpath("//span[contains(text(), 'Yes')]"));
        return yesMessage;
    }

    public String getYesMessageText() {
        return getYesMessage().getText();
    }

    public WebElement getImpressiveMessage() {
        impressiveMessage = getDriver().findElement(By.xpath("//span[contains(text(), 'Impressive')]"));
        return impressiveMessage;
    }

    public String getImpressiveMessageText() {
        return getImpressiveMessage().getText();
    }

    public boolean isRadioButtonPageOpened() {
        String currentUrl = getDriver().getCurrentUrl();
        return currentUrl.equals("https://demoqa.com/radio-button");
    }

    public String getMainHeaderRadioButtonPageText() {
        return getMainHeaderRadioButtonPage().getText();
    }

    public boolean isYesRadioButtonDisplayed() {
        return getYesRadioButton().isDisplayed();
    }

    public boolean isImpressiveRadioButtonDisplayed() {
        return getImpressiveRadioButton().isDisplayed();
    }

    public boolean isNoRadioButtonDisplayed() {
        return getNoRadioButton().isDisplayed();
    }

    public void clickYesRadioButton() {
        getYesRadioButton().click();
    }



    public void clickImpressiveRadioButton() {
        getImpressiveRadioButton().click();
    }

    public void clickNoRadioButton() {
        getNoRadioButton().click();
    }

    public void openRadioButtonPage () {
        getDriver().manage().window().maximize();
        getDriver().get("https://demoqa.com/radio-button");
    }
}
