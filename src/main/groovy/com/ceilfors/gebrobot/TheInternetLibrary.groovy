package com.ceilfors.gebrobot
import com.ceilfors.gebrobot.page.LoginPage
import com.ceilfors.gebrobot.page.SecurePage
import geb.Browser
/**
 * @author ceilfors
 */
class TheInternetLibrary {

    def browser = new Browser(baseUrl: "http://the-internet.herokuapp.com/")

    public void login(Map map) {
        browser.with {
            to LoginPage
            at LoginPage
            delegate.login(map.username, map.password)
        }
    }

    public void logout() {
        browser.logoutBtn.click()
        loginPageShouldOpen()
    }

    public void securePageShouldOpen() {
        assert browser.at(SecurePage)
    }

    public void loginPageShouldOpen() {
        assert browser.at(LoginPage)
    }

    public void loginErrorMessageShouldAppear(String errorMessage) {
        loginPageShouldOpen()
        assert browser.flashMessage.text().contains(errorMessage)
    }
}
