package de.payback.mobileautomation.pages;

import com.sun.javafx.scene.traversal.Direction;
import de.payback.driverfacotry.CapabilitiesManager;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BasePage {
     public WebDriver driver;

    Logger log = Logger.getLogger(BasePage.class.getName());

    public BasePage() {

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), new CapabilitiesManager().getCaps());
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        }

    public void swipeScreen( Direction direction) {
        //WebDriver driver;
        AndroidDriver  driver1 = (AndroidDriver)driver;
        int endY = 0;
        Dimension size = driver1.manage().window().getSize();

        switch (direction) {
            case LEFT:
                int startY = (int) (size.height / 4);
                int startX = (int) (size.width * 0.05);
                int endX = (int) (size.width * 0.90);
                new TouchAction(driver1)
                        .press(PointOption.point(startX, startY))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(endX, startY))
                        .release()
                        .perform();
                break;
            case RIGHT:
                startY = (int) (size.height / 4);
                startX = (int) (size.width * 0.90);
                endX = (int) (size.width * 0.05);
                new TouchAction(driver1)
                        .press(PointOption.point(startX, startY))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(endX, startY))
                        .release()
                        .perform();
                break;
            case UP:
                endY = (int) (size.height * 0.70);
                startY = (int) (size.height * 0.30);
                startX = (int) (size.width / 2);
                new TouchAction(driver1)
                        .press(PointOption.point(startX, startY))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(startX, endY))
                        .release()
                        .perform();

                break;
            case DOWN:
                startY = (int) (size.height * 0.70);
                endY = (int) (size.height * 0.30);
                startX = (size.width / 2);
                new TouchAction(driver1)
                        .press(PointOption.point(startX, startY))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(startX, endY))
                        .release()
                        .perform();

                break;
        }
    }
    }

