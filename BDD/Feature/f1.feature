Feature:Test the automation practice 
@Sc1 
Scenario :Test the login page
Given Open chrome browser and url of the application
When Enter "<username>", "<password>" and click on the login button
Then success in login
Then close the appliaction 


Examples:
|username    |password|
|aaaaa        |abc@123|
|bbbbb				 |mama$124|
|ccccc				  |cat&125|	