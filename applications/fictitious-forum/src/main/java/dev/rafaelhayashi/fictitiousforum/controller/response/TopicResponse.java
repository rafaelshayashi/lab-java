package dev.rafaelhayashi.fictitiousforum.controller.response;

import dev.rafaelhayashi.fictitiousforum.model.StatusTopic;
import dev.rafaelhayashi.fictitiousforum.model.Topic;
import lombok.Getter;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;

@Getter
public class TopicResponse {

    private final String uuid;
    private final String title;
    private final StatusTopic status;
    private final String owner;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;

    public TopicResponse(Topic topic) {
        this.uuid = topic.getUuid().toString();
        this.title = topic.getTitle();
        this.status = topic.getStatus();
        this.owner = topic.getOwner();
        this.createdAt = topic.getCreatedAt();
        this.updatedAt = topic.getUpdatedAt();
    }

    public static Page<TopicResponse> of(Page<Topic> list) {
        return list.map(TopicResponse::new);
    }
}
