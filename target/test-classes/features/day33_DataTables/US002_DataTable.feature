Feature: US002_BlueRentalCar Login Islemi
  Scenario: TC01_BlueRentalCar Pozitive Test
    Given kullanici "blueRentACar_Url" sayfasina gider
    Then verilen kullanici ile login olur ve login olundugu dogrulanir

      | email                         | password  |
      | sam.walker@bluerentalcars.com | c!fas_art |
      | kate.brown@bluerentalcars.com | tad1$Fas  |

    And sayfayi kapatir
