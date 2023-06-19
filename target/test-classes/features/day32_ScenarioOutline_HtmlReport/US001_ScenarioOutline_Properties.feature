
Feature: US004_Google Search
  Background:Kullanici Google anasayfasina gider
    Given kullanici "google_Url" sayfasina gider
    Then kullanici cookies kabul ederek kapatir
   And kullanici 3 saniye bekler
#daha sonra ekledimbeklemeyi konto ändern yüzünden cookiye de zaman verdi
  Scenario Outline:Google Aramalari
    When kullanici google'da "<aranacakKelime>" key ile aratir
    Then basligin "<aranacakKelime>" icerdigini key ile dogrular
    And sayfayi kapatir
    Examples:
      | aranacakKelime |
      | arac1          |
      | arac2          |
      | arac3          |
      | arac4          |
      | arac5          |

