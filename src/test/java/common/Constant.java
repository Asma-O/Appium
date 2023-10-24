package common;

import java.util.Random;

public class Constant {

    // Common for all test cases


    public static final String appActivity = "com.apkpure.aegon.main.activity.SplashActivity";
    public static final String appPackage = "com.apkpure.aegon";
    public static final String deviceName = "emulator-5554";
    public static final String appAPK = System.getProperty("user.dir") +"\\src\\main\\resources\\apku.apk";
    public static final String downloadFolder = System.getProperty("user.dir") +"\\downloads\\download";
    public static final String username = "asma"+new Random().nextInt(100);
    public static final String email = "c.c"+new Random().nextInt(100)+"@gmail.com";
    public static final String password = "123456789";
    public static final String passwordConfirm = "123456789";

    public static final String MobilePlatform = "Android";

    public static final String userNameValidation = "The username is invalid.";

    public static final String termsAndConditionsTitle = "Terms of Service";

    public static final String connectYourEmailLable = "Connect to your email";

}
