package TrainingSampleClasses;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class JavaScriptExecutor_Class9 {

    /**
     * Certain class ---> JavaScriptExecutor;
     *
     * Advantages of using JavaScriptExecutor Interface;
     *              1. Robust
     *              2. Provides options (scroll by Pixel), where selenium methods not able to;
     *              3. Mostly we refer to JS to find elements, where Selenium couldn't;
     **/


    @Test
    public void javaScriptExecutor() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com");

        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        driver.manage().window().maximize();


        Thread.sleep(300);

        // scroll By pixel 0, 700 will slightly scroll down :
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        // javascriptExecutor.executeScript("scrollBy(0,700)");



        // scroll to the Bottom :
        javascriptExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");


        Thread.sleep(3000);


        TakesScreenshot ts = (TakesScreenshot)driver;
        {
            //File type, taking screenshot from Actual Test Case (from Web) to destination;
            File source = ts.getScreenshotAs(OutputType.FILE);
            File destination = new File("./ScreenShots/"+".png");
            try {
                FileUtils.copyFile(source, destination);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }



        // This will scroll back to  support View Element;
       WebElement  supportElement =  driver.findElement(By.xpath("//h2[normalize-space()='24/7 Support']"));
       javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", supportElement);









       }
    }
