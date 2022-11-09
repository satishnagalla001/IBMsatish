Feature: To test calculator
@Regression
  Scenario Outline: To launch calculator
    Given calculator url is launched
    Then Click on BMI Calculator
    And Enter "<Age>", "<Height>" and "<Weight>"
    Then Calculate BMI
    And capture the BMI Result

    Examples: 
      | Age | Height | Weight |
      |  10 |    127 |     40 |
      |  30 |    156 |     70 |
      |  25 |    152 |     55 |
      |  20 |    160 |     45 |
      |  35 |    160 |     70 |
