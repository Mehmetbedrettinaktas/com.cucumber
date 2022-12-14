package stepdefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuTestPage;
import pages.HerrokuPage;
import utilities.Driver;

import java.time.Duration;

public class HerrokuStepDefinitions {
HerrokuPage herrokuPage= new HerrokuPage();
    @And("Add Element butona basin")
    public void addElementButonaBasin() {
        herrokuPage.addElementButton.click();
    }
    @And("Delete butonu gorunur oluncaya kadar bekleyin")
    public void deleteButonuGorunurOluncayaKadarBekleyin() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(herrokuPage.deleteButton));
        //Reusable ile
        // ReusableMethods.waitForVisibility(herokuPages.deleteButton,10);
    }
    @And("Delete butonunun gorunur oldugunu test edin")
    public void deleteButonununGorunurOldugunuTestEdin() {
        assert herrokuPage.deleteButton.isDisplayed();
        //Bu sekilde de kullanilabiliyor
        //herokuPages.deleteButton.isDisplayed() sonuna nokta koyarsak
        // yukardaki sekilde de assert kullanimini assert true olarak kullanabiliriz
        //Eger assert equals kullanacaksak   assert herokuPages.addRemovesElementsText.getText().equals("Add/Remove Elements");
        // bu method sekli sadece true / onune unlem koyarsak false seklinde kullanilir
        // Assert.assertTrue(herokuPages.deleteButton.isDisplayed());
    }
    @And("Delete butonuna basarak butonu silin")
    public void deleteButonunaBasarakButonuSilin() {
        herrokuPage.deleteButton.click();
    }
    @And("Delete butonunun gorunmedigini test edin")
    public void deleteButonununGorunmediginiTestEdin() {
        assert !herrokuPage.deleteButton.isDisplayed();
        //Assert.assertFalse(herokuPages.deleteButton.isDisplayed());
    }
    @And("AddRemove Elements yazisinin gorunurlugunu test eder")
    public void addremoveElementsYazisininGorunurlugunuTestEder() {
        assert herrokuPage.addRemovesElementsText.getText().equals("Add/Remove Elements");
    }
}

/*



 */