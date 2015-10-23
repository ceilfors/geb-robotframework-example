*** Settings ***
Documentation    Suite description
Library   com.ceilfors.gebrobot.TheInternetForm

*** Test Cases ***
Successful login
    [Documentation]  Happy path to login and logout
    Login  username=tomsmith
    ...    password=SuperSecretPassword!
    Secure Page Should Open
    Logout
    Login Page Should Open
