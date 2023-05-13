package BasePackage;

import DriverWrapper.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BaseMethods extends DriverSetUp {


    //findElement


    //findElements


    // getTitle


    // getCurrentUrl


   //isSelected

    public boolean isElementSelected(By locator){
       return getDriver().findElement(locator).isSelected();
    }


    // isEnabled


    // getText


    //selectByVisibleText


    //sendKeys


    //click



    //switchToFrame



    //switchToAlert



    //dismissAlert



    //acceptAlert



    //mouseHoverOnElement



    //scrollDownByPixel



    //scrollUpToElement



    //scrollToBottom



    //waits


    public void setExplicitWaitTillVisibilityOfElement(int numberOfSeconds, By locator) {
        WebDriverWait explicitWait = new WebDriverWait(getDriver(), numberOfSeconds);
        explicitWait.pollingEvery(Duration.ofSeconds(2));
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }






}
