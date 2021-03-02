package com.github.jeancsanchez.viacepapi

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 23/07/19.
 * Jesus is alive!
 */
@Suppress("SpellCheckingInspection")
@JsonClass(generateAdapter = true)
data class Cep(
    @Json(name = "cep")
    val cep: String,

    @Json(name = "bairro")
    val bairro: String,

    @Json(name = "complemento")
    val complemento: String,

    @Json(name = "gia")
    val gia: String,

    @Json(name = "ibge")
    val ibge: String,

    @Json(name = "localidade")
    val localidade: String,

    @Json(name = "logradouro")
    val logradouro: String,

    @Json(name = "uf")
    val uf: String,

    @Json(name = "unidade")
    val unidade: String
)