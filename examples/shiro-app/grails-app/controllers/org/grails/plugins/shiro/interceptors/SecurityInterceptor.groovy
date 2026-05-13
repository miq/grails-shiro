package org.grails.plugins.shiro.interceptors

/**
 * We use this interceptor to restrict access to all endpoints except the auth controller to logged in users.
 * This is necessary because our application is configured with {@code security.shiro.filter.allowAccessByDefault: true}
 */
class SecurityInterceptor {

    SecurityInterceptor() {
        matchAll()
    }

    boolean before() {
        if (controllerName == 'auth') {
            return true
        }
        // This just means that the user must be authenticated. He does not need any particular role or permission.
        accessControl { true }
    }
}
