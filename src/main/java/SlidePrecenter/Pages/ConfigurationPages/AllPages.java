package SlidePrecenter.Pages.ConfigurationPages;

import SlidePrecenter.Pages.Email_I.UA.EmailAuthorize_step3;
import SlidePrecenter.Pages.Email_I.UA.EmailDelete_step7;
import SlidePrecenter.Pages.Email_I.UA.EmailGetLetter_step4;
import SlidePrecenter.Pages.LoginPage_step1;
import SlidePrecenter.Pages.SindUpPage_step2;
import SlidePrecenter.Pages.SlidePresenter_step5;
import org.openqa.selenium.WebDriver;

public class AllPages {
    private WebDriver driver;
    private LoginPage_step1 loginPageStep1;
    private SindUpPage_step2 sindUpPageStep2;
    private EmailAuthorize_step3 emailAuthorizeStep3;
    private EmailGetLetter_step4 emailGetLetterStep4;
    private SlidePresenter_step5 slidePresenter_step5;

    private EmailDelete_step7 emailDelete_step7;

    public AllPages(WebDriver driver) {
        this.driver = driver;

        loginPageStep1 = new LoginPage_step1(driver);
        sindUpPageStep2 = new SindUpPage_step2(driver);
        emailAuthorizeStep3 = new EmailAuthorize_step3(driver);
        emailGetLetterStep4 = new EmailGetLetter_step4(driver);
        slidePresenter_step5 = new SlidePresenter_step5(driver);

        emailDelete_step7 = new EmailDelete_step7(driver);
    }

    public LoginPage_step1 getLoginPageStep1() {
        return loginPageStep1;
    }
    public SindUpPage_step2 getSindUpPageStep2() {return sindUpPageStep2; }
    public EmailAuthorize_step3 getEmailAuthorizeStep3(){ return emailAuthorizeStep3;}
    public EmailGetLetter_step4 getEmailGetLetterStep4(){return emailGetLetterStep4;}
    public SlidePresenter_step5 getSlidePresenter_step5(){return slidePresenter_step5;}

    public EmailDelete_step7 getEmailDelete_step7(){return  emailDelete_step7;}
}

