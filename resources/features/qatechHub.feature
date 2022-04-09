Feature: Application login

Scenario: as user i want to access QA HUB landing page
Given user launch the browser
And user navigate to qatech HUB landing page
When user validate page title and current URL
Then user is navigate to facebook landing page
And user navigate  back to the previous page
And user validate current URL
Then user navigate forward 
And user reload page
Then user close browser   