package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class WebPage {
    public WebPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//*[text()='LOGIN PORTAL']")
    public WebElement loginIn;

    @FindBy (xpath = "//*[@id='text']")
    public WebElement userName;


    @FindBy (xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy (xpath = "//button[@id='login-button']")
    public WebElement loginButton;
}
