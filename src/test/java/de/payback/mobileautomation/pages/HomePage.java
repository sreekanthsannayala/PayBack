//package de.payback.mobileautomation.pages;
//
//import com.sun.javafx.scene.traversal.Direction;
//import com.tngtech.jgiven.annotation.ScenarioState;
//import de.payback.accelerators.WaitHelper;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import java.util.logging.Logger;
//
//public class HomePage  {
//
//    @ScenarioState
//    WebDriver driver;
//    boolean isPresent = false;
//    Logger log;
//    BasePage basePage =new BasePage();
//    WaitHelper waitHelper = new WaitHelper(driver);
//
//    @AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView")
//    private WebElement homePageHeader;
//
//    @AndroidFindBy(id = "Coupons")
//    private WebElement coupons;
//
//    @AndroidFindBy(id = "filter_button")
//    private WebElement filterSec;
//
//    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"1 Coupon\"])[1]\n")
//    private WebElement couponSelection;
//
//    @AndroidFindBy(id = "done")
//    private WebElement doneButton;
//
//    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Nicht aktiviert (1)\"]/android.widget.TextView")
//    private WebElement activatedCoupons;
//
//
//    public String verifyHomePageHeader(){
//        basePage.swipeScreen(Direction.DOWN);
//        waitHelper.waitFor(homePageHeader);
//       return homePageHeader.getText();
//    }
//
//    public void clickOnCoupons(){
//        waitHelper.waitFor(coupons).click();
//    }
//
//    public void clickOnFilterSec(){
//        waitHelper.waitFor(filterSec).click();
//    }
//
//    public void clickOnAnyCoupon(){
//        waitHelper.waitFor(couponSelection).click();
//    }
//
//    public void clickOnDoneButton(){
//        waitHelper.waitFor(doneButton).click();
//    }
//
//    public boolean validateCouponsPage(){
//        return waitHelper.waitFor(activatedCoupons).isDisplayed();
//    }
//
//
//}
