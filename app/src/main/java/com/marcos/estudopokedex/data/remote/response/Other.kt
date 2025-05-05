package com.marcos.estudopokedex.data.remote.response

data class Other(
    val dream_world: DreamWorld = DreamWorld(),
    val home: Home = Home(),
    val official_artwork: OfficialArtwork = OfficialArtwork(),
    val showdown: Showdown = Showdown()
)