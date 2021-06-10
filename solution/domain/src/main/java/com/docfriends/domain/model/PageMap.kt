package com.docfriends.domain.model

data class PageMap(
    val pageNumber: Int,
    val rowPerPage: Int,
    val pageCount: Int,
    val totalCount: Int
)