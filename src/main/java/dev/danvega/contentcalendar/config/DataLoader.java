package dev.danvega.contentcalendar.config;

import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import dev.danvega.contentcalendar.model.Content;
import dev.danvega.contentcalendar.repository.ContentRepository;
/*
 *  DataLoader class is responsible for initializing the content database by 
 * loading data from a specified JSON file when the Spring Boot application 
 * is started, but only if the repository currently contains no data. 
 * This is a common pattern for seeding a database with initial data.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final ContentRepository repository;
    private final ObjectMapper objectMapper;

    public DataLoader(ContentRepository repository, ObjectMapper objectMapper) {
        this.repository = repository;
        this.objectMapper = objectMapper;
    }

    @Override
    public void run(String... args) throws Exception {
        if(repository.count() == 0) {
            try (InputStream inputStream = TypeReference.class.getResourceAsStream("/data/content.json")) {
                repository.saveAll(objectMapper.readValue(inputStream,new TypeReference<List<Content>>(){}));
            }
        }
    }

}
