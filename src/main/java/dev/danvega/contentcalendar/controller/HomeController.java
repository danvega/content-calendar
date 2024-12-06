package dev.danvega.contentcalendar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.danvega.contentcalendar.config.ContentCalendarProperties;

/*
 * The constructor takes an instance of ContentCalendarProperties as a parameter and 
 * assigns it to the properties variable. This instance is injected by the 
 * Spring framework, allowing access to configuration properties defined in a 
 * properties file (like application.properties or application.yml).
 */
@RestController
public class HomeController {

    private final ContentCalendarProperties properties;

    public HomeController(ContentCalendarProperties properties) {
        this.properties = properties;
    }
    /*
     * Endpoint: This method is mapped to the root URL (GET /).
        When a GET request is made to the root URL, the home() method is invoked.
        It returns the ContentCalendarProperties object, which will be automatically 
        serialized to JSON format in the HTTP response. This allows clients to view the 
        current application properties.
     */
    @GetMapping("/")
    public ContentCalendarProperties home() {
        return properties;
    }

}
