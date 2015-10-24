*** Settings ***
Library   com.ceilfors.gebrobot.TheInternetLibrary

*** Test Cases ***
Successful login
    Login
    ...    username=tomsmith
    ...    password=SuperSecretPassword!
    Secure Page Should Open
    Logout
    Login Page Should Open

Invalid user
    Login
    ...    username=invaliduser
    ...    password=SuperSecretPassword!
    Login Error Message Should Appear  username is invalid

Invalid password
    Login
    ...    username=tomsmith
    ...    password=wrongpassword
    Login Error Message Should Appear  password is invalid
