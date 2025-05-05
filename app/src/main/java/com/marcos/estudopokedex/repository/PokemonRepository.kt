package com.marcos.estudopokedex.repository

import com.marcos.estudopokedex.data.remote.PokeApi
import com.marcos.estudopokedex.data.remote.response.Pokemon
import com.marcos.estudopokedex.data.remote.response.PokemonList
import com.marcos.estudopokedex.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api: PokeApi
) {
    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occurred.{getPokemonList}")
        }
        return Resource.Success(response)
    }

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        val response = try {
            api.getPokemonInfo(pokemonName)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occurred.{getPokemonInfo}")
        }
        return Resource.Success(response)
    }
}