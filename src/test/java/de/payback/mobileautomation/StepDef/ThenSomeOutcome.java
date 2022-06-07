package de.payback.mobileautomation.StepDef;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.annotation.ScenarioState;
import de.payback.mobileautomation.pages.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ThenSomeOutcome extends Stage<ThenSomeOutcome> {
    @ProvidedScenarioState
   @ExpectedScenarioState
    WebDriver driver;
    @ScenarioState
    LoginPage loginPage;

    public ThenSomeOutcome i_validate_the_HomePage_$(String text) throws InterruptedException {
        Assert.assertTrue(loginPage.verifyHomePageHeader().equalsIgnoreCase(text));

        return self();
    }

    public ThenSomeOutcome i_validate_the_coupons_page_$(){
        Assert.assertTrue(loginPage.validateCouponsPage());
        return self();
    }
}
