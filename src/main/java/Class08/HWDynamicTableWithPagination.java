package Class08;

import Utils.CommonMethods;
import jdk.jfr.Threshold;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HWDynamicTableWithPagination extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/table-pagination-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

//finding the elements in the 4th column within the table rows and storing them in a list of remarks Elements

        do{
            List<WebElement> remarksElements=driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr/td[7]"));
            for(int i=0;i<remarksElements.size();i++){
                if(remarksElements.get(i).getText().equalsIgnoreCase("pass")){
                    System.out.println("The row number is "+i);
                    WebElement row=driver.findElement(By.xpath("//table[@class='table table-hover']/tbody/tr ["+ (i+1) +"]"));
                    System.out.println(row.getText());
                }
            }
            System.out.println();
            try {
                // Try to find the last page when it is active
                WebElement lastPage =driver.findElement(By.xpath("//li[@class='active']/a[@class='page_link page_link_03']"));

                // If the active element is found, break from the do while loop
                break;

            } catch (Exception e){
                //display message if the element is not found
                System.out.println("continuing with execution until the last table page is found");
            }

            WebElement nextPage = driver.findElement(By.xpath("//a[@class='next_link']"));
            nextPage.click();

        }while(true);
    }
}
