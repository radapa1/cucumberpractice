package uk.adapa.cucumber.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

public class LoginStepDefs {
    WebDriver driver;
    String expectedresult;
    String actualresult;

    @Given("I opened application in browser")
    public void i_opened_application_in_browser() throws InterruptedException {
        System.out.println("This is the first method from feature file");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //  driver.get("http://seleniumpractice.axone-tech.uk/index.php");
        //  driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();

        driver.get("https://www.crmpro.com/");
        WebDriverWait wait = new WebDriverWait(driver, 30);
       wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"intercom-container\"]/div/div[1]/iframe")));
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"intercom-container\"]/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]"))).perform();
        driver.findElement(By.xpath("//*[@id=\"intercom-container\"]/div/div/div[1]/div/div/span")).click();

        driver.findElement(By.xpath("//body/div[@id='intercom-container']/div[1]/iframe[1]\n")).click();


      //  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"intercom-container\"]/div/div[1]/iframe\n")));

        driver.switchTo().frame("//*[@id=\"intercom-container\"]/div/div/div[1]/div[3]/div/div");

     //   action.moveToElement(driver.findElement(By.xpath("//div[@classs='intercom-vmab6f e132y98q3']\n"))).perform();

        driver.findElement(By.xpath("//button[@class='intercom-1f9kx8r e1twqv5u0']\n")).click();

        Thread.sleep(2000);

    }

        @When("I entered user id and password and clicked on signin button")
    public void i_entered_user_id_and_password_and_clicked_on_signin_button() throws InterruptedException {
       driver.findElement(By.xpath("//input[@id='email']")).sendKeys("radapa1@gmail.com");
       driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("India123");
       driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")).click();
       Thread.sleep(500);
    }

    @Then("successfully logged into the application")
    public void successfully_logged_into_the_application() {

        driver.quit();
        System.out.println("This is the 3rd method");

    }

    @Given("user launched the application")
    public void user_launched_the_application() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://seleniumpractice.axone-tech.uk/index.php");
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
        WebElement authentication =  driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1"));

        if (authentication.isDisplayed()){
            System.out.println("authentication page is fine and proceed with execution");
           // driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("radapa1@gmail.com");
            driver.findElement(By.id("email")).sendKeys("radapa1@gmail.com");
            driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("India123");
            driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
        }else{
            System.out.println("user is not on authentication page");
        }






      //  expectedresult = "Login - Axone Selenium Practice Portal11";
      //  actualresult = driver.getTitle();

/**

        if (actualresult.equals(expectedresult)){


            System.out.println("Actual and Expected results are same. The page title is  " + actualresult);

        }else {
            System.out.println("Actual and Expected results are not same. The page title is  " + actualresult);
        }
*/
        driver.quit();

     }

    @When("verified the required links")
    public void verifyied_the_required_links() {

        driver.findElement(By.xpath("//*[@id=\"header-content\"]/nav/div[1]/div/div[2]/ul[2]/li[3]/a/span")).click();
      //  pagetitle = driver.getTitle();
      //  System.out.println(pagetitle);
     //   Assert.assertEquals(homepagetitle,pagetitle)

        ;

    }

}
