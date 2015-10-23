package com.ceilfors.gebrobot
import com.ceilfors.gebrobot.page.LoginPage
import com.ceilfors.gebrobot.page.SecurePage
import geb.Browser
/**
 * @author ceilfors
 */
class TheInternetForm {

    def browser = new Browser(baseUrl: "http://the-internet.herokuapp.com/")

    public void login(Map map) {
        browser.to LoginPage
        browser.at LoginPage
        browser.login(map.username, map.password)
        securePageShouldOpen()
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
}
