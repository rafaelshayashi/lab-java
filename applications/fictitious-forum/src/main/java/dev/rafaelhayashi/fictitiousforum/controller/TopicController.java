package dev.rafaelhayashi.fictitiousforum.controller;

import dev.rafaelhayashi.fictitiousforum.controller.request.TopicRequest;
import dev.rafaelhayashi.fictitiousforum.controller.response.TopicResponse;
import dev.rafaelhayashi.fictitiousforum.model.Topic;
import dev.rafaelhayashi.fictitiousforum.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/topics")
public class TopicController {

    private final TopicService service;

    @Autowired
    public TopicController(TopicService service) {
        this.service = service;
    }

    @GetMapping
    public Page<TopicResponse> list(Pageable pageable){
        Page<Topic> list = service.list(pageable);
        return TopicResponse.of(list);
    }

    @PostMapping
    public ResponseEntity<TopicResponse> create(@RequestBody TopicRequest request,
                                                UriComponentsBuilder uriBuilder){

        Topic topic = service.create(request);

        URI uri = uriBuilder.path("/topics/{id}").buildAndExpand(topic.getUuid()).toUri();
        return ResponseEntity.created(uri).body(new TopicResponse(topic));
    }
}
