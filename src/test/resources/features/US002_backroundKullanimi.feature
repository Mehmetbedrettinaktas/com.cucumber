
Feature: US001 Backround Kullanimi

  Background: Ortak Adimlar
    Given kullanici amazon anasayfasinda

  Scenario: TC01 kullanici amazonda kelime aratir


    Then  kullanici Nutella icin arama yapar
    And kullanici sonuclarin Nutella icerdigini test eder
   # And kullanici sayfayi kapatir

  Scenario: TC02 kullanici amazonda kelime aratir
    Then  kullanici Selenium icin arama yapar
    And kullanici sonuclarin Selenium icerdigini test eder
    # And kullanici sayfayi kapatir


  Scenario: TC03 kullanici amazonda kelime aratir


    Then  kullanici iphone arama yapar
    And kullanici sonuclarin iphone icerdigini test eder
    And kullanici sayfayi kapatir