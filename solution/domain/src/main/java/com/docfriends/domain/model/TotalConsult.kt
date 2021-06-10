package com.docfriends.domain.model

data class TotalConsult(
    val pageMap: PageMap,
    val expertListPosition: Int,
    val companyListPosition: Int,
    val consultList: List<Consult>,
    val expertList: List<Expert>,
    val companyList: List<Company>
)