package TrainingSampleClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWait_Class9 {

    /**
     * alertIsPresent()
     * elementSelectionStateToBe()
     * elementToBeClickable()
     * elementToBeSelected()
     * frameToBeAvaliableAndSwitchToIt()
     * invisibilityOfTheElementLocated()
     * invisibilityOfElementWithText()
     * presenceOfAllElementsLocatedBy()
     * presenceOfElementLocated()
     * textToBePresentInElement()
     * textToBePresentInElementLocated()
     * textToBePresentInElementValue()
     * titleIs()
     * titleContains()
     * visibilityOf()
     * visibilityOfAllElements()
     * visibilityOfAllElementsLocatedBy()
     * visibilityOfElementLocated()
     *
     *
     *  Explicit Wait ---> Type of a Dynamic Wait, which can be specified based on the certain criteria until condition is met;
     *
     *  Conditions based of method above;
     *
     *  Polling period ---> 500 ms (By default);
     *                 ---> polling period can be customized;
     *                 ---> we can wait until expected condition is met;
     *
     *  WebDriverWait explicitWait = new WebDriverWait(driver, 10);
     *
     *  We don't indicate Implicit with Explicit Wait in one Test Case (architecture implementation of these waits are different
     *        and by placing both Waits, this might throw "TimeOutException");
     *
     **/

    @Test
    public void waitUntilElementVisibility(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebDriverWait explicitWait = new WebDriverWait(driver, 6);

        explicitWait.pollingEvery(Duration.ofSeconds(2));//3 times

        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabsearchtextbox")));



        driver.quit();

    }
}
