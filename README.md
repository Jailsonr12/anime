# Santander Dev Week 2023 Java API

RESTful API da Santander Dev Week 2023 construída em Java 17 com Spring Boot 3, API de ANIME.

## Principais Tecnologias
 - **Java 17**: Utilizaremos a versão LTS mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
 - **Spring Boot 3**: Trabalharemos com a mais nova versão do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de autoconfiguração;
 - **Spring Data JPA**: Exploraremos como essa ferramenta pode simplificar nossa camada de acesso aos dados, facilitando a integração com bancos de dados SQL;
 - **OpenAPI (Swagger)**: Vamos criar uma documentação de API eficaz e fácil de entender usando a OpenAPI (Swagger), perfeitamente alinhada com a alta produtividade que o Spring Boot oferece;
 - **Railway**: facilita o deploy e monitoramento de nossas soluções na nuvem, além de oferecer diversos bancos de dados como serviço e pipelines de CI/CD. **(Nao consegui subir minha API porque precisa verificar meu perfil no git)**

## Diagrama de Classes (Domínio da API)

```mermaid
cclassDiagram
  class Anime {
    +id: Long
    +name: String
    +image: String
    +description: String
    +accountNumber: String
    +author: String
    +duration: Duration
    +genres: List<Genre>
    +contentRating: String
    +averageRating: float
    +releaseDate: ReleaseDate
    +animationStudio: String
    +originalMangaStudio: String
    +trailerURL: String
  }

  class Duration {
    +id: Long
    +season: String
    +episodes: int
  }

  class Genre {
    +id: Long
    +name: String
  }

  class ReleaseDate {
    +id: Long
    +startDate: String
    +endDate: String
  }

  Anime -- Duration: duration
  Anime *-- Genre: genres
  Anime -- ReleaseDate: releaseDate

```
