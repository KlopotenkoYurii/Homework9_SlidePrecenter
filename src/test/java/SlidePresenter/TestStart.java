package SlidePresenter;
import SlidePrecenter.Pages.Email_I.UA.EmailAuthorize_step3;
import SlidePrecenter.Pages.Email_I.UA.EmailDelete_step7;
import SlidePrecenter.Pages.Email_I.UA.EmailGetLetter_step4;
import SlidePrecenter.Pages.LoginPage_step1;
import SlidePrecenter.Pages.SindUpPage_step2;
import SlidePrecenter.Pages.SlidePresenter_step5;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestStart extends TestRunner{

    private LoginPage_step1 loginPageStep1;
    private SindUpPage_step2 sindUpPageStep2;
    private EmailAuthorize_step3 emailAuthorizeStep3;
    private EmailGetLetter_step4 emailGetLetterStep4;
    private SlidePresenter_step5 slidePresenter_step5;

    private EmailDelete_step7 emailDelete_step7;

//    public TestStart(WebDriver driver) {
//        super(driver);
//    }

    @BeforeMethod
    public void befMetod(){
        loginPageStep1 = new LoginPage_step1(driver);
        sindUpPageStep2 = new SindUpPage_step2(driver);
        emailAuthorizeStep3 = new EmailAuthorize_step3(driver);
        emailGetLetterStep4 = new EmailGetLetter_step4(driver);
        slidePresenter_step5 = new SlidePresenter_step5(driver);

        emailDelete_step7 = new EmailDelete_step7(driver);

    }
    @Test
    public void test1() {
        loginPageStep1
                .openSlidePage()
                .closePopWindow()
                .pushSingUpPage();

        sindUpPageStep2
                .inputEmail()
                .selectCheckBox()
                .signUpForFree();

        emailAuthorizeStep3
                .login()
                .autorizeLogin()
                .autorizePassword()
                .autorizeEnterButton();

        emailGetLetterStep4
                .getLetter()
                .activateYouAccountFRAME();

        slidePresenter_step5
                .companySize()
                .enterFirstName("Alex")
                .enterLastName("Marvel")
                .enterPassword("Zaq1Xsw2?1")
                .enterPasswordConfirmation("Zaq1Xsw2?1")
                .registrationButton();

        emailDelete_step7
                .loginD()
                .autorizeLoginD()
                .autorizePasswordD()
                .autorizeEnterButtonD()
                .deleteLettersD();
    }
}
