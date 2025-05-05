package com.marcos.estudopokedex.data.remote.response

data class VersionGroupDetail(
    val level_learned_at: Int = 0,
    val move_learn_method: MoveLearnMethod = MoveLearnMethod(),
    val order: Int? = null,
    val version_group: VersionGroup = VersionGroup()
)