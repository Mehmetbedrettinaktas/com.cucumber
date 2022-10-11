package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationExercisePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class Practice_TC07_Stepdefinitons {
    AutomationExercisePage automationExercisePage= new AutomationExercisePage();

    @Given("Tarayiciyi baslatarak {string} url'sine gidin")
    public void tarayiciyiBaslatarakUrlSineGidin(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);

    }
    @Then("Ana sayfanin basariyla gorunur oldugunu dogrulayin")
    public void ana_sayfanin_basariyla_gorunur_oldugunu_dogrulayin() {
        String homeUrl="http://automationexercise.com";
        Assert.assertEquals("home url esit degil",homeUrl);

    }
    @Then("Test Case buttonu na tiklayin")
    public void test_case_buttonu_na_tiklayin() {
        automationExercisePage.testCasesLink.click();

    }
    @Then("Kullanicinin test case sayfasina basariyla yonlendirildiğini dogrulayin")
    public void kullanicinin_test_case_sayfasina_basariyla_yonlendirildiğini_dogrulayin() {
Assert.assertTrue(automationExercisePage.testCasesTitle.isDisplayed());

    }
    @Then("İlgili sayfanin ekran goruntusunu alin")
    public void i̇lgili_sayfanin_ekran_goruntusunu_alin() {
        try {
            ReusableMethods.getScreenshot("AutomationExercisePage");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
