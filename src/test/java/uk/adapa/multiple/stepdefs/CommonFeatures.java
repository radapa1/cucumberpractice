package uk.adapa.multiple.stepdefs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CommonFeatures {

  /*
    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
*/
    public  WebDriver driver;
    public String filepath;
    public Properties prop;

    public CommonFeatures() {

            filepath = System.getProperty("user.dir") + "/src/test/resources/mydetails.properties";
            prop = new Properties();

            try {
                FileInputStream fis = new FileInputStream(filepath);
                prop.load(fis);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            //     System.out.println( prop.getProperty("url3"));


    }

    public void launchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void launchBrowser1(String baseurl){
        driver.get(baseurl);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void tearDown(){
        driver.quit();
    }
}



