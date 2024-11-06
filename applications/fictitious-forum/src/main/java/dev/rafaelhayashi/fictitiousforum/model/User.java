package dev.rafaelhayashi.fictitiousforum.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Data
@AllArgsConstructor(staticName = "of")
public class User {

    @Id
    private Long id;
    private UUID uuid;
    private String name;
}
