package uk.adapa.cucumber.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefs {

    @Given("I opened application in browser")
    public void i_opened_application_in_browser() {
        System.out.println("This is test");
    }

    @When("I entered user id and password and clicked on signin button")
    public void i_entered_user_id_and_password_and_clicked_on_signin_button() {
        System.out.println("This is test");
    }

    @Then("successfully logged into the application")
    public void successfully_logged_into_the_application() {
        System.out.println("This is test");  System.out.println("This is test");
    }



}
