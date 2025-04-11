package com.example.data_impl.network.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NewsUpdatesNetwork(
    val items: List<Long>? = null,
    val profiles: List<String>? = null
)
