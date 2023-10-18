package me.dio.anime.service;

import me.dio.anime.domain.model.Anime;

public interface AnimeService {

    Anime findById(Long id);

    Anime create(Anime animeToCreate);
}
