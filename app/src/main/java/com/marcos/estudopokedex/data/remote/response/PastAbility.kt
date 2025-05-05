package com.marcos.estudopokedex.data.remote.response

data class PastAbility(
    val abilities: List<AbilityXX> = listOf(),
    val generation: Generation = Generation()
)