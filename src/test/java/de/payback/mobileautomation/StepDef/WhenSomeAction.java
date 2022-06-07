package de.payback.mobileautomation.StepDef;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.annotation.ScenarioState;
import de.payback.mobileautomation.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class WhenSomeAction extends Stage<WhenSomeAction> {
    @ProvidedScenarioState
    WebDriver driver;
    @ScenarioState
    LoginPage loginPage;


    public WhenSomeAction i_click_on_the_Coupons_$() {
        loginPage.clickOnCoupons();
        loginPage.clickOnFilterSec();
        loginPage.clickOnAnyCoupon();
        loginPage.clickOnDoneButton();

        return self();
    }
}
