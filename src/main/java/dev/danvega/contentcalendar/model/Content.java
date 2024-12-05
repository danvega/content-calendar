package dev.danvega.contentcalendar.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
/*
 * @Id: An annotation from Spring Data that specifies 
 * the primary key of the entity.
  @Column: An annotation that specifies the database column name 
for the field it annotates.
 */
public record Content(
        @Id
        Integer id,
        String title,
        @Column(value = "description")
        String desc,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {
}
