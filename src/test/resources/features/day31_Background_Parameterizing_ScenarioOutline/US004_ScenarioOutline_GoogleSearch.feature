
Feature: US004_Google Search
  Background:Kullanici Google anasayfasina gider
    Given kullanici "google_Url" sayfasina gider

    Scenario Outline:Google Aramalari
      When kullanici google'da "<aranacakKelime>" aratir
      Then basligin "<aranacakKelime>" dogrular
      And sayfayi kapatir
      Examples:
        | aranacakKelime |

