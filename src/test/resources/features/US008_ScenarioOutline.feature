
Feature:US008_ScenarioOutline


  Scenario Outline:TC001 ConfigReader ile Scenario Outline kullanimi
    Given kullanici "<arananUrl>"anasayfasinda
    Then  kullanici 3 saniye bekler
    When kullanici url'nin "<arananKelime>" icerdigini test eder
    And kullanici sayfayi kapatir
    Examples:
      | arananUrl           | arananKelime     |
      | amazonUrl           | amazon           |
      | facebookUrl         | facebook         |
      | brcUrl              | blue             |
      | techproeducationUrl | techproeducation |

