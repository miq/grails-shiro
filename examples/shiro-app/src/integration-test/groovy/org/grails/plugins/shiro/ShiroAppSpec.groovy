package org.grails.plugins.shiro
import grails.plugin.geb.ContainerGebSpec
import grails.testing.mixin.integration.Integration

/**
 * See https://grails.apache.org/docs/latest/guide/testing.html#functionalTesting and https://groovy.apache.org/geb/manual/current/
 * for more instructions on how to write functional tests with Grails and Geb.
 */
@Integration
class ShiroAppSpec extends ContainerGebSpec {

    void 'should be redirected to login page when visiting the home page'() {
        when: 'visiting the home page'
            go('/')

        then: 'redirected to the login page'
            currentUrl.endsWith('/auth/login?targetUri=%2F')
            title == 'Login'
    }
}
