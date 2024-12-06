package dev.danvega.contentcalendar.config;

import org.springframework.boot.context.properties.ConfigurationProperties;


/*
 * annotation is used to bind external configuration properties
 *  (usually from application.properties or application.yml files) to a Java object.
 *  When you annotate a class with @ConfigurationProperties(value = "cc"),
 *  you are telling Spring Boot to prefix the properties in that class with the
 *  specified value, in this case, "cc".
 */
@ConfigurationProperties(value = "cc")
public record ContentCalendarProperties(String welcomeMessage, String about) {

}
