Feature: US007 Kullanici amazonda istedigi kelimeleri aratir

  Scenario Outline:
    Given kullanici "amazonUrl" anasayfasinda
    Then kullanici "<istenenKelime>" icin arama yapar
    And kullanici sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And kullanici sayfayi kapatir

    Examples:
      | istenenKelime |istenenKelimeKontrol|
      | Nutella       |Nutella             |
      | selenium      |selenium            |
      | java          |java                |
# TestNg deki dataProvider kullanimindaki gibi Cucumberda'da  Scenario Outline kullaniriz.
  # Bu sekilde birden cok kelimeyi tek seferde aratabiliyoruz.

  #Feature dosyasinda yazdigimiz komutta eger "" (Tirnak) kullanirsak stepDefinition da parametreli
 #bir method olusturur.Ve artik stepDefiniton'i kullanmadan Feature dosyasinda ""(Tirnak)
#icindeki string'idegistirerek istedigim kelimeyi aratabilirim .
 #Scenario Outline da ise yine ""(Tirnak) icinde birden fazla kelime aratacaksam  "<>" seklindeki kullanim
 # ile "<>" icine yazdigim  herhangi bir kelimeyi  Scenario Outline'in asagida olusturdugu Examples
 #altinda aratmak istedigim kelimeleri yazar ve sirasiyla aratabiliriz