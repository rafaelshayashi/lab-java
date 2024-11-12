package dev.rafaelhayashi.fictitiousforum.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID uuid;
    private String title;
    @Enumerated(EnumType.STRING)
    private StatusTopic status;
    private String owner;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;


    public Topic(String title, String owner){
        this.uuid = UUID.randomUUID();
        this.title = title;
        this.status = StatusTopic.OPEN;
        this.owner = owner;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
}
