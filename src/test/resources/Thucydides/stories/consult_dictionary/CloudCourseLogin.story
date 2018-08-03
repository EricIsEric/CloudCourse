Meta:
@feature Login
Scenario: --1--Login with a normal account
Given Delete all cookies before start testing
When the user has opened the CloudCourse webpage https://t.tcjyy.com/login
Then the user enters username admin and password 123456 to CloudCourse login page
Then click login button for one
Then check login statusOne
Then Click Logout button for One

Scenario: --2--Login with another normal account
Then the user enters username chaoji and password 123456 to CloudCourse login page
Then click login button for two
Then check login statusTwo
Then Click Logout button for Two

Scenario: --3--Login with an invalid account
Then the user enters username 21321 and password 124324 to CloudCourse login page
Then click login button for three
Then check login statusThree
Then clear text content for Three

Scenario: --4--Login with password field as empty
Then the user enters username 21321 and password with blank to CloudCourse login page
Then click login button for four
Then check login statusFour
Then clear text content for Four

Scenario: --5--Login with username field as empty
Then the user enters username with blank and password 123456 to CloudCourse login page
Then click login button for five
Then check login statusFive
Then clear text content for Five
