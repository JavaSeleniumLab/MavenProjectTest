package TrainingSampleClasses;

import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

public class AutoSuggestions_Class8 {

    @Test
    public void selectAutoSuggestion() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();



        //Single-unique Locator, we use driver.findElement() --- 1
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();


        //When there are many values we need to check, we use driver.findElements() --- more than 1;
        // Return type List<WebElement>,  here we have all 10 Options to choose:
       List<WebElement> allAutoSuggestions=
               driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div//div[@role='button']/span"));


       String usersPick = "iftcards ️";

/*
       for (WebElement allElements : allAutoSuggestions){
          if (allElements.getText().equals(usersPick)) {
              String actualOption = allElements.getText();
               allElements.click();
               Assert.assertEquals(usersPick, actualOption, "The User Option is Offered");
           }
           break;
       }*/


        for (int i = 0; i < allAutoSuggestions.size(); i++) {
            if (allAutoSuggestions.get(i).getText().equals(usersPick)) {
                String actualOptions = allAutoSuggestions.get(i).getText();
                allAutoSuggestions.get(i).click();
                Assert.assertEquals(usersPick, actualOptions);
            }

        }

      //  driver.quit();

    }

}
