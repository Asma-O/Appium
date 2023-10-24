package common;


import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public abstract class PageFactoryAbstract {

    public PageFactoryAbstract() throws MalformedURLException {
        this.setAndroidDriver(Capability.createInstance());
    }

    AndroidDriver _driver;

    @BeforeMethod
    public AndroidDriver getAndroidDriver() throws MalformedURLException {
        if (_driver == null) {
            _driver = Capability.createInstance();
        }
        return _driver;
    }

    @AfterMethod
    public void CloseDriver() throws MalformedURLException {
        if (this._driver != null){
//            PageFactory.instance().getAndroidDriver().resetApp();
//            PageFactory.instance().setAndroidDriver(null);
            this._driver.closeApp();
            this._driver.launchApp();


        }


    }


    public void setAndroidDriver(AndroidDriver driver) {
        this._driver = driver;
    }




}