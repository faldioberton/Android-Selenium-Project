package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objekrepository.pageForm;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class form extends hook {

    pageForm pageForm = new pageForm();

    @When("user input field")
    public void user_input_field() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageForm.getTxt_input())
        );
        String input = "testt";
        String inputResult;
        driver.findElement(pageForm.getTxt_input()).sendKeys(input);
        inputResult = driver.findElement(pageForm.getTxt_inputResult()).getAttribute("text");
        Assert.assertEquals(inputResult, input);
    }
    @And("user can change switch")
    public void user_can_change_switch() {
        driver.findElement(pageForm.getBtn_switch()).click();
        Boolean btn_status = Boolean. parseBoolean(driver.findElement(pageForm.getBtn_switch()).getAttribute("checked"));
        Assert.assertTrue(btn_status);
    }
    @And("user can choose item")
    public void user_can_choose_item() {
        driver.findElement(pageForm.getBtn_dropdown()).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageForm.getBtn_dropdownOptions())
        );
        List<WebElement> dropdownOptions = driver.findElements(pageForm.getBtn_dropdownOptions());
        dropdownOptions.get(1).click();
    }
    @And("user click active button")
    public void user_click_active_button() {
        driver.findElement(pageForm.getBtn_active()).click();
    }
    @Then("user click ok")
    public void user_click_ok() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageForm.getBtn_okOnModal())
        );
        driver.findElement(pageForm.getBtn_okOnModal()).click();
    }
    //swipe
    //MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
      //              "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
        //                    ".scrollIntoView(new UiSelector().text(\"Active\"))"));
}
