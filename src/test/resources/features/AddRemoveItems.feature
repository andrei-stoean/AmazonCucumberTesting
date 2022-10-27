Feature: Add and Remove Items from Cart on Amazon

  Scenario: Add item in cart

    Given User is on Home Page
    And User clicks on Computers and Accessories category on Home page

    When User clicks on Seagate Portable 2TB External Hard Drive on Results Page
    And User clicks on Add to Cart on Product Page

    Then Cart number is 1 and a message "Added to Cart" must appear on Product Page

  Scenario: Remove item from cart

    Given User added and item in cart
    And User clicks on Cart

    When User clicks on Delete

    Then Text appears "Your Amazon Cart is empty."
    And the subtotal price is "$0.00"

  Scenario: Change the language of the webpage

    Given User is on Home Page
    And User clicks on the flag icon in the top menu bar

    When User clicks on Deutsch - DE
    And User clicks on anderungen speichern

    Then The Hello, sign in text changes to Hallo, anmelden










