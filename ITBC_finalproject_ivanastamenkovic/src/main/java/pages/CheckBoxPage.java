package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage extends BasePage {

    private WebElement mainHeaderCheckBoxPage;
    private WebElement checkBoxHome;
    private WebElement expandAllButton;
    private WebElement collapseAllButton;
    public CheckBoxPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getMainHeaderCheckBoxPage() {
        mainHeaderCheckBoxPage = getDriver().findElement(By.className("main-header"));
        return mainHeaderCheckBoxPage;
    }

    public WebElement getCheckBoxHome() {
        checkBoxHome = getDriver().findElement(By.xpath("//span[contains(text(), 'Home')]"));
        return checkBoxHome;
    }

    public WebElement getExpandAllButton() {
        expandAllButton = getDriver().findElement(By.xpath("//*[@class='rct-icon rct-icon-expand-all']"));
        return expandAllButton;
    }

    public WebElement getCollapseAllButton() {
        collapseAllButton = getDriver().findElement(By.xpath("//*[@class='rct-icon rct-icon-collapse-all']"));
        return collapseAllButton;
    }

    public boolean isCheckBoxPageOpened() {
        String currentUrl = getDriver().getCurrentUrl();
        return currentUrl.equals("https://demoqa.com/checkbox");
    }

    public boolean isCheckBoxHomeDisplayed() {
        return getCheckBoxHome().isDisplayed();
    }

    public boolean isExpandAllButtonDisplayed() {
        return getExpandAllButton().isDisplayed();
    }

    public boolean isCollapseAllButtonDisplayed() {
        return getCollapseAllButton().isDisplayed();
    }

    public String getMainHeaderCheckBoxPageText() {
        return getMainHeaderCheckBoxPage().getText();
    }

    public void clickGetExpandAllButton() {
        getExpandAllButton().click();
    }

    public void openCheckBoxPage () {
        getDriver().manage().window().maximize();
        getDriver().get("https://demoqa.com/checkbox");
    }

}
