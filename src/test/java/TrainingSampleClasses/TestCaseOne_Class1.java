package TrainingSampleClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestCaseOne_Class1 {

//Annotations ---> tags, components, that helps to run Automated Test cases.

    @Test
    public void testCaseOne() throws InterruptedException {
        // 1st Step ---> has to be set for Chromedriver Location;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // 2nd Step ---> Object created for ChromeDriver;
        WebDriver driver = new ChromeDriver();

        // 3rd Step ---> the URL has to be indicated;
       // driver.get("https://www.facebook.com");// ---> will wait couple of seconds, until the web page is loaded;

        //We can maximize the window;
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com");// ---> won't wait at all, if there are latency (network is slow) issues, TC will fail;

        // Just to wait 5 seconds;
       // Thread.sleep(5000);


        //Once we launch we also have to refresh/reload the page:
       // driver.navigate().refresh();



       String titleOfWebPage =  driver.getTitle();
       System.out.println("The current title is : " + titleOfWebPage);



       String currentURL = driver.getCurrentUrl();
       System.out.println("Current URL is this : " + currentURL);



        // Just to wait 5 seconds;
        //Thread.sleep(5000);


        // we just indicated the Best sellers Button, passed the xPath of this element;
       // By bestSellers = By.xpath("//div[@id ='nav-xshop']/a[text()='Best Sellers']");
        By allSectionOptions = By.xpath("//div[@id ='nav-xshop']/child::a");

        // Driver to click on the Webelement by findElement(), click();
       // driver.findElement(bestSellers).click();

        String selectedBtn = "Music";

       // clickOnSelectedElementFromList(allSections, allSectionOptions);

        // Just to wait 5 seconds;
       // Thread.sleep(3000);


        // go back to default Page;
       // driver.navigate().back();


        //Thread.sleep(3000);


        // go back to Bestsellers again
       // driver.navigate().forward();



       // we always have to quit default launched Browser as a last Step!!;
        driver.quit();

    }





    public static void clickOnSelectedElementFromList (List<WebElement> webElementList, By btnElement) {
        for (WebElement element : webElementList){
            if(element.equals(btnElement)){
                element.click();
            }
        }
    }

}
