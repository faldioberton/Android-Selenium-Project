package objekrepository;

import org.openqa.selenium.By;

public class pageDrag {
    By drag_1atas = By.xpath("//android.view.ViewGroup[@content-desc=\"drop-l2\"]/android.view.ViewGroup");
    By drag_1bawah = By.xpath("//android.view.ViewGroup[@content-desc=\"drag-l2\"]/android.widget.ImageView");

public By getDrag_1atas() {
    return drag_1atas;
}
public By getDrag_1bawah() {
    return drag_1bawah;

    }
}
