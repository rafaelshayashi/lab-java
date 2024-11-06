package dev.rafaelhayashi.fictitiousforum.repository;

import dev.rafaelhayashi.fictitiousforum.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
