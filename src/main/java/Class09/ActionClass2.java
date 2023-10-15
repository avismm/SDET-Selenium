package Class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://demo.guru99.com/test/simple_context_menu.html";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement rightClick =driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action =new Actions(driver);
        //right-clicking on the element
        action.contextClick(rightClick).perform();

        //draggable
        WebElement dragFrom =driver.findElement(By.xpath("div[@id=graggable"));

        //dropLocation
        WebElement dragTo =driver.findElement(By.xpath("//div[@id=droppable]"));
        //action.dragAndDrop(dragFrom,dragTo).perform();
        action.clickAndHold(dragFrom).moveToElement(dragTo).release().build().perform();


    }

}
