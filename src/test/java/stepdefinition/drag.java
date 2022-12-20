package stepdefinition;

import config.environment;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.And;
import objekrepository.pageDrag;
import objekrepository.pageswipe;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;


public class drag  extends environment {
    TouchAction touch = new TouchAction(driver);

    pageDrag pageDrag = new pageDrag();
        objekrepository.pageswipe pageswipe = new pageswipe();
        @And("user drag and drop object")
        public void user_drag_and_drop_object() {
            WebElement from1 = driver.findElement(pageDrag.getDrag_1bawah());
            WebElement to1 = driver.findElement(pageDrag.getDrag_1atas());
            touch.longPress(longPressOptions().withElement(element(from1)).withDuration(ofSeconds(30))).moveTo(element(to1)).release().perform();
    }
}
