package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objekrepository.pageForm;
import objekrepository.pageLogin;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class login extends hook {
    pageLogin pageLogin = new pageLogin();
    @When("user input field email")
    public void user_input_field_email() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageLogin.getForm_email())
        );
        String input = "faldioberton17@gmail.com";
        driver.findElement(pageLogin.getForm_email()).sendKeys(input);
    }
    @When("user input field password")
    public void user_input_field_password() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageLogin.getForm_password())
        );
        String input = "faldi123";
        driver.findElement(pageLogin.getForm_password()).sendKeys(input);
    }
    @When("user click login button")
    public void user_click_login_button() {
        driver.findElement(pageLogin.getBtn_login()).click();
    }
    @Then("user click OK")
    public void user_click_ok() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageLogin.getBtn_ok())
        );
        driver.findElement(pageLogin.getBtn_ok()).click();
    }
}
