package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;

import java.util.List;

public class PracticeTestPageStepDefs {
    PracticeTestPage practiceTestPage= new PracticeTestPage();
    Actions actions = new Actions(Driver.getDriver());
    int down32toplam;
    int clikTextToplam;
    int sonuc;


    @Given("{string} adresine gidin")
    public void adresine_gidin(String url) {
    Driver.getDriver().get(url);


    }
    @Then("{int} defa click me ye tiklayin")
    public void defa_click_me_ye_tiklayin(Integer int1) {
        for (int i = 0; i <int1 ; i++) {
            practiceTestPage.clickMiButton.click();
        }


    }
    @Then("{int} defa Space dugmesine basin")
    public void defa_space_dugmesine_basin(Integer int1) {
        for (int i = 0; i <int1 ; i++) {
            actions.sendKeys(Keys.SPACE).perform();
        }

    }
    @Then("Down yazisindaki iki basamakli sayilarin hepsini toplayin")
    public void down_yazisindaki_iki_basamakli_sayilarin_hepsini_toplayin() {
        List<WebElement> down32=practiceTestPage.down32;
        for (WebElement w:down32) {
          down32toplam+=  Integer.valueOf(w.getText().replaceAll("[^0-9]",""));
            // INteger classdan valueOf String int cevirdik  parstlnt() ayni isi goruyor

        }
        System.out.println("down32 toplami :"+down32toplam);

    }
    @Then("Tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin")
    public void tum_click_metinlerinin_uzunlugunun_toplamini_onceki_toplamdan_cikarin() {
        List<WebElement> clickText=practiceTestPage.clickText;

        for (WebElement w:clickText) {
          clikTextToplam+=  w.getText().length();
        }
        sonuc=down32toplam-clikTextToplam;
        System.out.println("sonuc = " + sonuc);

    }
    @Then("sonucun {int} oldugunu dogrulayin")
    public void sonucun_oldugunu_dogrulayin(int result) {
        Assert.assertEquals("sonuc esit degil",result,sonuc);

    }
}
