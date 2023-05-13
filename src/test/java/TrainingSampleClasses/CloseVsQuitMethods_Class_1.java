package TrainingSampleClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class CloseVsQuitMethods_Class_1 {


    @Ignore
    @Test
    public void closeVsQuitMethods() throws InterruptedException {
        // 1st Step ---> has to be set for Chromedriver Location;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        driver.quit();

    }

  // @Ignore
    @Test
    public void methodWillBeIgnored() throws InterruptedException {
        // 1st Step ---> has to be set for Chromedriver Location;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        driver.quit();
    }

}        /* //DataType of particular xPath is returned by "By". Within the By there are methods with these types of Locators:


        //1) xPath ---> returns the custom path;
        By bestSellersXpath = By.xpath("//div[@id='nav-xshop']/a[(text()='Best Sellers')]");


        //2) By.id ---> returns the path, was passed by ID;
        By mainPageId = By.id("nav-main");


        // 3) By.linkText ---> returns the path, that was passed by text of particular LinkText;
        By newReleasesLinkText = By.linkText("New Releases");
        //driver.findElement(newReleasesLinkText).click();

        //4) By.partialLinkText ---> returns tha path, passed by some part of text from particular Link;
        By partialLinkText = By.partialLinkText("Customer Serv");
       // driver.findElement(partialLinkText).click();

        //5) By.tagName ---> returns the path, passed by unique tagName;

        //6) By.cssSelector ---> Cascading Style Sheet, return CSS locator;
        // cssSelector believed to be more robust than xPath. If regular xPath not finding WebElement, css can be used;
        // Syntax ---> tagName#any Value within that tag;

        By cssLocator = By.cssSelector("a#nav-link-amazonprime");
        // driver.findElement(cssLocator).click();



       // xPath Axes (advanced xPath) ---> html document
*/

/**
         * xPath Axis ---> representation of a relationship, used to locate particular node on the tree (html Document)
         *
         * ---> html Document
         *       ---> head
         *            ---> body
         *                 ---> the rest of the tags, that represent current web-site;
         *
         **//*




        */
/**
         * 1. following (will select everything in DOM after closing tag of a current node, Ex: //div[@id='nav-xshop'])
         *          ---> div[@id='nav-xshop']/following::tagName;
         *
         * 2. descendant (will select all children,grandchildren within current node)
         *          ---> div[@id='nav-xshop']/descendant::tagName;
         *            ---> //div[@id='nav-xshop']/descendant::span
         *
         * 3. ancestor (will select all ancestor(parent, grandParent of a current node) or above the current Node)
         *          ---> div[@id='nav-xshop']/ancestor::tagName;
         *             ---> //div[@id='nav-xshop']/ancestor::div
         *
         * 4. following - sibling (will select all siblings after current Node)
         *              ---> //a[text()='Music']/following-sibling::a
         *
         * 5. preceding - sibling (will select all siblings before/above the current Node)
         *              ---> //a[text()='Music']/preceding-sibling::a
         *
         * 6. parent (will select very close parent of a Current Node)
         *             ---> //a[text()='Music']/parent::div
         *
         * 7. child (will select the only children of a current Node, but not grandChildren)
         *             ---> //div[@id='nav-xshop']/child::a
         *
         **//*




        By signInBtn = By.xpath("//a[@data-nav-ref='nav_ya_signin']");
        driver.findElement(signInBtn).click();



        //sendKeys()---> will send all values passed by User;
        By inputEnterEmail = By.xpath("//input[@id='ap_email']");
        driver.findElement(inputEnterEmail).sendKeys("elliekuch@gmail.com");


        Thread.sleep(3000);

        By continueId = By.id("continue");
        driver.findElement(continueId).click();


        Thread.sleep(3000);



        */
/**
         * 1. Launch default amazon page;
         * 2. Click on signin Button
         * 3. Find input xPath for signIn (By.xpath("//input[@id='ap_email']");) and sendKeys("yourUserName")
         * 4. click on continue Button,
         * 5. Find input xPath for password (By.xpath("//input[@id='ap_email']");) and sendKeys("yourPassword")
         *
         * 6. Find input xPath for searchBar (By.xpath("//input[@id='ap_email']");) and sendKeys("apple watch series 8 band")
         * 7. click on search Bar;
         *
         *
         * All commands will be sendKeys();
         *
         **//*








        //Close method is used to close the 1st default web page, that was opened by Automation;
       // driver.close();

        //Quit is used to close all pages, that was opened by particular TC associated with driver;
        driver.quit();



    }
}*/
