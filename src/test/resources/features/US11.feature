Feature: US1011ClassWork
  Scenario: Herocap sitesi buton tarama


  Given kullanici "https://the-internet.herokuapp.com/add_remove_elements/" anasayfasina gider
    And Add Element butona basin
    And Delete butonu gorunur oluncaya kadar bekleyin
    And Delete butonunun gorunur oldugunu test edin
    And Delete butonuna basarak butonu silin
    And Delete butonunun gorunmedigini test edin
    And kullanici sayfayi kapatir