package common;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.net.URL;


public class Capability {
    static AndroidDriver driver;
    public Capability() {
    }

    /**
     * @return Mobile Driver
     */
    public static AndroidDriver createInstance() throws MalformedURLException {
        return createInstance(null);
    }
    /**
     * @param MobilePlatform Android, iOS
     * @return MobileDriver
     */
    @BeforeMethod
    public static AndroidDriver createInstance(String MobilePlatform) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //Set up desired capabilities and pass the Android app-activity and app-package to Appium
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, Constant.deviceName);
        capabilities.setCapability("appPackage", Constant.appPackage);
        capabilities.setCapability("appActivity", Constant.appActivity);
        capabilities.setCapability("app",Constant.appAPK);
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("noReset", "false");
        capabilities.setCapability("autoGrantPermissions", "true");
        return driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }




}
