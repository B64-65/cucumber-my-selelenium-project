package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefs {

    GooglePage googlePage = new GooglePage();
    @Given("user is on the google page")
    public void user_is_on_the_google_page() {
//WRITE YOUR CODE IN HERE FOR THIS STEP
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
    }

    @When("user search for iPhone on google")
    public void user_search_for_i_phone_on_google() {
//        Driver.getDriver().findElement(By.name("q")).sendKeys("iPhone"+ Keys.ENTER);
        googlePage.searchBox.sendKeys("iPhone"+Keys.ENTER);
    }
    @Then("verify the page title contains iPhone")
    public void verify_the_page_title_contains_i_phone() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));
    }
    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }


}
