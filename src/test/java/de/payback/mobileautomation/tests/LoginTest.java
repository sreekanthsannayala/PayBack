package de.payback.mobileautomation.tests;

import com.tngtech.jgiven.junit.ScenarioTest;
import de.payback.mobileautomation.StepDef.GivenIAmAtTheLoginPage;
import de.payback.mobileautomation.StepDef.ThenSomeOutcome;
import de.payback.mobileautomation.StepDef.WhenSomeAction;
import org.junit.After;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


public class LoginTest extends ScenarioTest<GivenIAmAtTheLoginPage, WhenSomeAction, ThenSomeOutcome> {
    WebDriver driver;

    @Test()
     public void login_Into_Payback_$() throws InterruptedException {

        getScenario().startScenario("");

        given()
                .i_create_new_user_$();
        then().
                i_validate_the_HomePage_$("Partner erkunden");
        when().
                i_click_on_the_Coupons_$();
        then().
                i_validate_the_coupons_page_$();

    }

    @After
    public void tearDown() {

        driver.quit();
    }

//    @Override
//    public Scenario<GivenIAmAtTheLoginPage, WhenSomeAction, ThenSomeOutcome> getScenario() {
//        return null;
//    }
}
