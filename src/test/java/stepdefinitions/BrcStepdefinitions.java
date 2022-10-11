package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BrcStepdefinitions {
    BrcPage brcPage= new BrcPage();
    @Given("kullanici {string} ana sayfasinda")
    public void kullaniciAnaSayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        brcPage.login.click();
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        brcPage.brcUserEmail.sendKeys(ConfigReader.getProperty("brcWrongEmail"),Keys.TAB);
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        brcPage.brcUserEmail.sendKeys(ConfigReader.getProperty("brcWrongPassword"), Keys.TAB);
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        brcPage.submitLogin.click();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(brcPage.submitLogin.isDisplayed());

    }


}
