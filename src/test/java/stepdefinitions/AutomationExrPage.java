package stepdefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExrPage {
    public AutomationExrPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[@class='login']")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement createEmail;

    @FindBy(xpath = "//i[@class='icon-user left']")
    public WebElement creatAnaccount;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement mrButton;

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement register;

    @FindBy (xpath = "//*[text()='Welcome to your account. Here you can manage all of your personal information and orders.']")
    public WebElement hesapDogrulama;
}
