package SlidePrecenter.Pages.Email_I.UA;

import SlidePrecenter.Pages.ConfigurationPages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailAuthorize_step3 extends MainPage {
    public EmailAuthorize_step3(WebDriver driver) {
        super(driver);
    }



    public EmailAuthorize_step3 login(){
        open("https://www.i.ua/");
        //Thread.sleep(2000);
        return this;
    }

    public EmailAuthorize_step3 autorizePassword() {
        WebElement anchors = driver.findElement(By.xpath("//input[@name='pass']"));
        ((WebElement) anchors).findElement(By.xpath("//input[@name='pass']")).sendKeys("80976517490");
        return this;
    }
    public EmailAuthorize_step3 autorizeLogin() {
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("lolipops211");
        return this;
    }

    public EmailAuthorize_step3 autorizeEnterButton(){
        WebElement enterr = driver.findElement(By.xpath("//input[@value='Войти']"));
        enterr.click();
        return this;
    }

}
