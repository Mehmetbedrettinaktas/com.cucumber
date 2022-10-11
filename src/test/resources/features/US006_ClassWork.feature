Feature: US1006 Blue RebtaCar Login

  Scenario: TC11 kullanici gecerli bilgilerle giris yapar
    Given kullanici "brcUrl" ana sayfasinda
    Then Login yazisina tiklar
    And kullanici 2 saniye bekler
    And gecersiz username girer
    And kullanici 2 saniye bekler
    And gecersiz password girer
    And kullanici 2 saniye bekler
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And kullanici 2 saniye bekler
    And kullanici sayfayi kapatir