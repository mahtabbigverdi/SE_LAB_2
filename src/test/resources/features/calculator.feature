@tag
Feature: Calculator
  Scenario: add two numbers
    Given Two input values, 1 and 2
    When I add the two values
    Then I expect the result 3


  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>
    Examples:
      | first | second | result |
      | 1     | 12     | 13     |
      | -1    | 6      | 5      |
      | 2     | 2      | 4      |
      | -2    | -3     |-5      |



  Scenario: operate on a number
    Given One input value, 4 and one operation rvs
    When I operate the value
    Then I expect the operation result 0.25


  Scenario: operate on a number
    Given One input value, 4 and one operation sqr
    When I operate the value
    Then I expect the operation result 2


  Scenario Outline: operate on a number
    Given One input value, <first> and one operation <operator>
    When I operate the value
    Then I expect the operation result <result>
    Examples:
      | first | operator | result  |
      | 16    | sqr      | 4       |
      | 2     | sqr      | 1.4142  |
      |-16    | sqr      | -1      |
      | 0     | sqr      | 0       |
      | 0     | rvs      | 0       |
      | 2     | rvs      | 0.5     |
      | 3     | rvs      | 0.33333 |
      |-3     | rvs      | -0.33333|
      |-1     | rvs      | -1      |


