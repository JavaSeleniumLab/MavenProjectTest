package TestCases;

import DriverWrapper.DriverSetUp;
import Utilities.ForFailedTestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

@Listeners(ForFailedTestCases.class)
public class DryRunTest extends DriverSetUp {


    @Test
    public void selectYearMonth() throws InterruptedException {

        String monthSelectedByUser = "Juiiin"; // could be any month;
        List<WebElement> allMonthOptions = getDriver().findElements(By.xpath("//select[@id='month']/child::option"));

        String extractedValue ="";
        for (int i = 0; i < allMonthOptions.size(); i++) {
            if (allMonthOptions.get(i).getText().contains(monthSelectedByUser)) { // if this returns true;
                extractedValue = allMonthOptions.get(i).getText();
                allMonthOptions.get(i).click();
            }
        }
        Assert.assertEquals(monthSelectedByUser, extractedValue);
    }


    @Test
    public void selectDayInMonth() throws InterruptedException {

        String daySelectedByUser = "15";
        List<WebElement> allDayInMonthOptions = getDriver().findElements(By.xpath("//select[@id='day']/child::option"));

        String extractedValue ="";

        for (int i = 0; i < allDayInMonthOptions.size(); i++) {
            if (allDayInMonthOptions.get(i).getText().contains(daySelectedByUser)) {
                extractedValue = allDayInMonthOptions.get(i).getText();
                allDayInMonthOptions.get(i).click();
            }

        }

        Assert.assertEquals(daySelectedByUser, extractedValue);

    }

    @Test
    public void selectYearTest() throws InterruptedException {

        String yearSelectedByUser = "2023";
        List<WebElement> allYearOptions = getDriver().findElements(By.xpath("//select[@id='year']/child::option"));
        String extractedValue = "";


        for (int i = 0; i < allYearOptions.size(); i++) {

            if (allYearOptions.get(i).getText().contains(yearSelectedByUser)) {
                extractedValue = allYearOptions.get(i).getText();
                allYearOptions.get(i).click();
            }
        }

        Assert.assertEquals(yearSelectedByUser, extractedValue, "This Value not found");

        Thread.sleep(3000);


    }

}
