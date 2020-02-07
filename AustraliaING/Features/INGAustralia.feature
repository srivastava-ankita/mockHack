

Feature: ChromeBrowser Launching
  

  @tag1
  Scenario: Open browser and launch new customerpage and enter the details 
  META-DATA:
    Given : Launch ChromeBrowser
    
   When  :Clicking Savings Accerator Option and Fill up the new account form with the following data
    |Nationality | Title | First Name  | Middle name | Family name  | Date of birth  | DOB Year  | Gender |
    | India      | Mr 	 | IndiA       | iNDIA       | iNDIA	      | 05/12/1992 		 | 1990 	 | Male   |
 Then : close the browser
  
