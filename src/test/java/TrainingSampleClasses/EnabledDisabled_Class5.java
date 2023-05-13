package TrainingSampleClasses;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class EnabledDisabled_Class5 {

   /**
    * TestNG ---> is an automation Testing Framework in  which TestNG, stands for "Next Generation";
    *             derived from the JUnit family (type of a Testing Framework);
    *
    *       ---> It provides different Tags for testing purposes to generate a report;
    *
    *
    *  @Test ---> Test Case annotation;
    *
    *  @Ignore ---> Test Case will be Ignored (won't get executed);
    *
    *
    *  Allure dependency:
    *  @Severity(SeverityLevel.options) ---> Tag, Annotation, provided for reporting purposes;
    *
    * // When The Priority of TC is "1", that particular TC will be executed 1st!!!
    * // When The Priority of TC is "2", that particular TC will be executed 2nd!!!
    * // If there 2 Priorities with the same Number, TC will be executed according to alphabetic order of the Method names;
    **/


   // @Ignore
    @Test(priority = 1)
    public void enabledDisplayed() throws InterruptedException {

     //We are checking if "Create New account Btn" is displayed:
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.facebook.com/login.php/");
     driver.manage().window().maximize();

     Thread.sleep(3000);

     //We are just finding the WebElement;---- returns the Location in the DOM;
     By createNewAccount = By.linkText("Create new account");

    //Once we get the location, we are storing in boolean variable and checking if Displayed or Not:
     boolean createNewAccountButton = driver.findElement(createNewAccount).isDisplayed();

     Assert.assertTrue(createNewAccountButton);


     driver.quit();

    }


   // @Ignore
    @Test(priority = 1)
    public void selectedNotSelected() throws InterruptedException {

     System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.facebook.com/login.php/");
     driver.manage().window().maximize();

     Thread.sleep(3000);

     By createNewAccount = By.linkText("Create new account");
     driver.findElement(createNewAccount).click();

     Thread.sleep(3000);

     String genericXPath = "Male";

     String genderRadioButtonXpath = "//label[text()='" + genericXPath +"']/following-sibling::input";


     By allRadioBtn = By.xpath(genderRadioButtonXpath);
     driver.findElement(allRadioBtn).click();


     /**
      * When The driver finds any WebElement locator the DateType to be stored will be "By";
      *
      * But Selenium encapsulates every Element as an Object of WebElement DataType;
      *
      * Once we get the Locators (address of the WebElement in HTML) with the help of :
      *
      *                   1) driver.findElement() --- 1 element;
      *                   2) driver.findElements()--- 2 or more Elements;
      *
      * we can re-assign them in WebElement DataType;
      *      ---> we are able to access the rest of the Selenium methods:
      *           (isEnabled(), isSelected(),isDisplayed(), sendKeys(), getText())
      *           So we can place appropriate Assertions(TestNg);
      *
      **/


      WebElement femaleRadioButtonElement = driver.findElement(allRadioBtn);

     String idValueFromFemaleBtn = driver.findElement(allRadioBtn).getAttribute("id");

     System.out.println("The Value of Id retrieved from getAttribute() : " + idValueFromFemaleBtn);
     Thread.sleep(3000);
     //isSelected() returns true if selected, else false;

     boolean isSelectedOrNot = femaleRadioButtonElement.isSelected();
    // boolean expectedResult = true;

     //How do we know whether it got selected or not?
     //We have to make sure that it selected and put some assertions;
     //Assert() methods; ---> TestNG library;

    Assert.assertTrue(isSelectedOrNot);

    // Thread.sleep(5000);
    // driver.quit();


    }

}
