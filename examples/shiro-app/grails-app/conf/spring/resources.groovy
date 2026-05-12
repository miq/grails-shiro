import org.apache.shiro.grails.BcryptCredentialMatcher

// Place your Spring DSL code here
beans = {
    credentialsMatcher(BcryptCredentialMatcher) {
        rounds = 10
    }
}
