package me.dio.anime.controller;

import me.dio.anime.domain.model.Anime;
import me.dio.anime.service.AnimeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/anime")
public class AnimeController {

    private final AnimeService animeService;

    public AnimeController(AnimeService animeService) {
        this.animeService = animeService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Anime> findById(@PathVariable Long id) {
        var anime = animeService.findById(id);
        return ResponseEntity.ok(anime);
    }

    @PostMapping
    public ResponseEntity<Anime> create(@RequestBody Anime animeToCreate) {
        var userCreated = animeService.create(animeToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(userCreated);
    }

}
