package testCasesSteps;


import common.PageFactory;
import org.testng.annotations.*;

import java.net.MalformedURLException;

public class Hooks  {


    @BeforeMethod(alwaysRun = true)
    public void beforeScenario() {
        System.out.println("custom Before scenario hook");
    }

    @AfterMethod(alwaysRun = true)
    public void afterScenario() throws MalformedURLException {
        System.out.println("custom After UI scenario hook");
    	/************Leave cookies to skip google login*************/
    	//delete cookies
       // PageFactory.instance().deleteAllDriverCookies();
        System.out.println("After hooks");
        PageFactory.instance().CloseDriver();

    }

//    @AfterSuite
//   // @Test
//    public void emailReport(){
//        System.out.println("Sending email report");
//        EmailReport.deleteFolder();
//        EmailReport.sendEmail();
//        System.out.println("Email sent");
//    }


}