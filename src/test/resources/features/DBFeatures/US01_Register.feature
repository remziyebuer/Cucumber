Feature: Aday ögrenciler sisteme kayit olabilirler
  Scenario Outline: US01_GuestUser
    Given "<username>" ile guest user  cagirir
    Then body sunlari icermeli:"<name>","<surname>","<birthplace>","<phone>","<gender>","<Date of Birth>","<ssn>","<username>","<password>"
    Examples:
      | username | name | surname | birthplace | phone         | gender | Date of Birth | ssn          | password |
      | john129  | John | Doe     | Ankara     | 3333-555-1234 | 0      | 2023-06-01    | 333-666-0987 | john.123 |
