package TrainingSampleClasses;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ImplicitWait_Class9 {

    /**
     * Thread.sleep(2000) ---> not used on regular basis;
     * Implicit wait not used;
     *
     * Implicit Wait ---> is a global type of a Wait, that defined after we launch any web-site. Once we pass time to wait
     * in some seconds, that wait period will be applied to all methods, where we have:
     *                1. findElement();
     *                2. findElements();
     *
     * It will wait until indicated period of time, if WebElement found it will return right away,
     * if not found, throws "NoSuchElementException";
     *
     *
     * polling period ---> will keep on checking with certain time range;
     *                      250 ms;
     *                      1 second == 1000 ms; (4), in total for 8 seconds ---> 32 times check;
     *                      250 ms ---> check
     *                      250 ms ---> check
     *                      250 ms ---> check
     *                      250 ms ---> check;
     *
     *  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     **/



        @Test
        public void implicitWaitTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        driver.manage().window().maximize();


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



        // Intentionally failing xPath;
        WebElement inputSearchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        WebElement inputSearchBox2 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        WebElement inputSearchBox3 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        driver.quit();

    }

}
