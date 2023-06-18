Feature: US003_TechProEducation Testi

  Background: Kullanici TechproEducation Sayfasina Gider
    Given kullanici "techproed_Url" sayfasina gider
  #Eğer .properties dosyasındaki key(url)'i kullanmak istersek, stepDefinition class'ımızda parametre
  #istenen yere ConfigReader.getProperty(Key) methodu ile giriş yapmalıyız
  # ya da https://techproeducation.com direkt iki tirnak arasina koyularakta kullanılabilir o zaman
  # Configten url gelmeyecegi icin yani biz yazacagimiz icin get() metotu icine sadece url deriz
  #Driver.getDriver().get(url);*****

  Scenario: TC01_TechProEducation Sayfasi Testi
   # Given kullanici techpro sayfasina gider bu adimi Background a alip tirnaklada dinamik yaptik
    Then cikan reklam kapatilir
    When kullanici 2 saniye bekler
    And kullanici tüm sayfanin resmini alir
    And kullanici 2 saniye bekler
    And arama kutusunda qa aratir
    And sayfa basliginin qa icerdigini test eder
    When kullanici tüm sayfanin resmini alir
    And sayfayi kapatir


  Scenario: TC02_TechProEducation Sayfasi Testi
    And cikan reklam kapatilir
    And kullanici 2 saniye bekler
    And techpro arama kutusunda "developer" aratir
    And sayfa basliginin "developer" icerdigini test eder
    When kullanici tüm sayfanin resmini alir
    And sayfayi kapatir

