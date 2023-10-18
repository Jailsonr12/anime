package me.dio.anime.service;

import me.dio.anime.domain.model.Anime;

import java.util.List;

public interface AnimeService {

    Anime findById(Long id);

    Anime create(Anime animeToCreate);

    List<Anime> findAll();
}
