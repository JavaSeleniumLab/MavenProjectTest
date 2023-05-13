package DriverWrapper;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;

public class DriverSetUp {

    private static WebDriver driver;

     // WebDriver driver = new ChromeDriver();


    @BeforeTest
    public void deleteOldScreenShots(){
        File fileToDelete = new File("./FailedScreenShots");
        File deletePassed = new File("./PassedScreenShots");
        File allureFolder = new File("./allure-results");
        try {
            FileUtils.cleanDirectory(fileToDelete);
            FileUtils.cleanDirectory(deletePassed);
            FileUtils.cleanDirectory(allureFolder);
            System.out.println("Old ScreenShots Deleted Successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Parameters({"browserName"})

    @BeforeMethod
    public void driverInitialization(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/signup");
        driver.manage().window().maximize();

    }


    public static WebDriver getDriver() {
        return driver;
    }



    @AfterMethod
    public void closeDriverInstance(){
        driver.quit();
    }


    public void takeScreenShotForFailedTests(String testMethodName) {
         TakesScreenshot ts = (TakesScreenshot)driver;
        {
            File scr = ts.getScreenshotAs(OutputType.FILE);
            File dest = new File("./FailedScreenShots/"+ testMethodName+".png");

            try {
                FileUtils.copyFile(scr, dest);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public void takeScreenShotForPassedTests(String testMethodName) {
        TakesScreenshot ts = (TakesScreenshot)driver;
        {
            File scr = ts.getScreenshotAs(OutputType.FILE);
            File dest = new File("./PassedScreenShots/"+ testMethodName+".png");

            try {
                FileUtils.copyFile(scr, dest);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
