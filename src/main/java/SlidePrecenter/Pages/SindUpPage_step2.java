package SlidePrecenter.Pages;

import SlidePrecenter.Pages.ConfigurationPages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static SlidePrecenter.AutoGenerateEmail.EmailGenerator.GENERATE_RANDOM_EMAIL;
import static SlidePrecenter.Locators.Locators.ENTER_EMAIL;
import static javax.swing.text.html.CSS.getAttribute;
import static org.apache.commons.lang3.StringUtils.split;

public class SindUpPage_step2 extends MainPage {

    public SindUpPage_step2(WebDriver driver){super (driver);}

    public SindUpPage_step2 inputEmail() {
        enterText(ENTER_EMAIL, GENERATE_RANDOM_EMAIL(5));
        return this;
}
    public SindUpPage_step2 takeEmail() {
        driver.findElements(By.xpath(ENTER_EMAIL));
        getAttribute("Value");

        String[] parts = split("@");
        String part1 = parts[0];
        String part2 = parts[1];
        return this;
    }


    public SindUpPage_step2 selectCheckBox(){
        WebElement checkBox = driver.findElement(By.xpath("//span/div/i"));
        checkBox.click();
        return this;
    }
    public SindUpPage_step2 signUpForFree(){
        WebElement singUp = driver.findElement(By.xpath("//span[contains(.,'Sign up for free')]"));
        singUp.click();
        return this;
    }
}
