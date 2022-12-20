package stepdefinition;


import config.environment;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import objekrepository.pageHome;

import java.net.MalformedURLException;

public class home extends hook {

    pageHome pageHome = new pageHome();

    @Given("user in Home page")
    public void user_in_Home_page() throws MalformedURLException {
        before();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageHome.getPage_home())
        );
    }
    @When("user access form page")
    public void user_access_form_page() {
        driver.findElement(pageHome.getBtn_form()).click();
    }

    @When("user access swipe page")
    public void user_access_swipe_page() {
        driver.findElement(pageHome.getBtn_swipe()).click();
    }
    @When("user click login")
    public void user_click_login() {
        driver.findElement(pageHome.getBtn_login()).click();
    }
    @When("user access drag page")
    public void user_access_drag_page() {
        driver.findElement(pageHome.getBtn_drag()).click();
    }
    @When("user access webView page")
    public void user_access_webView_page() {
        driver.findElement(pageHome.getBtn_webView()).click();
    }

}