package me.dio.anime.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_anime")
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    private String image;

    private String description;

    private String accountNumber;

    private String author;

    @OneToOne(cascade = CascadeType.ALL)
    private Duration duration;

    @JsonIgnoreProperties({"anime"})
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Genre> genres;

    private String contentRating;

    private float averageRating;

    @OneToOne(cascade = CascadeType.ALL)
    private ReleaseDate releaseDate;

    private String animationStudio;

    private String originalMangaStudio;

    @Column(unique = true)
    private String trailerURL;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public String getContentRating() {
        return contentRating;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    public float getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(float averageRating) {
        this.averageRating = averageRating;
    }

    public ReleaseDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(ReleaseDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getAnimationStudio() {
        return animationStudio;
    }

    public void setAnimationStudio(String animationStudio) {
        this.animationStudio = animationStudio;
    }

    public String getOriginalMangaStudio() {
        return originalMangaStudio;
    }

    public void setOriginalMangaStudio(String originalMangaStudio) {
        this.originalMangaStudio = originalMangaStudio;
    }

    public String getTrailerURL() {
        return trailerURL;
    }

    public void setTrailerURL(String trailerURL) {
        this.trailerURL = trailerURL;
    }
}
