package SlidePrecenter.Pages.Email_I.UA;

import SlidePrecenter.Pages.ConfigurationPages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailGetLetter_step4 extends MainPage{
    public EmailGetLetter_step4(WebDriver driver) {
        super(driver);
    }
    public EmailGetLetter_step4 getLetter(){
        WebElement letter = driver.findElement(By.xpath("//a/span[2]"));
        letter.click();
        return this;
    }
    public EmailGetLetter_step4 activateYouAccountFRAME (){
        driver.switchTo().frame("id=ifr5cfe9c862d0f");
        driver.findElement(find("//a[contains(text(),'Activate your account and set up your password')]")).click();
        driver.switchTo().defaultContent();
        return this;
    }
}
