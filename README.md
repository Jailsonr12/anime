# Santander Dev Week 2023 Java API

Esta é a RESTful API da Santander Dev Week 2023, construída em Java 17 com o Spring Boot 3, focada na gestão de informações sobre animes.

## Principais Tecnologias

- **Java 17**: Utilizamos a versão LTS mais recente do Java para aproveitar as últimas inovações que essa linguagem robusta oferece. 

- **Spring Boot 3**: Estamos trabalhando com a versão mais recente do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de autoconfiguração.

- **Spring Data JPA**: Exploramos como essa ferramenta simplifica nossa camada de acesso aos dados, facilitando a integração com bancos de dados SQL.

- **OpenAPI (Swagger)**: Criamos uma documentação de API eficaz e fácil de entender usando o OpenAPI (Swagger), alinhada com a alta produtividade que o Spring Boot oferece.

- **Railway**: Nossa solução facilita o deploy e monitoramento na nuvem, oferecendo diversos bancos de dados como serviço e pipelines de CI/CD. **(Nossa API não foi implantada ainda, pois requer a verificação do perfil do Git no Railway)**.

- **Maven**: Uma ferramenta de automação e gerenciamento de projetos Java, embora também possa ser utilizada com outras linguagens.

## Diagrama de Classes (Domínio da API)

O diagrama de classes abaixo representa a estrutura do domínio da API:

```mermaid
classDiagram
  class Anime {
    id: Long
    name: String
    image: String
    description: String
    accountNumber: String
    author: String
    duration: Duration
    genres: List<Genre>
    contentRating: String
    averageRating: float
    releaseDate: ReleaseDate
    animationStudio: String
    originalMangaStudio: String
    trailerURL: String
  }

  class Duration {
    id: Long
    season: String
    episodes: int
  }

  class Genre {
    id: Long
    name: String
  }

  class ReleaseDate {
    id: Long
    startDate: String
    endDate: String
  }

  Anime -- Duration: duration
  Anime *-- Genre: genres
  Anime -- ReleaseDate: releaseDate
