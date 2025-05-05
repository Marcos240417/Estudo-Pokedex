package com.marcos.estudopokedex.data.remote.response

data class PokemonList(
    val count: Int = 0,
    val next: String = "",
    val previous: Any? = null,
    val results: List<Result> = listOf()
)