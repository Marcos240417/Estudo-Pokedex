# Estudo-Pokedex
O objetivo desse projeto é treinar padrões de desenvolvimento Android, para isso, você deve focar em organizar e estruturar o projeto com as melhores práticas de mercado.
* Construa um aplicativo que faça aparecer uma lista de pokémons e cada item da lista deve aparecer a imagem do pokémon e o nome dele.
* Ao clicar em um pokémon, deve navegar para uma tela de detalhes.

## Arquitetura
A arquitetura recomendada para qualquer projeto android é a MVVM, garantindo a separação de contexto para cada camada, evitando que classes de dados (Ex: classes de banco de dados e de requisições sejam utilizadas na camada de apresentação). Garanta que isso não aconteça, mepeando (convertendo) classes de dados em classes de camadas superiores e virse-versa.

## API
https://pokeapi.co/

## Draw.io
https://app.diagrams.net/#G10MI-iNZHP7bz5M9aRTZKgla8XDq_OTpb#%7B%22pageId%22%3A%22sUEEEbqDDXv_vGDD3ByX%22%7D

## Bibliotecas recomendadas
Para esse projeto, recomendo a utilização das seguintes libs:
| Lib       | README                                                                        |
|-----------|-------------------------------------------------------------------------------|
| Retrofit2 | https://square.github.io/retrofit/                                            |
| Okhttp3   | https://square.github.io/okhttp/                                              |
| Paging3   | https://developer.android.com/topic/libraries/architecture/paging/v3-migration?hl=pt-br |
| Room      | https://developer.android.com/training/data-storage/room                      |
| Koin      | https://insert-koin.io/docs/quickstart/android                                |
| Coil-kt   | https://coil-kt.github.io/coil/compose/                                       |    
