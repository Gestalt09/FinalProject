@SmokeTest

Feature: Buying product
  Scenario:  I search product vide card and
  after adding it to the cart i filling shipping form
    Given  I Open https://www.1a.lv/
    When Enter product
    Then Press "Search" button
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
    And Click continue button seconde time

