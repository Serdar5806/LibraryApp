package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Login_StepDefinition {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the library login page")
    public void user_is_on_the_library_login_page() {
        String url = ConfigurationReader.getProperty("library-url");
        BrowserUtils.sleep(2);
        Driver.getDriver().get(url);
    }
    @When("user types a valid email and password")
    public void user_types_a_valid_email_and_password() {
        String username = ConfigurationReader.getProperty("studentUsername");
        String password = ConfigurationReader.getProperty("studentPassword");
        loginPage.login(username,password);
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        String url = Driver.getDriver().getCurrentUrl();
        System.out.println("url = " + url);

        Assert.assertTrue(url.contains("#books"));
    }

}
