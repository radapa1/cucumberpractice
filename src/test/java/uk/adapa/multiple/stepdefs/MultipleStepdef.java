package uk.adapa.multiple.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MultipleStepdef extends CommonFeatures {

    public MultipleStepdef() {
    }

    @Given("user opens browser and launches bbc website")
    public void user_opens_browser_and_launches_bbc_website() {

        //open the browser of user choice
        launchBrowser();
        driver.get(prop.getProperty("url1"));
        tearDown();
    }

    @Given("user opens browser and launches amazon website")
    public void user_opens_browser_and_launches_amazon_website() {
        launchBrowser();
        driver.get(prop.getProperty("url2"));
        tearDown();
    }

    @Given("user opens browser and launches axone website")
    public void userOpensBrowserAndLaunchesAxoneWebsite() {
        launchBrowser();
        driver.get(prop.getProperty("url3"));
        tearDown();
    }

    @When("user clicks on Login link")
    public void userClicksOnLoginLink() {
        System.out.println("login link clicked");
    }

    @Then("User is presented with login details screen")
    public void userIsPresentedWithLoginDetailsScreen() {
        System.out.println("User logged into the page");
    }
}
