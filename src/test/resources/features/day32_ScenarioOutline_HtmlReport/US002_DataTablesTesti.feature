#https://editor.datatables.net adresine gidiniz
#Sayfadaki tabloda new butonuna basalım
#Çıkan pencerede verilen bilgileri girelim
#Create butonuna basalım
#Search bölümüne girdiğimiz firstname bilgisini girelim
#Başarılı bir şekilde giriş yapıldığını doğrulayalım
#Sayfayı kapatalım

Feature: US002_DataTables_Testi

  Background: https://editor.datatables.net sayfasında veri girisi
    Given kullanici "dataTable_Url" sayfasina gider

    Scenario Outline: TC01_DataTables'da Veri girisi
      Then kullanici sayfada ki tabloda new butonuna basar
      When cikan pencerede verilen bilgileri girelim "<firstname>","<lastname>","<position>","<office>","<extention>","<date>","<salary>"
      But kullanici 2 saniye bekler
      And kullanici create butonuna basar
      And kullanici search bölümüne "<firstname>" bilgisini girer
      And kullanici "<firstname>" ile basarili bir sekilde giris yapildigini dogrular
      And kullanici 2 saniye bekler
      And sayfayi kapatir

      Examples:
        | firstname | lastname | position    | office  | extention | date       | salary  |
        | john      | smith    | tester      | NYC     | 2134      | 2023-02-25 | 80000   |
        | sam       | walton   | businessman | LA      | 5262      | 2021-02-21 | 2000000 |
        | nancy     | brown    | developer   | Dallas  | 2346      | 2021-02-26 | 850000  |
        | george    | bush     | politician  | Dallas  | 9931      | 2021-02-24 | 9850000 |
        | barry     | allen    | unknown     | Central | 2103      | 2021-02-23 | 1000000 |
