package dev.rafaelhayashi.fictitiousforum.controller.request;

import dev.rafaelhayashi.fictitiousforum.model.Topic;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TopicRequest {

    private String title;
    private String user;

    public Topic toModel() {
        return new Topic(title, user);
    }
}
