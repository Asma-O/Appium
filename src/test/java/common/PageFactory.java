package common;


import pages.*;

import java.net.MalformedURLException;

public class PageFactory extends PageFactoryAbstract {

    private static PageFactory _pageFactory;

    public PageFactory() throws MalformedURLException {
        super();
    }

    public static PageFactory instance() throws MalformedURLException {
        if (_pageFactory == null) {
            _pageFactory = new PageFactory();
        }
        return _pageFactory;
    }

    // Login page
    public LogInPage loginPage() throws MalformedURLException {return new LogInPage(getAndroidDriver());}
    //SignUp page
    public SignUpPage signUpPage() throws MalformedURLException {return new SignUpPage(getAndroidDriver());}

    // Home page
    public HomePage homePage() throws MalformedURLException {return new HomePage(getAndroidDriver());}


    // Terms and Conditions
    public TermsAndConditionsPage termsAndConditionsPage() throws MalformedURLException {return new TermsAndConditionsPage(getAndroidDriver());}


}


