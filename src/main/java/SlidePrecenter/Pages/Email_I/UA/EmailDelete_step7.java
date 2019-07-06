package SlidePrecenter.Pages.Email_I.UA;

import SlidePrecenter.Pages.ConfigurationPages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailDelete_step7 extends MainPage {
    public EmailDelete_step7(WebDriver driver) {
        super(driver);
    }
    public EmailDelete_step7 loginD(){
        open("https://www.i.ua/");
        //Thread.sleep(2000);
        return this;
    }
    public EmailDelete_step7 autorizeLoginD() {
        WebElement loggin = (WebElement) driver.findElements(By.xpath("//input[@name='login']"));
        loggin.sendKeys("lolipops211@i.ua");
        return this;
    }

    public EmailDelete_step7 autorizePasswordD() {
        WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
        password.sendKeys("80976517490");
        return this;
    }

    public EmailDelete_step7 autorizeEnterButtonD(){
        WebElement enterr = driver.findElement(By.xpath("//input[@value='Войти']"));
        enterr.click();
        return this;
    }
    public EmailDelete_step7 deleteLettersD(){
        driver.findElement(By.xpath("//input[@name='list[]']")).click();
        driver.findElement(By.xpath("(//input[@name='list[]'])[2]")).click();
        WebElement del =(WebElement) driver.findElements(By.cssSelector("#fieldset1 .del"));
                del.click();
        return this;
    }
}
