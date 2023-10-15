package Class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JsExecutor2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://35.175.58.98/input-form-locator.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        //scroll down
        WebElement inputBox =driver.findElement(By.xpath("//input[@id='first_name']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border = '5px solid red';", inputBox);

        WebElement buttonToClick =driver.findElement(By.xpath("//button[@id='submit_button']"));
       // js.executeScript("arguments[0].click();", buttonToClick);
        jsClick(buttonToClick);

    }
}
