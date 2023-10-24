package pages;

import common.PageBase;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TermsAndConditionsPage extends PageBase {
    // constructor
    public TermsAndConditionsPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView")
    private WebElement termsAndConditionsTitle;

    private WebElement getTermsAndConditionsTitle() {
        return termsAndConditionsTitle;
    }


    public String getTextTermsAndConditionsTitle() {
        return waitElement(getTermsAndConditionsTitle()).getText();
    }

}
