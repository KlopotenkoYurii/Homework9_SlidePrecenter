package SlidePrecenter.Pages;
import SlidePrecenter.Pages.ConfigurationPages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static SlidePrecenter.Url.Urls.SLIDE_PAGE;

public class LoginPage_step1 extends MainPage {

    private static final String CLOSE_BUTTON_POPUP = "//div[@title='Close']";

    public LoginPage_step1(WebDriver driver) {
        super(driver);
    }

    public LoginPage_step1 openSlidePage(){
        driver.get(SLIDE_PAGE);
        return this;
    }
    public LoginPage_step1 closePopWindow() {
        if (isElementPresent(CLOSE_BUTTON_POPUP)) {
            driver.findElement(By.xpath("//div[@title='Close']")).click();
        }
        return this;
    }
    public LoginPage_step1 pushSingUpPage(){
        WebElement getSingUp = driver.findElement(By.xpath("//a[2]/span"));
        getSingUp.click();
        return this;
    }

}
