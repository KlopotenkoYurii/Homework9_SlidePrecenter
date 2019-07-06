package SlidePresenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PoshtaClass extends TestRunner {

    @Test
    public void test11()throws InterruptedException {
        driver.get("https://www.i.ua/");
        Thread.sleep(2000);

        WebElement anchors = driver.findElement(By.xpath("//input[@name='pass']"));
        ((WebElement) anchors).findElement(By.xpath("//input[@name='pass']")).sendKeys("12345678");
        Thread.sleep(2000);
        driver.getCurrentUrl();

        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("qwerty@com.ua");
    }

}
