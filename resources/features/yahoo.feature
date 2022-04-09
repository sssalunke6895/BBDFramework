Feature: Application login

Scenario: as user i want to access yahoo landing page

Given as user is launch the browser
And user navigate to yahoo landing page
When user verify the trending now 
And user validate the total number of link trending now
And  print the link test
And user navigate to each link 
And user is click on coronavirus menu bar link
And user get the content of cases overview like india and death
Then user exit browser 