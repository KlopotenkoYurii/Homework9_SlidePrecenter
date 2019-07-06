package SlidePresenter;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestRunner {
    protected WebDriver driver = null;

//    public TestRunner(WebDriver driver) {
//        this.driver = driver;
//    }

    @BeforeSuite
    public void beforeSuite() {
        String property = System.getProperty("user.dir") + "/ChromeDriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);
        WebDriverManager.chromedriver().setup();
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforClass_Start");

    }

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        if (driver != null) {
            //driver.quit();
        }
    }

    private void closeNotUsedTabs() {
        String currentTab = driver.getWindowHandle();
        List<String> allTabs = new ArrayList<String>(driver.getWindowHandles());

        for (int i = 0; i < allTabs.size(); i++) {
            String tab = allTabs.get(0);
            if (!tab.equals(currentTab)) {
               driver.switchTo().window(tab);
               // driver.close();
            }
        }
        driver.switchTo().window(currentTab);
    }
    @AfterClass
    public void afterClass(){}

    @AfterSuite
    public  void afterSuite(){}
}
