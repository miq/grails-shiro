package org.grails.plugins.shiro

class ShiroUser {
    String username
    String passwordHash
    
    static hasMany = [ roles: ShiroRole, permissions: String ]

    static constraints = {
        username(nullable: false, blank: false, unique: true)
    }
}
