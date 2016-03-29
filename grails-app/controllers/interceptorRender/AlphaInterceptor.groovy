package interceptorRender

import org.grails.web.util.GrailsApplicationAttributes


class AlphaInterceptor {

    AlphaInterceptor() {
        matchAll().excludes(controller: 'alpha')
    }

    boolean before() {
        if(params.alpha) {

            //WORKAROUND
            //request.setAttribute(GrailsApplicationAttributes.CONTROLLER_NAME_ATTRIBUTE, "alphabeta")

            render view: '/alpha/alpha'
            return false
        } else
            return true
    }

}
