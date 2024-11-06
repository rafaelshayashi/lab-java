package dev.rafaelhayashi.fictitiousforum.service;

import dev.rafaelhayashi.fictitiousforum.controller.request.TopicRequest;
import dev.rafaelhayashi.fictitiousforum.model.Topic;
import dev.rafaelhayashi.fictitiousforum.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TopicServiceImpl implements TopicService {

    private final TopicRepository repository;

    @Autowired
    public TopicServiceImpl(TopicRepository repository) {
        this.repository = repository;
    }

    @Override
    public Topic create(TopicRequest request) {
        return repository.save(request.toModel());
    }

    @Override
    public Page<Topic> list(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
