package org.grails.plugins.shiro

import grails.gorm.transactions.Transactional
import org.apache.shiro.authc.credential.CredentialsMatcher
import org.apache.shiro.grails.BcryptCredentialMatcher

class BootStrap {
    CredentialsMatcher credentialsMatcher

    def init = {
        addDemoUsers()
    }

    @Transactional
    private void addDemoUsers() {
        new ShiroUser(username: 'demo', passwordHash: encryptPassword("secret")).save(flush: true)
    }

    private String encryptPassword(String plainTextPassword) {
        ((BcryptCredentialMatcher) credentialsMatcher).encryptPassword(plainTextPassword)
    }

    def destroy = {
    }

}