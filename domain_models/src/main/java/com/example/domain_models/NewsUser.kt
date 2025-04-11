package com.example.domain_models

data class NewsUser(
    val id: String,
    val delay: Int? = null,
    val created: Long? = null,
    val karma: Int? = null,
    val about: String? = null,
    val submitted: List<Long>? = null
)