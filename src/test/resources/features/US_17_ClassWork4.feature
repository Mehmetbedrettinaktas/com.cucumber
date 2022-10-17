Feature: US17_

  @demo
  Scenario:TC01 alerts and explicitly wait

  #https://demoqa.com/browser-windows adresine gidin
    Given kullanici "demoUrl" adresine gider
    And kullanici 2 saniye bekler
    And kullanici Alerts buttonuna tiklar
    And kullanici 2 saniye bekler
    And On button click, alert will appear after bes seconds karsisindaki click me  butonuna basar
    And kullanici 2 saniye bekler
    And  kullanici Allertin gorunur olmasini bekler
    And kullanici 2 saniye bekler
    And Allert uzerindeki yazinin This alert appeared after bes seconds oldugunu test eder
    Then kullanici Ok diyerek alerti kapatin
    And kullanici sayfayi kapatir