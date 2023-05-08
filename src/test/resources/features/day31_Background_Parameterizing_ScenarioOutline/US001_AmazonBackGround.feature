Feature: US001_Amazon Sayfasinda Urun Aratma

  Background: kullanici amazon sayfasina gider
    Given kullanici amazon sayfasina gider

 #Background:Her Scenario öncesi çalışır

  Scenario: TC01_Amazon sayfasinda Selenium Aratma
    When arama kutusnda Selenium aratir
    Then sayfayi kapatir

  Scenario: TC02_Amazon sayfasinda Selenium Aratma
    When arama kutusunda java aratir
    Then sayfayi kapatir

  Scenario: TC03_Amazon sayfasinda Selenium Aratma
    When arama kutusnda SQL aratir
    Then sayfayi kapatir
