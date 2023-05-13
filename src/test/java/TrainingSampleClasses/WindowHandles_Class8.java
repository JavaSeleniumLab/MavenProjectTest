package TrainingSampleClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandles_Class8 {



        @Test
        public void windowHandlesTest() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();



       WebElement newTabElement = driver.findElement(By.xpath("//button[@id='tabButton']"));
       newTabElement.click();


       Thread.sleep(3000);


       WebElement newWindowElement = driver.findElement(By.xpath("//button[@id='windowButton']"));
       newWindowElement.click();


       Thread.sleep(2000);

       //driver.close() ---> will close very 1st Window, opened by driver; the Rest of opened tabs/widows remain open;
       //driver.close();


       //Closes all Windows opened by driver!
      // driver.quit();



       // we handle multiple Windows/Tabs with the help method getWindowHandle() --->1, provide 1st Window Session ID;

      String currentWindowHandle =  driver.getWindowHandle();
      System.out.println("Current window : " + currentWindowHandle);


      // All Window Session Id:
      Set<String> allWindowHandles =  driver.getWindowHandles();// 3 Handles
      System.out.println("All window IDs : " + allWindowHandles);


      //With the help of switchTo() we can jump from one to another:

            for (String handles : allWindowHandles){
                if(!handles.equals(currentWindowHandle)){
                    driver.switchTo().window(handles);
                    driver.close();
                }
            }

    }
}
