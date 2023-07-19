Feature: BlueRentalCar Excel Login
  Scenario: TC01 Positive Login Testi
    Given kullanici "blueRentACarUrl" sayfasina gider
    And kullanici exceldeki "customer info" sayfasindaki kullanici bilgileri ile login olur

  Scenario: TC02 Positive Login Testi
    Given kullanici "blueRentACarUrl" sayfasina gider
    And kullanici exceldeki "admin info" sayfasindaki kullanici bilgileri ile login olur