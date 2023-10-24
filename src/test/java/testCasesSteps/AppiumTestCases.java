package testCasesSteps;

import common.Constant;
import common.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;

public class AppiumTestCases extends  Hooks{

    @Test (priority =1)
    public void TC1_Verify_Valid_SignUp() throws MalformedURLException {
//        PageFactory.instance().homePage().clickOnAllow()
//                .clickOnAllow()
        PageFactory.instance().homePage().clickOnXBtn()
                .clickOnMeBtn()
                .clickOnLoginBtn()
                .clickOnSignUpFirst()
                .fillUserName(Constant.username)
                .fillEmail(Constant.email)
                .fillPassword(Constant.password)
                .fillPasswordConfirm(Constant.passwordConfirm)
                .clickOnSignUpSecond();
        Assert.assertEquals(PageFactory.instance().signUpPage().getTextOfConnectYourEmailLableDisplayed(), Constant.connectYourEmailLable);
    }

    @Test (priority =2)
    public void TC2_Verify_Invalid_SignUp_byEmptyUseName() throws MalformedURLException {
//        PageFactory.instance().homePage().clickOnAllow()
//                .clickOnAllow()
     PageFactory.instance().homePage().clickOnXBtn();
        PageFactory.instance().homePage().clickOnMeBtn()
                .clickOnLoginBtn()
                .clickOnSignUpFirst()
                .fillEmail(Constant.email)
                .fillPassword(Constant.password)
                .fillPasswordConfirm(Constant.passwordConfirm)
                .clickOnSignUpSecond();
        Assert.assertEquals(Constant.userNameValidation, PageFactory.instance().signUpPage().getTextOfUserNameValidation());
    }

    @Test(priority =3)
    public void TC3_Verify_Terms_Conditions_Redirect() throws MalformedURLException {
       // PageFactory.instance().homePage().clickOnAllow()
             //   .clickOnAllow()
       PageFactory.instance().homePage().clickOnXBtn();
        PageFactory.instance().homePage().clickOnMeBtn()
                .clickOnLoginBtn()
                .clickOnTermsAndConditions();
                Assert.assertEquals(Constant.termsAndConditionsTitle, PageFactory.instance().termsAndConditionsPage().getTextTermsAndConditionsTitle());
    }
}
