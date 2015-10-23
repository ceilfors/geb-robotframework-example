package com.ceilfors.gebrobot.page
import geb.Page
/**
 * @author ceilfors
 */
class LoginPage extends Page {

    static url = "login"
    static at = {
        waitFor { $('#content .example h2').displayed }
        $('#content .example h2').text() == 'Login Page'
    }

    static content = {
        usernameTxt { $('#username') }
        passwordTxt { $('#password') }
        loginBtn { $('i.fa-sign-in')}
        flashMessage { $('#flash-messages div')}
    }

    def login(String username, String password) {
        usernameTxt.value(username)
        passwordTxt.value(password)
        loginBtn.click()
    }
}
