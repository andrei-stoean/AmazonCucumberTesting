Feature: Test scenario for Amazon

  Scenario: Add item in cart

    Given User is on "Home Page"
    And User clicks on Computers and Accessories category on Home page

    When User clicks on Seagate Portable 2TB External Hard Drive on Results Page
    And User clicks on Add to Cart on Product Page

    Then Cart number is 1 and a message "Added to Cart" must appear on Product Page

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

