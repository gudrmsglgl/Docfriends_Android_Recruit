package com.docfriends.domain.test.factory

import com.docfriends.domain.model.Consult
import com.docfriends.domain.model.PageMap
import com.docfriends.domain.model.Tag
import com.docfriends.domain.model.TotalConsult

object TotalConsultFactory {

    fun createTotalConsult() = TotalConsult(
        pageMap = pageMap(),
        expertListPosition = 3,
        companyListPosition = 3,
        consultList = consultList(),
        expertList = emptyList(),
        companyList = emptyList()
    )

    private fun pageMap() = PageMap(
        pageNumber = 1,
        rowPerPage = 10,
        pageCount = 1,
        totalCount = 10
    )

    private fun consultList() = listOf(
        Consult(
            seq = 1,
            title = "편도결석이 자꾸 나와요~ 이비인후과 가서 가끔씩 제거하는데 예방법이나, 안나오게 할수 없을까요?(대구 수성구 범어동 30대후반/여 편도결석",
            context = "편도 결석이 꽤 큰게 가끔 나옵니다.\\n이비인후과 가서 그때 그때 석션(?) 이용해서 제거하고 있기는한데,\\n자꾸 나오니까 불편해요.\\n\\n다른 방법이 없을까요? 수술은 무섭고...",
            regDate = 1_622_186_998_000,
            answerCnt = 3,
            tagList = listOf(Tag(1, "입냄새"), Tag(2, "편도결석"), Tag(3, "편도선"))
        ),
        Consult(
            seq = 2,
            title = "낙상사고 환자 재활치료 과정은 어떻게 되나요? (서울 50대중반/남 재활치료)",
            context = "안녕하세요.\\n재활요양병원에서 낙상사고 재활은 어떤 과정으로 이루어지는지 궁금하여 질문 드렸습니다.\\n아버지가 작업을 하시다가 낙상사고를 당하셨습니다.\\n안전장비를 잘 해서 다행히 심한 골절은 없는데 불편함을 호소하셔서 바로 입원을 했습니다.\\n보통 이 정도 통증이 있는 환자라면 재활요양병원에서 어떤 치료들이 이루어지는지요.",
            regDate = 1_622_179_798_000,
            answerCnt = 2,
            tagList = listOf(Tag(4, "서울재활요양병원"), Tag(5, "재활요양병원"), Tag(6, "낙상사고재활"))
        ),
        Consult(
            seq = 3,
            title = "손가락에 수포가 올라오는데 한포진 증상이 맞나요?(신촌 40대중반/여 한포진)",
            context = "손가락 수포가 많이 올라오고 간지럽습니다.\\n한포진증상이 맞는지\\n그렇다면 치료는 어떻게 해야하는지도 궁금합니다.",
            regDate = 1_622_168_998_000,
            answerCnt = 1,
            tagList = listOf(Tag(6, "손가락한포"), Tag(7, "한포진피부과"))
        )
    )


}