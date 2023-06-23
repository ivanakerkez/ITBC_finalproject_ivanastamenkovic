package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.CheckBoxPage;
import pages.ElementsPage;
import pages.RadioButtonPage;
import pages.TextBoxPage;

import java.time.Duration;

public class BaseTests {

    private WebDriver driver;
    private WebDriverWait wait;
    private ElementsPage elementsPage;
    private TextBoxPage textBoxPage;
    private CheckBoxPage checkBoxPage;
    private RadioButtonPage radioButtonPage;
    private JavascriptExecutor js;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ivana\\Desktop\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        elementsPage = new ElementsPage(driver, wait);
        textBoxPage = new TextBoxPage(driver, wait);
        checkBoxPage = new CheckBoxPage(driver, wait);
        radioButtonPage = new RadioButtonPage(driver, wait);
        js = (JavascriptExecutor) driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public ElementsPage getElementsPage() {
        return elementsPage;
    }

    public TextBoxPage getTextBoxPage() {
        return textBoxPage;
    }

    public CheckBoxPage getCheckBoxPage() {
        return checkBoxPage;
    }

    public RadioButtonPage getRadioButtonPage() {
        return radioButtonPage;
    }

    public JavascriptExecutor getJs() {
        return js;
    }

    public void scrollDown(int numberOfPixels) {
        getJs().executeScript("window.scrollBy(0," + numberOfPixels + ")", "");
    }

    //    @AfterClass
//    public void cleanUp() {
//        driver.close();
//    }
}
