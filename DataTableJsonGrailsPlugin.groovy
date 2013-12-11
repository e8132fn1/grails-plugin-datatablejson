class DataTableJsonGrailsPlugin {
    def version = "0.1"
    def grailsVersion = "2.0 > *"
    def pluginExcludes = [
        "web-app/**"
    ]

    def title = "Data Table Json Plugin"
    def author = "Ignacio Ocampo Millan"
    def authorEmail = "nafiux@gmail.com"
    def description = "Automagically generate JSON data for DataTable plugin"
    def documentation = "http://grails.org/plugin/data-table-json"

    def license = "APACHE"
    def organization = [ name: "Nafiux", url: "http://www.nafiux.com/" ]
    def issueManagement = [ system: "GIT", url: "https://github.com/nafiux/grails-plugin-datatablejson/issues" ]
    def scm = [ url: "https://github.com/nafiux/grails-plugin-datatablejson" ]
}
