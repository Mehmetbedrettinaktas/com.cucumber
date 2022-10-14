
Feature: US012 Class Work

  Scenario Outline:  TC01 kullanici sutun basligi_ile_liste_alabilmeli
    Given kullanici "guruUrl" adresine gider
    Then "<Basliklar>" sutunundaki tum degerleri yazdirir
    And kullanici sayfayi kapatir
    Examples:
      | Basliklar          |
      | Company            |
      | Group              |
      | Prev Close (Rs)    |
      | Current Price (Rs) |
      | % Change           |

  Scenario: Kullanici sayfayi kapatir
    Given kullanici sayfayi kapatir

    # bu feature da HTML Rapor Eklemeyi ögrendik