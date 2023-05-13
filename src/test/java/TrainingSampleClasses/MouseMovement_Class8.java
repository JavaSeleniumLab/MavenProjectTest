package TrainingSampleClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseMovement_Class8 {


    @Test
    public void demoMouseMovement() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com");
        driver.manage().window().maximize();



        Thread.sleep(5000);

       WebElement resourcesElement=driver.findElement(By.xpath("(//button[normalize-space()='Resources'])[1]"));

       //Create an Object of Actions class, and typeCast it to launched "driver" instance;
        Actions mouseAction = new Actions(driver);
        // By reference variable we moveToElement() to the WebElement,
        // compulsory to build().perform() ---> hover over;
        mouseAction.moveToElement(resourcesElement).build().perform();


        Thread.sleep(2000);
        mouseAction.contextClick(resourcesElement);

        //Find the 2 Locators for "Drag me" to drop "Drop here":
        //dragAndDropBy(from, To)










    }
}
