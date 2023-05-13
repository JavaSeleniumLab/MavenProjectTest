package TrainingSampleClasses;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class GetAttributeIsEnabled_Class_6 {

    @Ignore
    @Test(priority = 1)
    public void selectedNotSelected() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/signup");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        String femaleStr = "Female";
        String maleStr = "Male";
        String custom = "Custom";

       By selectedBtn =  By.xpath("//label[text()='"+maleStr+"']/following-sibling::input");
                   driver.findElement(selectedBtn).click();

        boolean femaleElement = driver.findElement(selectedBtn).isSelected();
                Assert.assertTrue(femaleElement);
        driver.quit();

    }


    @Ignore
    @Test(priority = 1)
    public void getAttribute() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/signup");
        driver.manage().window().maximize();

        Thread.sleep(3000);


        /**
         * getAttribute() method returns the value of any passed attribute within the certain Locator;
         *                return type is string;
         **/

        By selectedBtn =  By.xpath("//label[text()='Female']/following-sibling::input");
        driver.findElement(selectedBtn).click();
       String theIdValueFromBtn = driver.findElement(selectedBtn).getAttribute("type");
       System.out.println("The Type Value from  Female Button : " + theIdValueFromBtn);


        By maleBtn =  By.xpath("//label[text()='Male']/following-sibling::input");
        driver.findElement(maleBtn).click();
        String theIdValueFromMaleBtn = driver.findElement(maleBtn).getAttribute("class");
        System.out.println("The Class Value from Male Button : " + theIdValueFromMaleBtn);


        By customBtn =  By.xpath("//label[text()='Male']/following-sibling::input");
        driver.findElement(customBtn).click();
        String theIdValueFromCustomBtn = driver.findElement(customBtn).getAttribute("id");
        System.out.println("The Id Value from custom Button : " + theIdValueFromCustomBtn);

        driver.quit();

    }


    @Test(priority = 1)
    public void isEnabledMethod() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/signup");
        driver.manage().window().maximize();

        Thread.sleep(3000);


        WebElement signUpButton = driver.findElement(By.xpath("//button[@name='websubmit']"));
        boolean isEnabledOrNot = signUpButton.isEnabled();


        // isEnabled() --- If the isEnabledOrNot returns false, the "Looks Like the Button not Enabled"
        // will be printed in our Test Case;
        Assert.assertTrue(isEnabledOrNot, "Looks Like the Button not Enabled");
        System.out.println("The Button is Enabled");

        //getText() method return the Text value from particular xPath,Locator, which is stored in String datatype;
        String expectedTextValue = "Sign In";//We are making sure that this is what it should be; written by us;
        String actualTextValue = signUpButton.getText();//return the result from the Website;

        System.out.println("The output from getText() method for SignUp Button : " + actualTextValue);

        //failing here, this line will executed first:
        Assert.assertEquals(actualTextValue,expectedTextValue, "The Text Values are different from  2nd Assertion");
        //if the previous line will fail the the rest of the code won't get executed;
        Assert.assertEquals(actualTextValue, expectedTextValue, "The Text Values are different from  1st Assertion");
        driver.quit();

    }



}
