Feature: User searches for Product

  @amazon
  Scenario: User login to amazon
    Given User launch website
    When user is on homepage
    And user searches for product
    And user adds product to cart
    And user proceeds to checkout

  @ebay
  Scenario: user login to ebay
    Given User launch ebaywebsite
    When user verify title of page
    When user clicks on Fashion and selects womenshoes
    And user selects footwear and verify text
#    And user add to cart and checkout
