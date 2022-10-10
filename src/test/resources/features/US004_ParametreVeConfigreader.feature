Feature: Paremetre kullanimi
@mehmet
  Scenario:TC001 Parametre kullaniminda configReader kullanimi
    Given kullanici "amazonUrl"anasayfasinda
    Then  kullanici 3 saniye bekler
    When kullanici "Nutella " icin arama yapar
    Then kullanici sonuclarin "Nutella" icerdigini test eder
    And kullanici sayfayi kapatir


  Scenario:TC002 Parametre kullaniminda configReader kullanimi
    Given kullanici "amazonUrl"anasayfasinda
    Then  kullanici 3 saniye bekler
    When kullanici url'nin "amazon" icerdigini test eder
    When kullanici "Nutella " icin arama yapar
    Then kullanici sonuclarin "Nutella" icerdigini test eder
    And kullanici sayfayi kapatir
  @mehmet
  Scenario:TC003 Parametre kullaniminda configReader kullanimi
    Given kullanici "facebookUrl"anasayfasinda
    Then  kullanici 3 saniye bekler
    When kullanici url'nin "facebook" icerdigini test eder
    And kullanici sayfayi kapatir

  Scenario:TC004 Parametre kullaniminda configReader kullanimi
    Given kullanici "brcUrl"anasayfasinda
    Then  kullanici 3 saniye bekler
    When kullanici url'nin "blue" icerdigini test eder
    And kullanici sayfayi kapatir

    @aktas
  Scenario:TC005 Parametre kullaniminda configReader kullanimi
    Given kullanici "google"anasayfasinda
    Then  kullanici 3 saniye bekler
    When kullanici url'nin "google" icerdigini test eder
    And kullanici sayfayi kapatir