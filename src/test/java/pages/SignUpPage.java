package pages;

import common.PageBase;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends PageBase {
    // constructor
    public SignUpPage(AndroidDriver androidDriver) { super(androidDriver); }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText") private WebElement userNameText;
    private WebElement getUserNameText(){return userNameText;}

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText") private WebElement emailText;
    private WebElement getEmailText (){return emailText ;}


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText") private WebElement passwordText;
    private WebElement getPasswordText (){return passwordText ;}



    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText") private WebElement passwordConfirmText;
    private WebElement getPasswordConfirmText (){return passwordConfirmText ;}


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button") private WebElement signUpSecondBtn;
    private WebElement getSignUpSecondBtn  (){return signUpSecondBtn ;}


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView") private WebElement connecttoYourEmail;
    private WebElement getConnecttoYourEmail(){return connecttoYourEmail ;}


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[1]") private WebElement userNameValidation;
    private WebElement getUserNameValidation(){return userNameValidation ;}




    // fill password
    public SignUpPage fillUserName(String username) {
        waitElement(getUserNameText()).sendKeys(username);
        return new SignUpPage(androidDriver);
    }

    public SignUpPage fillEmail(String email) {
        waitElement(getEmailText()).sendKeys(email);
        return new SignUpPage(androidDriver);
    }

    public SignUpPage fillPassword(String password) {
        waitElement(getPasswordText()).sendKeys(password);
        return new SignUpPage(androidDriver);
    }


    public SignUpPage fillPasswordConfirm (String passwordConfirm) {
        waitElement(getPasswordConfirmText()).sendKeys(passwordConfirm);
        return new SignUpPage(androidDriver);
    }

    public SignUpPage clickOnSignUpSecond() {
        waitElement(getSignUpSecondBtn()).click();
        return new SignUpPage(androidDriver);
    }


    public String getTextOfConnectYourEmailLableDisplayed(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return waitElement(getConnecttoYourEmail()).getText();
    }

    public String getTextOfUserNameValidation(){

        return waitElement(getUserNameValidation()).getText();
    }


    }

