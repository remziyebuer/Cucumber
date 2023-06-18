Feature: US002_TechproEducation Testi
@gr1 @gr3
  Scenario: TC01_TechProEducation Sayfa Testi

    Given kullanici techpro sayfasina gider
    Then cikan reklam kapatilir
    And arama kutusunda QA aratir
    And sayfa basliginin qa icerdigini test eder
    And sayfayi kapatir