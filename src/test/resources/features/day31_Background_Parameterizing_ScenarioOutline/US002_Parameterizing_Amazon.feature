
Feature:US002_Amazon Sayfasinda Urun Aratma
 #Classlarımızda kullandığımız @Before gibi burda da
 # her scenario'dan önce Background: yapisi çalisir

  Background: kullanici amazon anasayfasina gider
  Given kullanici amazon sayfasina gider

         #Feature file'da birden fazla ürün aratmak için her ürün için yeni bir method
      # oluşturmak gerekir.Dolayısıyla stepdefinition class'ında çok fazla method oluşturmuş
      # oluruz.Tek bir parametreli method oluşturup bunun üstesinden gelebiliriz.Bunun için
      # feature file'da aratmak istediğim metni " " tırnak içinde yazarsak stepdefinition class
      # 'ında bize parametreli method oluşturur. Böylece bu methodu kullanarak istediğimiz kadar
      # metin aratabiliriz

     Scenario: TC01_Amazon sayfasinda Selenium aratma
      When arama kutusunda "Selenium" aratir
       And kullanici 3 saniye bekler

      Scenario: TC02_Amazon sayfasinda Java aratma
        When arama kutusunda "java" aratir
        And kullanici 2 saniye bekler

     Scenario: TC03_Amazon sayfasinda Github aratma
       When arama kutusunda "Github" aratir
       And kullanici 2 saniye bekler


  Scenario: TC03_Amazon sayfasinda Samsung aratma
    When arama kutusunda "Samsung" aratir
    And kullanici 2 saniye bekler


  Scenario: TC03_Amazon sayfasinda nokia aratma
    When arama kutusunda "nokia" aratir
    And kullanici 2 saniye bekler
       And sayfayi kapatir