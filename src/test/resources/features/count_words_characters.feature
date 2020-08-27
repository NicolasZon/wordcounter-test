Feature: Counting words and characters

  Scenario: Bacic test counter
    Given Nico is counting the words of a test in the website
    When he types the Lorem Ipsum
    Then he should see the number of words and characters in the Lorem Ipsum