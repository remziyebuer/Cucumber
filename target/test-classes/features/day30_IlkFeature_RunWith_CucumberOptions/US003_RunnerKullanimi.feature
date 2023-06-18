
  @All  #dersem hepsini calistirir
Feature: US003 Amazon Sayfasinda Urun Aratma
  @gr3
  Scenario: TC01 Amazon Sayfasinda Selenium Aratma
    Given kullanici amazon sayfasina gider
    And arama kutusnda Selenium aratir
    And sayfayi kapatir
   @gr2
  Scenario: TC02_Amazon sayfasinda java aratma
    Given kullanici amazon sayfasina gider
    And arama kutusunda java aratir
    And sayfayi kapatir

   @gr1 @sql
  Scenario: TC03_Amazon sayfasinda SQL Aratma
    Given  kullanici amazon sayfasina gider
    And arama kutusnda SQL aratir
    And sayfayi kapatir