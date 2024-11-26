package dev.hayashi.forum.service;

import dev.hayashi.forum.controller.request.TopicRequest;
import dev.hayashi.forum.model.Topic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TopicService {

    Topic create(TopicRequest request);

    Page<Topic> list(Pageable pageable);
}
