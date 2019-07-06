package SlidePrecenter.Pages;

import SlidePrecenter.Pages.ConfigurationPages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static SlidePrecenter.Locators.Locators.*;

public class SlidePresenter_step5 extends MainPage {

    public SlidePresenter_step5(WebDriver driver){super (driver);}

    public SlidePresenter_step5 companySize() {
        WebElement Box = driver.findElement(By.cssSelector(".jss274"));
        Box.click();
        WebElement List = driver.findElement(By.xpath("//div[@id='menu-companySize']/div[2]/ul/li[5]/div/span"));
        List.click();
        return this;
    }
    public SlidePresenter_step5 enterPassword (String pass){
        enterText(PASSWORD_XPATHlocator, pass);
        return this;
    }
    public SlidePresenter_step5 enterPasswordConfirmation (String passConf){
        enterText(CONFIRN_PASSWORD_XPATHlocator, passConf);
        return this;
    }
    public SlidePresenter_step5 enterFirstName (String name){
        enterText(FIRST_NAME_XPATHlocator, name);
        return this;
    }
    public SlidePresenter_step5 enterLastName (String lastName){
        enterText(LAST_NAME_XPATHlocator, lastName);
        return this;
    }
    public SlidePresenter_step5 registrationButton(){
        WebElement push = driver.findElement(By.xpath("//div[7]/button/span"));
        push.click();
        return this;
    }

}
