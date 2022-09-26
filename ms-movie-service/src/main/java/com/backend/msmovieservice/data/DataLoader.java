package com.backend.msmovieservice.data;

import com.backend.msmovieservice.domain.Movie;
import com.backend.msmovieservice.repository.IMovieRepository;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
public class DataLoader implements ApplicationRunner {

    private final IMovieRepository repository;

    public DataLoader(IMovieRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        repository.save(new Movie(UUID.randomUUID(), "peli1", "terror", "what"));
        repository.save(new Movie(UUID.randomUUID(), "peli2", "terror", "what"));
        repository.save(new Movie(UUID.randomUUID(), "peli3", "terror", "what"));
        repository.save(new Movie(UUID.randomUUID(), "peli4", "romance", "what"));
        repository.save(new Movie(UUID.randomUUID(), "peli5", "accion", "what"));
        repository.save(new Movie(UUID.randomUUID(), "peli6", "accion", "what"));
        repository.save(new Movie(UUID.randomUUID(), "peli7", "romance", "what"));
        repository.save(new Movie(UUID.randomUUID(), "peli8", "romance", "what"));
    }
}
