package POM.Pages;

import BasePackage.BaseMethods;
import org.openqa.selenium.By;

public class SignUpPage extends BaseMethods {

    private By firstNameLocator = By.xpath("//input[@name='firstname']");
    private By lastNameLocator = By.xpath("//input[@name='lastname']");
    private By emailOrPhoneNumberLocator = By.xpath("//input[@name='email']");
    private By newPasswordLocator = By.xpath("//input[@name='pass']");
    private By dateDropdownLocator = By.id("day");
    private By monthDropdownLocator = By.id("month");
    private By yearDropdownLocator = By.id("year");
    private By femaleRadioLocator = By.xpath("//input[@value='1']");
    private By signUpLocator = By.xpath("//button[@name='websubmit' and text()='Sign Up']");
    private By errorMsgLocator = By.xpath("//div[text() = 'Please enter a valid mobile number or email address.']");
    private By newAccountButtonLocator = By.xpath("//a[@data-testid='open-registration-form-button']");

    private By signInEmailOrPhoneLocator = By.id("email");
    private By signInPasswordLocator = By.id("pass");
    private By signInButtonLocator = By.name("login");
    private By errorMessage = By.xpath("//div[@class='_9ay7']");
    private By signUpText = By.xpath("//div[@class='_52lr fsm fwn fcg']");



}
