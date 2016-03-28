package interceptorRender


import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(AlphaInterceptor)
class AlphaInterceptorSpec extends Specification {

    def setup() {
    }

    def cleanup() {

    }

    void "Test alpha interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"alpha")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
