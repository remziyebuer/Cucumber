
Feature: US001_Amazon Sayfasi Testi
 @ilk
  Scenario: TC01_Amazon Sayfasinda Urun aratilir

  Given kullanici amazon sayfasina gider
  And arama kutusunda iphone aratir
   And sayfayi kapatir

#otomatik cekic; yanda ki maven - lifecycle-test-Execute Before Build tikli olmali