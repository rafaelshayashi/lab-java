package dev.rafaelhayashi.fictitiousforum.controller.request;

import dev.rafaelhayashi.fictitiousforum.model.Topic;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TopicRequest {

    @NotEmpty
    private String title;
    @NotEmpty
    private String user;

    public Topic toModel() {
        return new Topic(title, user);
    }
}
