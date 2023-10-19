

  Feature: Library app login feature
    User Story : As a student, I  should be able to login with correct credentials,
    and library dashboard should be displayed.

    @123
    Scenario: Login as a student
      Given user is on the library login page
      When user types a valid email and password
      Then user should see the dashboard

    Scenario: Negative login test
      Given user is on the library login page
      When user types an invalid email and password
      Then user should see wrong login / password message displayed
