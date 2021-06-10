package com.docfriends.domain.model

data class Consult(
    val seq: Int,
    val title: String,
    val context: String,
    val regDate: Long,
    val answerCnt: Int,
    val tagList: List<Tag>
)