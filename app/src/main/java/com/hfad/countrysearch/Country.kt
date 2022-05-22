package com.hfad.countrysearch

data class Country (
    val name: String,
    val capital: String,
    val population: Long,
    val area: Long,
    val languages: List<Languages>,
    val flag: String
        )

data class Languages(val name: String)