package dev.hayashi.forum.controller.request;

import dev.hayashi.forum.model.Topic;
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
