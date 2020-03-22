package hu.cib.szabi.szabidemo.repository;

import hu.cib.szabi.szabidemo.dto.Chapter;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;


public interface ChapterRepository extends ReactiveCrudRepository<Chapter,String> {
}
