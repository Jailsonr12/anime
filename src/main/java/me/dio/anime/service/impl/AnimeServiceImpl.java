package me.dio.anime.service.impl;


import me.dio.anime.domain.model.Anime;
import me.dio.anime.domain.repository.AnimeRepository;
import me.dio.anime.service.AnimeService;
import org.springframework.stereotype.Service;

@Service
public class AnimeServiceImpl implements AnimeService {

    private final AnimeRepository animeRepository;

    public AnimeServiceImpl(AnimeRepository animeRepository){
        this.animeRepository = animeRepository;
    }

    @Override
    public Anime findById(Long id) {
        return animeRepository.findById(id).orElseThrow(NoSuchFieldError::new);
    }

    @Override
    public Anime create(Anime animeToCreate) {
        return animeRepository.save(animeToCreate);
    }
}
