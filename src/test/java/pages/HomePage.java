package pages;

import common.PageBase;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
    // constructor
    public HomePage(AndroidDriver androidDriver) { super(androidDriver); }

    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_button") private WebElement allowBtn;
    private WebElement getAllowBtn(){return allowBtn;}

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView") private WebElement xBtn;
    private WebElement getxBtn(){return xBtn;}

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.TextView") private WebElement meBtn;
    private WebElement getMeBtn (){return meBtn ;}


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]") private WebElement loginBtn;
    private WebElement getLoginBtn (){return loginBtn ;}




    public HomePage clickOnAllow() {
        waitElement(getAllowBtn()).click();
        return new HomePage(androidDriver);
    }

    // fill password
    public HomePage clickOnXBtn () {
        waitElement(getxBtn()).click();
        return new HomePage(androidDriver);
    }

    // click on submit
    public HomePage clickOnMeBtn() {
        waitElement(getMeBtn()).click();
        return new HomePage(androidDriver);
    }
    public LogInPage clickOnLoginBtn() {
        waitElement(getLoginBtn()).click();
        return new LogInPage(androidDriver);
    }


    }

