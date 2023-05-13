package TrainingSampleClasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts_Class8 {

/**
 * Alerts in Selenium ---> a small message box, that appears on the screen to provide a user some informational text
 *                         message or warning;
 *
 **/


    @Test
    public void testForAlert() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.manage().window().maximize();


        // We are searching for 1 Alert Box;
       WebElement alertBox1 = driver.findElement(By.xpath("//button[@id='alertBox']"));

       alertBox1.click();

        //Created reference variable of Alert and switched to it;
       Alert alertOne = driver.switchTo().alert();// standard for all Alerts;
        // User can accept, clicking ok/agree/:
        Thread.sleep(2000);
       alertOne.accept();


       //User can  dismiss(), saying cancel, dismiss;
        // Find locator for Second Box;
       // alertTwo.dismiss();


        //User can sendKeys() ---> to send some requested Info;
        // Find locator for 3rd Box;
        // alertThree.sendKeys("Some Info").accept() or dismiss();



    }








}




