Feature: Amazon Search

  @nutella
  Scenario: TC01 kullanici amazonda kelime aratir

    Given kullanici amazon anasayfasinda
    Then  kullanici Nutella icin arama yapar
    And kullanici sonuclarin Nutella icerdigini test eder
   # And kullanici sayfayi kapatir

  @selenium
  Scenario: TC02 kullanici amazonda kelime aratir

    Given kullanici amazon anasayfasinda
    Then  kullanici Selenium icin arama yapar
    And kullanici sonuclarin Selenium icerdigini test eder
    # And kullanici sayfayi kapatir

  @iphone
  Scenario: TC03 kullanici amazonda kelime aratir

    Given kullanici amazon anasayfasinda
    Then  kullanici iphone arama yapar
    And kullanici sonuclarin iphone icerdigini test eder
    And kullanici sayfayi kapatir
