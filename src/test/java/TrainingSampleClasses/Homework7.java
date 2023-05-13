package TrainingSampleClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework7 {

    @Test(priority = 1)
    public void iFrameDemoqa() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

        driver.navigate().refresh();

        WebElement iFrameOne = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(iFrameOne);
        // Thread.sleep(2000);


         WebElement xpathForText = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));

         String actual = xpathForText.getText();

        String expected = "This is a sample page";
       // String actual = iFrameOne.getText();

        Assert.assertEquals(actual, expected, "The same");


        System.out.println("This is sample page : " + actual);

        driver.quit();

    }

}
