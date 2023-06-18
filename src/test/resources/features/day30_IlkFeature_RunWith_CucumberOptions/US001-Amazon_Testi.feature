Feature: US001 Amazon Sayfasinda Urun Aratma
  Scenario: TC01 Amazon Sayfasinda Selenium Aratma
    Given kullanici amazon sayfasina gider
    And arama kutusunda Selenium aratir
    And sayfayi kapatir

    Scenario: TC02_Amazon sayfasinda java aratma
      Given kullanici amazon sayfasina gider
      And arama kutusunda java aratir
      And sayfayi kapatir

      Scenario: TC03_Amazon sayfasinda SQL Aratma
        Given  kullanici amazon sayfasina gider
        And arama kutusunda SQL aratir
        And sayfayi kapatir


