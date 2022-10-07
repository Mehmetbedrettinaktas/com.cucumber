Feature: Amazon Search

  Scenario: TC01 kullanici amazonda kelime aratir

    Given kullanici amazon anasayfasinda
    Then  kullanici Nutella icin arama yapar
    And kullanici sonuclarin Nutella icerdigini test eder
    And kullanici sayfayi kapatir
