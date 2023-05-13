package TrainingSampleClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class HomeWork8 {



    @Test(priority = 1)
    public void homeWorkAlert() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();


        String currentBaseWindowId = driver.getWindowHandle();

        driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();


        Set<String> windowHandles = driver.getWindowHandles();// 2 windows, Base and just opened;

        for (String handles : windowHandles) {
            if (!handles.equals(currentBaseWindowId)) {
                //1 st Iteration it will obtain BaseCurrentWindow,---> if it is not Parent Widow, switch to the Child window;
                //if Looped "handles", not equals to Current very 1st Window, just opened By "driver", switch to another one.
                driver.switchTo().window(handles);
                // driver.close();
            }
        }


        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.sendKeys("Joe");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.sendKeys("Doe");

        driver.findElement(By.xpath("//input[@id='malerb']"));
        driver.findElement(By.xpath("//input[@id='englishchbx']"));

        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("Joe@test.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("TestPassword");

        driver.findElement(By.xpath("//button[@id='registerbtn']")).click();
        String expected = "Registration is Successful";

        WebElement registrationWindow = driver.findElement(By.xpath("//label[@id='msg']"));
        String  actual = registrationWindow.getText();

        Assert.assertEquals(expected, actual);

        Thread.sleep(3000);


        driver.quit();

    }

}



