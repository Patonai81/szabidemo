package hu.cib.szabi.szabidemo.repository;


import hu.cib.szabi.szabidemo.dto.Chapter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

@Configuration
public class LoadDataBase {

    @Bean
    CommandLineRunner init(ChapterRepository chapterRepository) {

        return args -> {
            Flux.just(new Chapter("Chapter1"), new Chapter("Chapter2")).flatMap(chapterRepository::save).subscribe(System.out::println);
        };

    }
}

