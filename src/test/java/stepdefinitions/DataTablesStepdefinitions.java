package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DataTablePage;
import utilities.ConfigReader;
import utilities.Driver;

public class DataTablesStepdefinitions {
    DataTablePage dataTablePage= new DataTablePage();
    Actions actions= new Actions(Driver.getDriver());
    @When("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }

    @Then("new butonuna basar")
    public void newButonunaBasar() {
        dataTablePage.newButton.click();
    }

    @And("isim bolumune {string} girer")
    public void isimBolumuneGirer(String firstName) {
        dataTablePage.firstName.sendKeys(firstName);

    }

    @And("soyisim bolumune {string} girer")
    public void soyisimBolumuneGirer(String lastName) {
        actions.sendKeys(Keys.TAB).sendKeys(lastName).perform();

    }

    @And("position bolumune{string} girer")
    public void positionBolumuneGirer(String position) {
        actions.sendKeys(Keys.TAB).sendKeys(position).perform();
    }

    @And("ofis bolumune {string} girer")
    public void ofisBolumuneGirer(String office) {
        actions.sendKeys(Keys.TAB).sendKeys(office).perform();
    }

    @And("extension bolumune {string} girer")
    public void extensionBolumuneGirer(String extension) {
        actions.sendKeys(Keys.TAB).sendKeys(extension).perform();
    }

    @And("startdate bolumune{string}  girer")
    public void startdateBolumuneGirer(String startDate) {
        actions.sendKeys(Keys.TAB).sendKeys(startDate).perform();
    }

    @And("salary bolumune {string} girer")
    public void salaryBolumuneGirer(String salary) {
        actions.sendKeys(Keys.TAB).sendKeys(salary).sendKeys(Keys.TAB).perform();
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        actions.sendKeys(dataTablePage.create).click().perform();

    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstName) {
        dataTablePage.search.sendKeys(firstName);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String firstName) {
        Assert.assertTrue(dataTablePage.aramaSonucIlkElement.getText().contains(firstName));

    }


}
