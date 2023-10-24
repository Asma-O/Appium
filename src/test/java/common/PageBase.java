package common;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class PageBase {
    private static final int ELEMENT_WAIT_PERIOD_SECS = 30;
    protected AndroidDriver androidDriver;
    private WebDriverWait _wait;
    private static int count = 0;

    public PageBase(AndroidDriver androidDriver) {
        this.androidDriver = androidDriver;
        _wait = new WebDriverWait(androidDriver, Duration.of(ELEMENT_WAIT_PERIOD_SECS, TimeUnit.SECONDS.toChronoUnit()));
        PageFactory.initElements(this.androidDriver, this);

    }

    /**
     * @param element Maximum wait = 30 seconds
     * @return wait.until(ExpectedConditions.elementToBeClickable ( element));
     */
    public WebElement waitElement(WebElement element) {
        return _wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void tebOnPartOfElement(WebElement element,double percentage){
        _wait.until(ExpectedConditions.elementToBeClickable(element));
        int x =element.getLocation().x;
        int y =element.getLocation().y;
        new TouchAction(androidDriver).tap(PointOption.point(x+(int)(element.getSize().getWidth()*percentage),y)).perform();

    }

}
