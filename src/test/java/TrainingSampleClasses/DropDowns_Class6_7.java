package TrainingSampleClasses;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class DropDowns_Class6_7 {

    @Ignore
    @Test(priority = 1)
    public void selectedNotSelected() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/signup");
        driver.manage().window().maximize();

        //Thread.sleep(3000);

        /**
         * Steps to Interact with Dropdowns:
         *
         * 1.   Find a locator; --- with "By" dataType;
         * 1.2. Find an Element; --- driver.findElement(locator/xPAth), by passing the found Locator(xpath), store in "WebElement" dataType
         * 2.Create an Object of Select class; Select select = new Select (WebElement)
         * 3.Demo on how we can dynamically handle dropdowns;
         *
         **/


        By byMonthLocator = By.xpath("//select[@id='month']"); // found the Locator;

        WebElement byMonthElement = driver.findElement(byMonthLocator);

        Thread.sleep(3000);

        // by passed WebElement we have an access to make certain selection with var "selectByTextValue";
        // select with "selectByVisibleText" --- passing any Visible Text;
        // Select selectByTextValue = new Select(byMonthElement);
        // selectByTextValue.selectByVisibleText("Jul");

/*
        // by "selectByIndex", passed index as an "int"
        By monthLocator = By.xpath("//select[@id='month']");// here we have extracted 12 indexes;
        WebElement monthElement = driver.findElement(monthLocator);
        Select selectByIndex = new Select(monthElement); //
        selectByIndex.selectByIndex(9); //select "Oct"*/


        //12 Lines of Code in order to select it for 1 User!

        //by "selectByValue", pass any value to the Value attribute;
        By monthValueLocator = By.xpath("//select[@id='month']");// here we have extracted 12 indexes;
        WebElement monthValueElement = driver.findElement(monthValueLocator);
        Select selectByValue = new Select(monthValueElement);
        selectByValue.selectByValue("12");


        By dayLocator = By.xpath("//select[@id='day']");
        WebElement dayOfTheMonthElement = driver.findElement(dayLocator);
        Select byTextDay = new Select(dayOfTheMonthElement);
        byTextDay.selectByVisibleText("30");


        By yearLocator = By.xpath("//select[@id='year']");
        WebElement yearElement = driver.findElement(yearLocator);
        Select byValueYear = new Select(yearElement);
        byValueYear.selectByValue("2020");


        //  Thread.sleep(3000);
        //  driver.quit();

    }




    // GENERIC WAY TO HANDLE DROPDOWN;

    @Test(priority = 1)
    public void findElementsInDropDown() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/signup");
        driver.manage().window().maximize();


        // Within  5 Lines of Code we can select all possible months;

        String monthSelectedByUser = "Jun"; // could be any month;
        // We are found multiple WebElements and stored in a List of same Datatype; and it holds 12 Values == 12 months;
        List<WebElement> allMonthOptions = driver.findElements(By.xpath("//select[@id='month']/child::option"));
        // Starting Loop, and equaling to the Size of allMonthOptions.List == 12 ;

        for (int i = 0; i < allMonthOptions.size(); i++) {
            // Currently allMonthOptions has all 12 months, with allMonthOptions.get(i) ---> we trying to reach each value in a List
            // getText() ---> extracting all allMonthOptions Values in text, which returns "String" datatype;
            // asking if that particular logic contains another "String", which is "monthSelectedByUser"
            if (allMonthOptions.get(i).getText().contains(monthSelectedByUser)) { // if this returns true;
                //we asking to click() on  that particular value;
                allMonthOptions.get(i).click();
            }
        }

        Thread.sleep(3000);


        String daySelectedByUser = "22";

        // there are 31 days in this List<Webelement>
        List<WebElement> allDayInMonthOptions = driver.findElements(By.xpath("//select[@id='day']/child::option"));

        for (int i = 0; i < allDayInMonthOptions.size(); i++) {
            if (allDayInMonthOptions.get(i).getText().contains(daySelectedByUser)) {
                allDayInMonthOptions.get(i).click();
            }

        }

        Thread.sleep(3000);


        String yearSelectedByUser = "2012";
        // All 119 elements;
        List<WebElement> allYearOptions = driver.findElements(By.xpath("//select[@id='year']/child::option"));
        String extractedValue = "";


        for (int i = 0; i < allYearOptions.size(); i++) {

            if (allYearOptions.get(i).getText().contains(yearSelectedByUser)) {
                extractedValue = allYearOptions.get(i).getText();
                allYearOptions.get(i).click();
            }
        }

        Assert.assertEquals(yearSelectedByUser, extractedValue, "This Value not found");



        TakesScreenshot ts = (TakesScreenshot) driver;
        {
            File scr = ts.getScreenshotAs(OutputType.FILE);
            File dest = new File("./ScreenShots/"+this.getClass().getName() +".png");

            try {
                FileUtils.copyFile(scr, dest);
            } catch (IOException e) {
                e.printStackTrace();
            }

            Thread.sleep(3000);
            driver.quit();

        }


    }


}









