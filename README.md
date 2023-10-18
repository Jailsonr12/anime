# Santander Dev Week 2023 Java API

RESTful API da Santander Dev Week 2023 construída em Java 17 com Spring Boot 3, API de ANIME.

## Principais Tecnologias
 - **Java 17**: Utilizaremos a versão LTS mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
 - **Spring Boot 3**: Trabalharemos com a mais nova versão do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de autoconfiguração;
 - **Spring Data JPA**: Exploraremos como essa ferramenta pode simplificar nossa camada de acesso aos dados, facilitando a integração com bancos de dados SQL;
 - **OpenAPI (Swagger)**: Vamos criar uma documentação de API eficaz e fácil de entender usando a OpenAPI (Swagger), perfeitamente alinhada com a alta produtividade que o Spring Boot oferece;
 - **Railway**: facilita o deploy e monitoramento de nossas soluções na nuvem, além de oferecer diversos bancos de dados como serviço e pipelines de CI/CD.

## Diagrama de Classes (Domínio da API)

```mermaid
classDiagram
    class Anime {
        -name: String
        -image: String
        -description: String
        -author: String
    }
    
    class Duration {
        -season: String
        -episodes: int
    }
    
    class AnimeGenre {
        -genres: String[]
    }
    
    class ContentRating {
        -rating: String
    }
    
    class AverageRating {
        -rating: float
    }
    
    class ReleaseDate {
        -startDate: String
        -endDate: String
    }
    
    class AnimationStudio {
        -studioName: String
    }
    
    class Director {
        -directorName: String
    }
    
    class OriginalMangaStudio {
        -originalStudioName: String
    }
    
    class AnimeTrailer {
        -trailerURL: String
    }
    
    Anime -- Duration
    Anime -- AnimeGenre
    Anime -- ContentRating
    Anime -- AverageRating
    Anime -- ReleaseDate
    Anime -- AnimationStudio
    Anime -- Director
    Anime -- OriginalMangaStudio
    Anime -- AnimeTrailer

```
