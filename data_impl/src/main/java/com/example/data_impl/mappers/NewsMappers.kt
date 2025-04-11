package com.example.data_impl.mappers

import com.example.data_impl.network.models.NewsItemNetwork
import com.example.data_impl.network.models.NewsUpdatesNetwork
import com.example.data_impl.network.models.NewsUserNetwork
import com.example.domain_models.NewsItem
import com.example.domain_models.NewsUpdates
import com.example.domain_models.NewsUser


fun NewsItemNetwork.toDomain() = NewsItem(
    id = id,
    deleted = deleted ?: false,
    type = type ?: "",
    by = by ?: "",
    time = time ?: 0,
    text = text ?: "",
    dead = dead ?: false,
    parent = parent ?: 0,
    poll = poll ?: 0,
    kids = kids ?: emptyList(),
    url = url ?: "",
    score = score ?: 0,
    title = title ?: "",
    parts = parts ?: emptyList(),
    descendants = descendants ?: 0
)

fun NewsUpdatesNetwork.toDomain() = NewsUpdates(
    items = items ?: emptyList(),
    profiles = profiles ?: emptyList()
)

fun NewsUserNetwork.toDomain() = NewsUser(
    id = id,
    delay = delay ?: 0,
    created = created ?: 0,
    karma = karma ?: 0,
    about = about ?: "",
    submitted = submitted ?: emptyList()
)
