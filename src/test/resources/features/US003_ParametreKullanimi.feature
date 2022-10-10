@mehmet
Feature: US003 parametre kullanimi

  Background: ortak adim
  Given kullanici amazon anasayfasinda

  Scenario: TC01 Kullanici amazonda parametereli arama yapar

    Then  kullanici "java" icin arama yapar
    And kullanici sonuclarin "java" icerdigini test eder
    And kullanici sayfayi kapatir



  Scenario: TC02 Kullanici amazonda parametereli arama yapar
    Then  kullanici "selenium" icin arama yapar
    And kullanici sonuclarin "selenium" icerdigini test eder
    And kullanici sayfayi kapatir
  # Feature dosyasinda parametreli arama yaptigimizda ""(tirnak) icine aldigimiz degeri
  # StepDefinition'da 1 kere parametreli bir method olusturur ve yeni bir arama yapmak istedigimizde
  # yeni bir method olusturmadan feature dosyasindan ""(tirnak) icindeki ifadeyi degistirmemiz
  # yeterli olacaktir boylece kodlarimiz dinamik olacaktir

  Scenario: TC03 Kullanici amazonda parametereli arama yapar
    Then  kullanici "nutella" icin arama yapar
    And kullanici sonuclarin "nutella" icerdigini test eder
    And kullanici sayfayi kapatir

  Scenario: TC04 Kullanici amazonda parametereli arama yapar
    Then  kullanici "SQL" icin arama yapar
    And kullanici sonuclarin "SQl" icerdigini test eder
    And kullanici sayfayi kapatir