package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepdefinitons {
    AmazonPage amazonPage= new AmazonPage();
    @Given("kullanici amazon anasayfasinda")
    public void kullanici_amazon_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
    amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

    }

    @Then("kullanici sonuclarin Nutella icerdigini test eder")
    public void kullanici_sonuclarin_nutella_icerdigini_test_eder() {
        String arananKelime="Nutella";
        String actualAramaSonucStr=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));

    }

    @Then("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();

    }


}
