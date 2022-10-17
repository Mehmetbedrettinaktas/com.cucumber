package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DemoPage;
import utilities.Driver;

public class DemoqaStepdefinitions {
    DemoPage demoPage = new DemoPage();
    Actions actions = new Actions(Driver.getDriver());

    @And("kullanici Alerts buttonuna tiklar")
    public void kullaniciAlertsButtonunaTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        demoPage.alerts.click();
    }

    @And("On button click, alert will appear after bes seconds karsisindaki click me  butonuna basar")
    public void onButtonClickAlertWillAppearAfterBesSecondsKarsisindakiClickMeButonunaBasar() {

    }

    @And("kullanici Allertin gorunur olmasini bekler")
    public void kullaniciAllertinGorunurOlmasiniBekler() {

    }

    @And("Allert uzerindeki yazinin This alert appeared after bes seconds oldugunu test eder")
    public void allertUzerindekiYazininThisAlertAppearedAfterBesSecondsOldugunuTestEder() {

    }

    @Then("kullanici Ok diyerek alerti kapatin")
    public void kullaniciOkDiyerekAlertiKapatin() {

    }


}
