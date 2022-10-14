package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepdefinitions {
    GuruPage guruPage= new GuruPage();



    @And("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String istenenBasilik) {
        int index = 0;
        for (int i = 0; i < guruPage.basliklar.size(); i++) {
            if(guruPage.basliklar.get(i).getText().equals(istenenBasilik)){
                System.out.println(guruPage.basliklar.get(i).getText());
                index = i+1;
                List<WebElement> sutunElement =
                        Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+index+"]"));
                sutunElement.forEach(t-> System.out.println(t.getText()));

                //for (WebElement w:sutunElement) {
                //    System.out.println(w.getText());
                //}



            }

        }
    }


}

