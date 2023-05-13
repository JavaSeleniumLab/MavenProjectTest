package TrainingSampleClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class TestForFluentWait_Class9 {

    @Test
    public void fluentWaitTest() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        driver.manage().window().maximize();

     //   driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);


        Wait fwait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(TimeoutException.class)
                .ignoring(NoSuchElementException.class)
                .withMessage("Exception Thrown");

        WebElement ele = (WebElement) fwait.until((Function<WebDriver, WebElement>)
                driver1 -> driver1.findElement(By.id("someIf")));
    }

}
