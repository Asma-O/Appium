package pages;

import common.PageBase;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends PageBase {
    // constructor
    public LogInPage(AndroidDriver androidDriver) { super(androidDriver); }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.TextView[2]") private WebElement signUpFirstBtn;
    private WebElement getSignUpFirstBtn(){return signUpFirstBtn;}

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[5]/android.widget.TextView") private WebElement termsAndConditions;
    private WebElement getTermsAndConditions(){return termsAndConditions;}


    public SignUpPage clickOnSignUpFirst() {
        waitElement(getSignUpFirstBtn()).click();
        return new SignUpPage(androidDriver);
    }

    public SignUpPage clickOnTermsAndConditions() {
        tebOnPartOfElement(getTermsAndConditions(),0.8);
        return new SignUpPage(androidDriver);
    }
    }

