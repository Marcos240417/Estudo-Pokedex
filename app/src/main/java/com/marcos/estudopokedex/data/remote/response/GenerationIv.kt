package com.marcos.estudopokedex.data.remote.response

data class GenerationIv(
    val diamond_pearl: DiamondPearl = DiamondPearl(),
    val heartgold_soulsilver: HeartgoldSoulsilver = HeartgoldSoulsilver(),
    val platinum: Platinum = Platinum()
)