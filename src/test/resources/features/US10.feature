Feature:Class Calismasi

  Scenario Outline:
    When kullanici "datatablesUrl" adresine gider
    Then  new butonuna basar
    And isim bolumune "<firstname>" girer
    And kullanici 1 saniye bekler
    And soyisim bolumune "<lastname>" girer
    And kullanici 1 saniye bekler
    And position bolumune"<position>" girer
    And kullanici 1 saniye bekler
    And ofis bolumune "<ofisbilgisi>" girer
    And kullanici 1 saniye bekler
    And extension bolumune "<extension>" girer
    And kullanici 1 saniye bekler
    And startdate bolumune"<Stardate>"  girer
    And kullanici 1 saniye bekler
    And salary bolumune "<Salary>" girer
    And kullanici 1 saniye bekler
    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    And kullanici 1 saniye bekler
    Then isim bolumunde "<firstname>" oldugunu dogrular

    Examples:
      | firstname | lastname | position | ofisbilgisi | extension | Stardate    | Salary |
      | ALi       | Veli     | Qa       | Google      | Senior    | 2022 -10-12 | 15000  |
      | Ahmet     | Mehmet   | Qa       | Google      | Junior    | 2021-11-05  | 10500  |
      | Hasan     | Duman    | Dev      | Amazon      | Junior    | 2020-09-10  | 25000  |
      | Akin      | Alkan    | Dev      | Amazon      | Senior    | 2009-09-05  | 50000  |
      | Orhan     | Duman    | PO       | WallMart    | Senior    | 2006 -03-23 | 30000  |

  Scenario: kullanici sayfayi kapatir
    Then kullanici sayfayi kapatir
    #5 farkli kullanici bilgisi girer
