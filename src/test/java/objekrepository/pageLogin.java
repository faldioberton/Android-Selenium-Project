package objekrepository;

import org.openqa.selenium.By;

public class pageLogin {
    By form_email = By.xpath("//android.widget.EditText[@content-desc=\"input-email\"]");

    By form_password = By.xpath("//android.widget.EditText[@content-desc=\"input-password\"]");

    By btn_login = By.xpath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]");

    By btn_ok = By.xpath("//android.widget.Button[@resource-id='android:id/button1']");

    public By getForm_email() {
        return form_email;
    }

    public By getForm_password() {
        return form_password;
    }

    public By getBtn_login() {
        return btn_login;
    }

    public By getBtn_ok() {
        return btn_ok;
    }
}
