package objekrepository;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileCommand;
import org.openqa.selenium.By;

public class pageswipe {
    static By page_swipe = By.xpath("//android.widget.ScrollView[@content-desc='Swipe-screen']");
    static By icon_robot = By.xpath("//android.widget.ImageView[@content-desc='WebdriverIO logo']");
    static By scroll_toCompatible = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList().scrollIntoView(textContains(\"COMPATIBLE\"))");
    static By scroll_toRobot = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"You found me!!!\"))");

    public static By getPage_swipe() {
        return page_swipe;
    }

    public By getScroll_toCompatible() {
        return scroll_toCompatible;
    }

    public static By getIcon_robot() {
        return icon_robot;
    }

    public static By getScroll_toRobot() {
        return scroll_toRobot;
    }
}
