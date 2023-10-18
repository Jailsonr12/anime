package me.dio.anime.controller;

import me.dio.anime.domain.model.Anime;
import me.dio.anime.domain.model.Genre;
import me.dio.anime.domain.repository.GenreRepository;
import me.dio.anime.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/anime")
public class AnimeController {

    private final AnimeService animeService;
    private final GenreRepository genreRepository;

    @Autowired
    public AnimeController(AnimeService animeService, GenreRepository genreRepository) {
        this.animeService = animeService;
        this.genreRepository = genreRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Anime> findById(@PathVariable Long id) {
        var anime = animeService.findById(id);
        return ResponseEntity.ok(anime);
    }

    @PostMapping
    public ResponseEntity<Anime> create(@RequestBody Anime animeToCreate) {
        var animeCreated = animeService.create(animeToCreate);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(animeCreated.getId())
                .toUri();

        return ResponseEntity.created(location).body(animeCreated);
    }


    @GetMapping()
    public ResponseEntity<List<Anime>> findAll() {
        List<Anime> animeList = animeService.findAll();
        return ResponseEntity.ok(animeList);
    }
}