package stepdefinition;

import io.cucumber.java.en.And;
import objekrepository.pagewebView;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class webView extends hook {

    pagewebView pagewebView = new pagewebView();

    @And("user click Get Started")
    public void user_click_Get_Started() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pagewebView.getGet_started())
        );
        driver.findElement(pagewebView.getGet_started()).click();

    }
}
