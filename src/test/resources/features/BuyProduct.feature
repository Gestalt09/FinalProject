@SmokeTest

Feature: Buying product
  Scenario:  I Open Browser
    Given  Open Chrome browser
    When I Open https://www.1a.lv/
    Then Enter product
    And Press "Search" button
    And Click on first black pop-up
    And Click on seconde pop-up
    And Choose brand
    And Click on filter Button
    And Filter start from max price
    And Click on product
    And Click add to cart
    And Click go to the cart
    And Click check out
    And Input email
    And Click continue button
    And Click get in office
    And Click on first shop
    And input user data
    And Click continue button again

