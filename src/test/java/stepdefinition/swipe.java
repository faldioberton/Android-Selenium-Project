package stepdefinition;
import config.environment;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import objekrepository.pageswipe;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.management.MalformedObjectNameException;
import java.net.MalformedURLException;
import java.net.URL;

import static stepdefinition.swipe.capabilities;


public class swipe extends environment{

    pageswipe pageswipe = new pageswipe();

   // @And("user click on Js foundation menu")
    //public void user_click_on_js_foundation_menu() {
      //  wait.until(
        //        ExpectedConditions.visibilityOfElementLocated(pageswipe.getPage_swipe())
        //);
        //driver.findElement(pageswipe.getScroll_toCompatible()).click();
    //}
    @And("user swipe vertical")
    public void user_swipe_vertical() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageswipe.getPage_swipe())
        );
        driver.findElement(pageswipe.getScroll_toCompatible()).isDisplayed();
    }
    @And("user found robot")
    public void user_found_robot() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageswipe.getPage_swipe())
        );
        driver.findElement(pageswipe.getScroll_toRobot());
        driver.findElement(pageswipe.getIcon_robot()).isDisplayed();
    }
}
