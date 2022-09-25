Feature: 
  Validate the my account functionality of the star three sixty application

  @page1
  Scenario: 
    user clicks the my account option

    Given user opens chrome and login to star three sixty application url
    When user clicks the my account option
    Then user navigated to login or singup page

  @page2
  Scenario: 
    user provides email and password

    Given User open star three sixty application and click my account
    When user enter email id in text box
    And user provides password in text box
    And user clicks sign in button
    Then user navigated tho invalid credential page

  @page3
  Scenario: 
    user provides invalid user name and invalid password

    #One dimensional List
    Given User open star three sixty application and clicks my account
    When user enter email id in the text box
      | vijay@gmaia.com | priya@fmsh.com | gokul@fmadis.com |
    And user provides password in the text box
      | hefeh24 | grgj30 | dvdf90 |
    And user clicks signin button
    Then user navigated to invalid credential page

  @page4
  Scenario Outline: 
    User open my account options and provide different credentials

    Given user opens chrome and go to star three sixty application
    When user clicks my acc option
    And User provide "<username>" and "<password>"
    And User clicks the sign in button
    Then User navigated to the invalid credential page

    Examples: 
      | username          | password |
      | vijay@gmail.com   | cgfh32   |
      | pridvgs@gmail.com | 24824fss |

  #tow dimensional list
  @page5
  Scenario: 
    Validate the my account functionality of the star360 application

    Given User got to the star360 application by chrome
    When I clicks the my account option
    And User provide user name in user name field
      | 1vijadfd2@gmail.com | 2fgsfghsf@gmail.com |
      | 3fscshc@gmail.com   | 4sfsfsfh@gmail.com  |
    And User provide password in password field
      | 1sfsfh | 2sffh | 3sfwfhw |
      | 4dvhfw | 5dfh3 | 6dbhs   |
    And User clicks singin button
    Then user nvg to invld crdntl page
