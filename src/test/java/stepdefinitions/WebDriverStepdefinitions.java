package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WDUniversityPage;
import pages.WebPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;

public class WebDriverStepdefinitions {
    Actions actions = new Actions(Driver.getDriver());
    WebPage webPage= new WebPage();
    ArrayList<String> windows;
    String ilkWindow;
    @Then("kullanici Login Portala kadar asagi iner")
    public void kullaniciLoginPortalaKadarAsagiIner() {
        ilkWindow = Driver.getDriver().getCurrentUrl();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("kullanici Login Portala tiklar")
    public void kullaniciLoginPortalaTiklar() {
        webPage.loginIn.click();
    }

    @And("kullanici diger windowa gecer")
    public void kullaniciDigerWindowaGecer() {
    windows=new ArrayList<String>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windows.get(1));

    }

    @And("kullanici {string} kutusuna bilgileri girer")
    public void kullaniciKutusunaBilgileriGirer(String userName) {
        webPage.userName.sendKeys(userName);
    }

    @And("kullanici {string} bolumune bilgileri girer")
    public void kullaniciBolumuneBilgileriGirer(String password){
        actions.sendKeys(Keys.TAB).sendKeys(password).perform();
    }

    @And("kullanici login butonuna basar")
    public void kullaniciLoginButonunaBasar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @And("kullanici Popup'ta cikan yazinin validation failed oldugunu test eder")
    public void kullaniciPopupTaCikanYazininValidationFailedOldugunuTestEder() {
        String actualPopupText = Driver.getDriver().switchTo().alert().getText();
        String expectedPopupText = "validation failed";
        Assert.assertEquals(expectedPopupText, actualPopupText);
    }

    @And("kullanici Ok diyerek Popup'i kapatir")
    public void kullaniciOkDiyerekPopupIKapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @And("kullanici ilk sayfaya geri doner")
    public void kullaniciIlkSayfayaGeriDoner() {
        Driver.getDriver().switchTo().window(windows.get(0));

    }

    @And("kullanici ilk sayfaya donuldugunu test eder")
    public void kullaniciIlkSayfayaDonuldugunuTestEder() {
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ilkWindow);
    }

    @Given("kullanici {string} anasayfasina gidiyor")
    public void kullaniciAnasayfasinaGidiyor(String Url) {
        Driver.getDriver().get(ConfigReader.getProperty(Url));
    }
}
