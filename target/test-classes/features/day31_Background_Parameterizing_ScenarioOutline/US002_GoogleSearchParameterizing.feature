@GoogleSearch
Feature: Google Search

  Background: kullanici google anasayfasina gider
    Given kullanici google anasayfasina gider

    Scenario: TC001_Java Search
      When kullanici googleda "java" aratir
      Then title'in "java" icerdigini dogrula
      And sayfayi kapatir