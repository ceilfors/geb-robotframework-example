package com.ceilfors.gebrobot.page

import geb.Page

/**
 * @author ceilfors
 */
class SecurePage extends Page {

    static url = "secure"
    static at = {
        waitFor { $('#content .example h2').displayed }
        $('#content .example h2').text() == 'Secure Area'
    }

    static content = {
        logoutBtn {
            waitFor { $('i.icon-signout').displayed }
            $('i.icon-signout')
        }
    }
}
