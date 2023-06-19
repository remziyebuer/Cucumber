 #Scenario Outline: TestNG deki @DataProvider mantığıyla çalışır.
  #Birden fazla veriyi tek seferde feature fileden kullanmamıza yardımcı olur

Feature: US004_Google Search
  Background:Kullanici Google anasayfasina gider
    Given kullanici "google_Url" sayfasina gider
    Then kullanici cookies kabul ederek kapatir

    Scenario Outline:Google Aramalari
      When kullanici google'da "<aranacakKelime>" aratir
      Then basligin "<aranacakKelime>" icerdigini dogrular
      And sayfayi kapatir
      Examples:
        | aranacakKelime |
        | volvo          |
        | bmw            |
        | mercedes       |
        | audi           |
        | ford           |

