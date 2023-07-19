@rerun
Feature: US003  Amazon  Testi

  Scenario:TC01  Amazonda  Urun  aratma
    Given kullanici  "amazon  Url"  sayfasina  gider
    And arama  kutusunda  "iphone"  aratir
    And basligin "nokia" icerdigini dogrular
    #Bilerek fail aldık
  Scenario:TC02  Amazonda  Urun  aratma
    Given kullanici  "amazon  Url"  sayfasina  gider
    And arama  kutusunda  "samsung"  aratir
    And basligin "samsung" icerdigini dogrular

  Scenario:TC03  Amazonda  Urun  aratma
    Given kullanici  "amazon  Url"  sayfasina  gider
    And arama  kutusunda  "nokia"  aratir
    And basligin "iphone" icerdigini dogrular
    #Bilerek fail aldık

  Scenario:TC04  Amazonda  Urun  aratma
    Given kullanici  "amazon  Url"  sayfasina  gider
    And arama  kutusunda  "motorola"  aratir
    And basligin "motorola" icerdigini dogrular

  Scenario:TC05  Amazonda  Urun  aratma
    Given kullanici  "amazon  Url"  sayfasina  gider
    And arama  kutusunda  "motorola"  aratir
    And basligin "motorola" icerdigini dogrular

#Bu file'da isteyerek fail alıp FailedRun class'ından nasıl çalıştırıldığını gördük