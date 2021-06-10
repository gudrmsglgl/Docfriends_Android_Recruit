package com.docfriends.domain.model

data class Expert(
    val name: String,
    val typeName: String,
    val companyName: String,
    val profileImgPath: String,
    val tagList: List<Tag>
)
