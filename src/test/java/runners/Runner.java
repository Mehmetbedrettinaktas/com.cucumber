package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( // bize JUnit'ten geliyor
        features = "src/test/resources/features",
        glue = "stepdefinitions",  // glue yapistirmak
        tags = "@BRC", //Ayni anda birden fazla tagi calistirmak istersek "@java or @nutella or @iphone" seklinde yapiliyor
        dryRun = true  // kuru calistir   true koydugumuzda eksik step definitonlari veriyor.

)



public class Runner {
    /*

     Runner Class'ı TestNG'deki XMl mantığı ile çalışır. Çalıştırmak istediğimiz senartolara tag belirtiriz
    ve belirttiğimiz tag'ları çalıştırır. XMl deki gibi istediğimiz testleri çalıştırmak için kullanırız.
    Runner class body'si boştur ve runner class'ını ekleyeceğimiz notasyonlar aktive eder.
     Bu class'da kullanacağımız 2 adet notasyon vardır
    -@RunWith(Cucumber.class)  notasyonu Runner class'ına çalışma özelliği ekler.
    Bu notasyon olduğu için Cucumber frameworkumuzde Junit kullanmayı tercih ederiz
    -@CucumberOptions notasyonu içinde
    features : Runeer dosyasının feature dosyasını nereden bulacağını tarif eder
    glue : stepDefinitions yolunu belirtiriz
    tags : Hangi tag'i çalıştırmak istiyorsak onu belli eder

    dryRun : iki seçenek vardır
    dryRun = true; dersek testimizi çalıştırmadan eksik adımları bize verir
    dryRun = false; testlerimizi driver ile çalıştırır.


     */

}
