package Class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class FileUpload extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://35.175.58.98/keypress.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement fileUpload =driver.findElement(By.xpath("//input[@id='image-file']"));
        fileUpload.sendKeys("C:\\Users\\LENOVO\\OneDrive\\Desktop\\Profile_Image.jpg");

    }

}
