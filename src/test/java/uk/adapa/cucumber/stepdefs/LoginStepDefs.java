package uk.adapa.cucumber.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefs {


    WebDriver driver;

    @Given("I opened application in browser")
    public void i_opened_application_in_browser() {
        System.out.println("This is the first method from feature file");

        WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.gov.uk/");


    }

    @When("I entered user id and password and clicked on signin button")
    public void i_entered_user_id_and_password_and_clicked_on_signin_button() {
        System.out.println("This is the 2nd method");
    }

    @Then("successfully logged into the application")
    public void successfully_logged_into_the_application() {
        System.out.println("This is the 3rd method");
    }



}
