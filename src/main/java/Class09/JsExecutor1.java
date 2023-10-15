package Class09;

import Utils.CommonMethods;
import org.openqa.selenium.JavascriptExecutor;

public class JsExecutor1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://35.175.58.98/simple_context_menu.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        //scroll down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, 500)");
    }
}
