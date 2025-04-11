package com.example.data_impl.network.models

import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class NewsUserNetwork(
    val id: String,
    val delay: Int? = null,
    val created: Long? = null,
    val karma: Int? = null,
    val about: String? = null,
    val submitted: List<Long>? = null
)