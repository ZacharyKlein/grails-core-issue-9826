class UrlMappings {

    static mappings = {

        "/alpha"(controller: 'alpha')
        "/beta"(controller: 'alpha')

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(controller: 'error', action: 'notFound')
    }
}
