package com.barmge.paging3withunsplash.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class SearchResult (
    @SerialName("result")
    val image: List<UnsplashImage>
)