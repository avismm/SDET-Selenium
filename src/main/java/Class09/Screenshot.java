package Class09;

import Utils.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class Screenshot extends CommonMethods {
    public static void main(String[] args) throws IOException {
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        takeScreenshot("testFile");

        /*//declare instance
        TakesScreenshot ts =(TakesScreenshot) driver;
        //take screenshot and store it
        File ss=ts.getScreenshotAs(OutputType.FILE);

        //save the file to the computer
        FileUtils.copyFile(ss,new File("C:\\Users\\LENOVO\\IdeaProjects\\Selenium\\screenshot\\testFile.png"));*/



    }
}
