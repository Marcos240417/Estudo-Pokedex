package com.marcos.estudopokedex.data.remote.response

data class Move(
    val move: MoveX = MoveX(),
    val version_group_details: List<VersionGroupDetail> = listOf()
)