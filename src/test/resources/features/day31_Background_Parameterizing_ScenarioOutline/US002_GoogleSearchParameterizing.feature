
Feature: Google Search

  Background: kullanici google anasayfasina gider
    Given kullanici google anasayfasina gider

    Scenario: TC001_Java Search
      Given kullanici google anasayfasina gider
      And kullanici cookies kabul ederek kapatir
      When kullanici googleda "java" aratir
      Then title'in "java" icerdigini dogrula
      And sayfayi kapatir


  Scenario: TC02_Sql_Search
    And kullanici cookies kabul ederek kapatir
    When kullanici googleda "Sql" aratir
    Then title'in "Sql" icerdigini dogrula
    And sayfayi kapatir

  Scenario: TC03_JDBC_Search
    And kullanici cookies kabul ederek kapatir
    When kullanici googleda "JDBC" aratir
    Then title'in "JDBC" icerdigini dogrula
    And sayfayi kapatir

  Scenario: TC04_Selenium_Search
    And kullanici cookies kabul ederek kapatir
    When kullanici googleda "Selenium" aratir
    Then title'in "Selenium" icerdigini dogrula
    And sayfayi kapatir

  Scenario: TC05_Lambda_Search
    And kullanici cookies kabul ederek kapatir
    When kullanici googleda "Lambda" aratir
    Then title'in "Lambda" icerdigini dogrula
    And sayfayi kapatir