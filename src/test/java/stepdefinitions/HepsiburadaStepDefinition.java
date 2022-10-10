package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

public class HepsiburadaStepDefinition {
    public HepsiburadaStepDefinition(){

    }
    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);

    }
}
