package dev.danvega.habitz.model;

import java.time.LocalDateTime;
import java.util.List;

public record Content(
        Integer id,
//        Integer userId, later
        Status status,
        ContentType contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url,
        List<Tag> tags
) {
}
