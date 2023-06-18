@GoogleSearchScenarioOutline
Feature: Google_Search

  Background: kullanici google anasayfasina gider
    Given kullanici google anasayfasina gider

    Scenario Outline: Google aramalari
      When kullanici googleda "<Aranacak_Kelime>" aratir
      Then title'in "<Aranacak_Kelime>" icerdigini dogrula
      And sayfayi kapatir

      Examples:
        | Aranacak_Kelime |
        | Java            |
        | Sql             |
        | JDBC            |
        | Selenium        |
        | Lambda          |