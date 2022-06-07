package de.payback.mobileautomation.pages;

import com.sun.javafx.scene.traversal.Direction;
import com.tngtech.jgiven.annotation.ScenarioState;
import de.payback.accelerators.WaitHelper;
import de.payback.utilities.FileUtilities;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.logging.Logger;

public class LoginPage extends BasePage{
@ScenarioState
    boolean isPresent = false;
    Logger log;
    WaitHelper waitHelper = new WaitHelper(driver);


    @AndroidFindBy(id = "welcome_registerbutton")
    private WebElement createAccount;

    @AndroidFindBy(xpath = "//android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.widget.TextView[1]")
    private WebElement cookiesMessage;

    @AndroidFindBy(xpath = "//android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.Button[2]")
    private WebElement acceptCookies;

    @AndroidFindBy(xpath = " //android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]")
    private WebElement paybackTradingCardRadioButton;

    @AndroidFindBy(xpath = "//android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]")
    private WebElement continueButton;

    @AndroidFindBy(xpath = "//android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.EditText")
    private WebElement emailAddress;


    @AndroidFindBy(xpath = "//android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.Button")
    private WebElement agreedButton;

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View[2]/android.view.View[1]")
    private WebElement salutationButton;

    @AndroidFindBy(xpath = "//android.view.View/android.view.View[5]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText")
    private WebElement firstNameField;

    @AndroidFindBy(xpath = "//android.view.View/android.view.View[5]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText")
    private WebElement lastNameField;

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View[6]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText")
    private WebElement addressField;

    @AndroidFindBy(xpath = "//android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText")
    private WebElement pinCodeField;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText")
    private WebElement placeField;

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[1]")
    private WebElement dateFiled;

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]")
    private WebElement monthField;

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[3]")
    private WebElement yearField;

    @AndroidFindBy(xpath = "//android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.widget.Button")
    private WebElement continueButtonOnRegistration;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.view.View/android.view.View/android.view.View[4]/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.widget.EditText")
    private WebElement createPassword;

    @AndroidFindBy(xpath = "//android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[7]/android.view.View/android.widget.Button")
    private WebElement continueButtonOnPasswordCreation;

    @AndroidFindBy(xpath = "//android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[3]/android.widget.Button[1]")
    private WebElement continueButtonOnAccountCreation;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView")
    private WebElement homePageHeader;

    @AndroidFindBy(id = "coupon_nav_graph")
    private WebElement coupons;

    @AndroidFindBy(id = "filter_button")
    private WebElement filterSec;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"1 Coupon\"])[1]\n")
    private WebElement couponSelection;

    @AndroidFindBy(id = "done")
    private WebElement doneButton;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Nicht aktiviert (1)\"]/android.widget.TextView")
    private WebElement activatedCoupons;




    public void clickOnCreateNewAccountButton(){
        waitHelper.waitFor(createAccount);
        createAccount.click();
    }

    public boolean verifyTheCookiesInformation(){
        waitHelper.waitFor(cookiesMessage);
        return cookiesMessage.isDisplayed();
    }

    public void acceptCookies(){
        waitHelper.waitFor(acceptCookies);
        acceptCookies.click();
    }

    public void choosePaybackNewTradingCard() throws InterruptedException {
        waitHelper.waitFor(paybackTradingCardRadioButton);
        Thread.sleep(5000);
        paybackTradingCardRadioButton.click();
    }

    public void clickOnContinueButton(){
        waitHelper.waitFor(continueButton);
        continueButton.click();
    }

    public void provideEmailAddToGenerateNewAccount(){
        String strRandomValue= FileUtilities.GetCurrentTimeStampAsString();
        String email = "sreekanth.sannayala+" + strRandomValue + "@gmail.com";
        String password = "";
        waitHelper.waitFor(emailAddress);
        emailAddress.sendKeys(email);
        swipeScreen(Direction.DOWN);
        swipeScreen(Direction.DOWN);
    }

    public void clickOnAgreedButton() throws InterruptedException {
        waitHelper.waitFor(agreedButton);
        Thread.sleep(4000);
        agreedButton.click();
    }

    public void provideCustomerDetails() throws InterruptedException {
       // Customer customer = CSVParserUtils.getLoginCreds("General");
        Thread.sleep(6000);
        waitHelper.waitFor(salutationButton);
        salutationButton.click();

        waitHelper.waitFor(firstNameField).sendKeys("Sreekanth");
        waitHelper.waitFor(lastNameField).sendKeys("Sannayala");
        String pin = FileUtilities.generateRandomNumber(5);
        String pincode = FileUtilities.generateRandomNumber(5);
        waitHelper.waitFor(addressField).sendKeys("Dieter Wellhausen");
        swipeScreen(Direction.DOWN);
        swipeScreen(Direction.DOWN);
        waitHelper.waitFor(pinCodeField).sendKeys(pincode);
        waitHelper.waitFor(placeField).sendKeys("Berlin"+pin);

        waitHelper.waitFor(dateFiled).sendKeys("09");
        waitHelper.waitFor(monthField).sendKeys("10");
        waitHelper.waitFor(yearField).sendKeys("1989");
        waitHelper.waitFor(continueButtonOnRegistration).click();
        waitHelper.waitFor(continueButtonOnRegistration).click();
        swipeScreen(Direction.DOWN);
        swipeScreen(Direction.DOWN);
        waitHelper.waitFor(createPassword).sendKeys("jaisriram9S");
        waitHelper.waitFor(continueButtonOnPasswordCreation).click();
        waitHelper.waitFor(continueButtonOnAccountCreation).click();
        Thread.sleep(10000);
    }

    public String verifyHomePageHeader() throws InterruptedException {
        swipeScreen(Direction.DOWN);
        Thread.sleep(4000);
        waitHelper.waitFor(homePageHeader);
        return homePageHeader.getText();

    }


    public void clickOnCoupons(){
        waitHelper.waitFor(coupons).click();
    }

    public void clickOnFilterSec(){
        waitHelper.waitFor(filterSec).click();
    }

    public void clickOnAnyCoupon(){
        waitHelper.waitFor(couponSelection).click();
    }

    public void clickOnDoneButton(){
        waitHelper.waitFor(doneButton).click();
    }

    public boolean validateCouponsPage(){
        return waitHelper.waitFor(activatedCoupons).isDisplayed();
    }






}

