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

    When User hovers on the flag icon in the top menu bar
    And User clicks on Deutsch - DE

    Then The text indicating the language changes from English to Deutsch







#  Scenario: Login to GitHub
#
#    Given User is on "Login Page"
#
#    When User enters username as "juliaHrabovska" and password on "Login Page"
#
#    Then User is successfully navigated to the "https://github.com/"
#    And User info "juliaHrabovska" on "Home Page" is present on navigation panel

#  Scenario Outline: Login to GitHub (negative)
#
#    Given User is on "Login Page"
#
#    When User enters username as "<username>" and password as "<password>" on "Login Page"
#
#    Then User gets error message "Incorrect username or password." on "Login Page"
#
#    Examples:
#      | username       | password |
#      | juliaHrabovska | qwerty   |
#      | qwerty         | qwerty   |


