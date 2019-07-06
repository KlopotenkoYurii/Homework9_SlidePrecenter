package SlidePrecenter.Pages.ConfigurationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class MainPage {
    public WebDriver driver;
    public WebDriverWait wait;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 2);
    }

    public MainPage open(String url) {
        driver.get(url);
        return this;
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void switchToLastTab() {
        List<String> list = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(list.get(list.size() - 1));
    }
    public boolean isElementPresent(String loc) {
        List<WebElement> foundElements = driver.findElements(find(loc));
        return !foundElements.isEmpty();
    }
    public By find(String locator) {
        if (locator.startsWith("//") || locator.startsWith("./")) {
            return By.xpath(locator);
        }
        return By.cssSelector(locator);
    }
    public void enterText(String locator, String text) {
        WebElement input = driver.findElement(find(locator));
        input.clear();
        input.sendKeys(text);
    }


}