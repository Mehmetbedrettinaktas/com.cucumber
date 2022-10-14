Feature: US005 Parametre kullanimi

  Scenario: TC001 Parametre kullanimi
    Given kullanici "htpps://www.trendyol.com" anasayfasinda
    Then  kullanici 3 saniye bekler
    When kullanici url'nin "trend" icerdigini test eder
    And kullanici sayfayi kapatir

    # terminalden rapor almak icin  (mvn clean verify)