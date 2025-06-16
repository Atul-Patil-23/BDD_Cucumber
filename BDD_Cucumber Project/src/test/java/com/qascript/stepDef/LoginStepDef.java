package com.qascript.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class LoginStepDef {

    WebDriver driver;
    @Given("I am on google page")
    public void iAmOnGooglePage() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        System.out.println("Google page");
    }

    @When("I enter words")
    public void iEnterWords() {
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
        Actions act=new Actions(driver);
        act.sendKeys(Keys.ENTER).perform();
    }

    @Then("It will navigate")
    public void itWillNavigate() {
        System.out.println("selenium page");
    }


    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed");
        }
    }

}
