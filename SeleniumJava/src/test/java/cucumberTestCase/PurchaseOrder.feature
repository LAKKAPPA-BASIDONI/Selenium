
@tag
Feature: Login Scenario
  I want to use this template for my feature file

  
	Background:
	Given Landed on Page

  @tag2
  Scenario Outline: Positive test of login
    Given Loged in with userName <name> and password<password>
    When Enter Signin Btn
    Then validate message

    Examples: 
      |   name               | password    | 
      |  anshika@gmail.com   | Iamking@000 | 
