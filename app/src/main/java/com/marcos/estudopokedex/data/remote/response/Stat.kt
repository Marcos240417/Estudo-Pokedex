package com.marcos.estudopokedex.data.remote.response

data class Stat(
    val base_stat: Int = 0,
    val effort: Int = 0,
    val stat: StatX = StatX()
)