package dev.rafaelhayashi.fictitiousforum.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Message {

    @Id
    private Long id;
    private UUID uuid;
    private Topic topic;
    private String message;
    private String author;
    private LocalDateTime createdAt;

}
