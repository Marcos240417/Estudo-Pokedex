package com.marcos.estudopokedex.data.remote.response

data class Ability(
    val ability: AbilityX = AbilityX(),
    val is_hidden: Boolean = false,
    val slot: Int = 0
)