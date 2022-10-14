package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GuruPage {
    public GuruPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//thead/tr/th")  // "//thead//th"
    public List<WebElement> basliklar;

    @FindBy(xpath = "//tbody/tr/td")  // "//thead//th"
    public List<WebElement> sutunlar;

    @FindBy(xpath = "//*[text()='Accept All']")  // "//thead//th"
    public WebElement acceptAllButton;
}
