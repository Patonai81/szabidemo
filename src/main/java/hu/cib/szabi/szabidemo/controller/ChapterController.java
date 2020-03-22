package hu.cib.szabi.szabidemo.controller;


import hu.cib.szabi.szabidemo.dto.Chapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import hu.cib.szabi.szabidemo.repository.ChapterRepository;

@RestController
public class ChapterController {

    ChapterRepository chapterRepository;

    @Autowired
    public ChapterController(ChapterRepository chapterRepository) {
        this.chapterRepository = chapterRepository;
    }

    @GetMapping("/chapters")
    public Flux<Chapter>  list(){
        return chapterRepository.findAll();
    }

}
