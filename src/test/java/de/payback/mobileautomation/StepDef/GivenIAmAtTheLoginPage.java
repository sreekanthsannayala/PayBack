package de.payback.mobileautomation.StepDef;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.annotation.ScenarioState;
import de.payback.mobileautomation.pages.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class GivenIAmAtTheLoginPage extends Stage<GivenIAmAtTheLoginPage> {
@ProvidedScenarioState
    WebDriver driver;
    @ScenarioState
    LoginPage loginPage = new LoginPage();




    public GivenIAmAtTheLoginPage I_am_at_the_login_page() {
        return self();
    }

    public GivenIAmAtTheLoginPage i_create_new_user_$() throws InterruptedException {
        loginPage.clickOnCreateNewAccountButton();
        Assert.assertTrue(loginPage.verifyTheCookiesInformation());
        loginPage.acceptCookies();
        loginPage.choosePaybackNewTradingCard();
        loginPage.clickOnContinueButton();
        loginPage.provideEmailAddToGenerateNewAccount();
        loginPage.clickOnAgreedButton();
        loginPage.provideCustomerDetails();



        return self();
    }
}
