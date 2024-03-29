@TestA
Feature: Customer module (Admin)

  @Test1
  Scenario: create new customer from admin
    Given open application with "chrome"
    When create new customer from admin "admin" and "i95devteam" and "Chandra" and "shekar" and "chan3@gm.com"
    And click on save customer
    And close the browser

  @Test2
  Scenario: Customer creation along with address from Magento admin
    Given open application with "chrome"
    When create new customer from admin "admin" and "i95devteam" and "Chandra" and "shekar" and "chan5@jiva.com"
    Then create address "Test Street" and "Test city" and "12345789" and "123-123-4567"
    And click on save customer
    And close the browser

  @smoketest @Test11
  Scenario: Customer group creation from admin
    Given open application with "chrome"
    Then login in to admin "admin" and "i95devteam"
    When Create customer group "Test2group"
    And close the browser

  @Test12
  Scenario: Customer group assign for the customer from Magento admin
    Given open application with "chrome"
    Then login in to admin "admin" and "i95devteam"
    Then Assign customer group to a customer "chan2@gm.com"
    And close the browser

 
    
    
@Test3
  Scenario: Multiple addresses creation from Magento admin 
@Test4
  Scenario: Customer update from Magento admin 
@Test5
  Scenario: Customer Email Update from Magento admin 
@Test6
  Scenario: customer creation with address from Magento admin, without assigning billing and shipping
@Test7
  Scenario: Customer creation with same billing and shipping address from Magento admin 
@Test8
  Scenario: Customer creation with different billing and shipping address from Magento admin 
@Test9
  Scenario: Customer address update from Magento admin 
@Test10
  Scenario: Interchanging the billing address and shipping address from Magento admin  for customer
    
    
    
    
    
    
    
