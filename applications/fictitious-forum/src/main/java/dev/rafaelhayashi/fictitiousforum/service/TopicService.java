package dev.rafaelhayashi.fictitiousforum.service;

import dev.rafaelhayashi.fictitiousforum.controller.request.TopicRequest;
import dev.rafaelhayashi.fictitiousforum.model.Topic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TopicService {

    Topic create(TopicRequest request);

    Page<Topic> list(Pageable pageable);
}
