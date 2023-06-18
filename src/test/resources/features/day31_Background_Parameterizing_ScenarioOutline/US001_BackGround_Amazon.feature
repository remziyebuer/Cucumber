Feature: US001_Amazon Sayfasinda Urun Aratma
#Classlarımızda kullandığımız @Before gibi
  # burda da her scenario'dan önce Background: yapisi çalisir
 #Background:Her Scenario öncesi çalışır

  Background: kullanici amazon sayfasina gider
    Given kullanici amazon sayfasina gider

  Scenario: TC01_Amazon sayfasinda Selenium Aratma
    Then arama kutusunda Selenium aratir


  Scenario: TC02_Amazon sayfasinda java Aratma
    Then arama kutusunda java aratir


  Scenario: TC03_Amazon sayfasinda SQL Aratma
    When arama kutusunda SQL aratir
    Then sayfayi kapatir
