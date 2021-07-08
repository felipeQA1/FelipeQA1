
@tag
Feature: Realizar Login
  Eu como usuario quero acessar o site e realizar o login 

  @tag1
  Scenario: Validar funionalidade de login
    Given que eu acesse o site "http://advantageonlineshopping.com/#/"
    When preencha os campos com usuario e senha 
    Then sera validado login e senha 
   