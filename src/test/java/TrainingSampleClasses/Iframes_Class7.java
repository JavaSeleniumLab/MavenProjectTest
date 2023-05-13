package TrainingSampleClasses;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Iframes_Class7 {

    /**
     * IFrame in Selenium is a separate/embedded web page within the HTML document (nested WebSites).
     *       IFrames is often used to add content from another sources like an advertisements into current web sites
     *       IFrames defined with certain tagName <iframe>
     *
     **/


    @Test
    public void iFrameInSelenium() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com/");
        driver.manage().window().maximize();


        List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));

        System.out.println("All  IFrames in Yahoo == " + allFrames.size());


        // Custom xpath, written by QA;
        // By.xpath()


        // Can pass id value in certain ID tag:
        // By.id();


        // Can pass text value of certain Link in HTML document:
        // By.linkText()


        // Can pass just the tagName:
        // By.tagName();


        // Can pass by CSS, with certain syntax: tagName#anyValue_withinCertain  Attribute:
        // By.css();


        /**
         * In Automation we go to certain iFrame with the help of switchTo() method;
         *
         **/

        WebElement iFramePassed = driver.findElement(By.xpath("//iframe[@id='sda-LREC-iframe']")); // returns 1 Element;
        driver.switchTo().frame(iFramePassed);




            Thread.sleep(2000);

            driver.quit();

        }

    }



