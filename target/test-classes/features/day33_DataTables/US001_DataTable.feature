Feature: US001_Amazonda ürün aratma
  Scenario: TC01_Amazonda urun aratma
    Given kullanici amazon sayfasina gider
    And kullanici verilen urunleri aratir
      | Urunler  |
      | samsung  |
      | nokia    |
      | iphone   |
      | motorola |
    And sayfayi kapatir

#DataTable; scenario'lardaki satır ve sütun için bir veri tablosu temsil eder
#Bunun için kullanılmak istenen her stepten sonra yukardaki örnekteki gibi bir tablo yapısı oluştururuz
#Ve bu stepin methodunu stepDefinition'da oluşturduğumuz zaman burdaki verileri alabilmemiz için
#oluşturulan methoda DataTable parametresi eklenir. Bu parametre ismi ile bir list oluşturulabilir
#yada direk asList() methodu ile row'lara ulaşabiliriz
#Bu parametre import io.cucumber.datatable.DataTable; dan olmalı
  #bunu yaptigi herseyi senaryo outline zaten yapar bu anlik mesela bir email ve password varsa
  # elinizde kolaylik saglar
#AltGr+<> = ||