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
            ),
            Consult(
                    seq = 4,
                    title = "노인재활병원에서 언어치료와 보행치료 도움이 될까요? (압구정 70대초반/남 파킨슨병)",
                    context = "아버지께서 초기 파킨슨병 진단을 받으셔서 노인재활병원을 알아보고 있는 중입니다\\n말씀하시는데 불편함이 있고 발이 끌려 걷는 것도 쉽진 않은 상태입니다\\n그래서 노인재활병원 통원이든 입원이든 치료를 받으려고 하는데 언어치료 보행치료 다 진행하나요?\\n재활 꾸준히 하면 다들 좋아진다고 하는데 노인재활병원에서 치료 받으면 얼마나 좋아질 수 있을까요?",
                    regDate = 1_622_118_598_000,
                    answerCnt = 1,
                    tagList = listOf(Tag(8, "노인재활병원"))
            ),
            Consult(
                    seq = 5,
                    title = "수면다원검사 받아보는 것이 좋을까요? 병원가서 검사 받아볼까해요..",
                    context = "수면에 문제가 생긴 것 같은데 수면다원검사 받아보는 것이 좋을지 싶어서요….\\n잠을 자고 일어나도 하루종일 피곤해서 수면다원검사 생각해보게 되었어요.\\nTV보는데 몸에 뭘 많이 붙이고 수면다원검사 하더라고요..\\n해보고싶기도 하고요…\\n비용은 건강보험 되어서 10만원 정도라고 하는데 실비까지 되면 수면다원검사 해보는게\\n손해는 아니다 생각은 들어요… 비용 걱정은 없을 것 같고…\\n하루종일 피곤한 문제도 수면다원검사병원 가서 수면다원검사 받아보면\\n어떤 문제가 있는지 알고 치료까지 받아볼 수 있는거죠?\\n피곤함에서 벗어나고 싶은 마음 뿐이예요….",
                    regDate = 1_622_118_058_000,
                    answerCnt = 2,
                    tagList = listOf(Tag(9, "수면다원검사"), Tag(10, "수면다원검사병원"), Tag(11, "수면다원검사비용"), Tag(12, "수면검사"), Tag(13, "수면장애"))
            ),
            Consult(
                    seq = 6,
                    title = "턱에 멍울이 생겼다가 없어졌다가를 반복합니다. (대구시 범어동 30대중반/남 턱멍울)",
                    context = "아래턱뼈의 위아래에 멍울이 생긴적이 있습니다.\\n전에 내과 약 먹고 나았었습니다.\\n그런데 자꾸 반복하는 것 같습니다.\\n며칠전에는 턱 아래쪽에 멍울이 생겼고 만지면 아프기도 합니다.\\n어떻게 해야하지요?",
                    regDate = 1_622_031_658_000,
                    answerCnt = 2,
                    tagList = listOf(Tag(14, "임파선염"))
            ),
            Consult(
                    seq = 7,
                    title = "눈수술로 커질 수 있는 눈크기, 집에서 확인할 수 있나요? (안양 20대후반/남 눈크기)",
                    context = "사람마다 수술로 커질 수 있는 눈의 크기가 있다고 하던데요.\\n집에서 확인해 볼 수 있는 방법은 없나요? 대충 확인해 보고 싶어서요.",
                    regDate = 1_621_945_258_000,
                    answerCnt = 2,
                    tagList = listOf(Tag(15, "눈커지는방법"), Tag(16, "눈크기키우기"), Tag(17, "쌍꺼풀수술"))
            ),
            Consult(
                    seq = 8,
                    title = "코성형 가격문의",
                    context = "콧볼크고 전체적으로 낮은데 얼마정도 될까요? 그리고 부분모델 신청하면 몇프로 할인되나오ㅡ?",
                    regDate = 1_621_984_858_000,
                    answerCnt = 1,
                    tagList = listOf(Tag(18, "성형외과"))
            ),
            Consult(
                    seq = 9,
                    title = "안검하수 없이 삼백안 있는 눈 교정가능한가요?(의정부 20대중반/남 삼백안)",
                    context = "안검하수는 아닌데 삼백안이 있는 눈입니다.\\n어떤 수술을 해야 삼백안이 없어질까요?\\n쌍수나 눈매교정 이런거로 가능할런지요.\\n혹시 쌍수나 눈매교정 같은걸 했을 때 삼백안이 더 심해질 수도 있을까 걱정됩니다.",
                    regDate = 1_621_983_958_000,
                    answerCnt = 2,
                    tagList = listOf(Tag(19, "눈매교정"), Tag(20, "삼백안"), Tag(21, "안검하수"))
            ),
            Consult(
                    seq = 10,
                    title = "콧대만 자연스럽게 조금 올리고싶어요(부산 서면 20대초반/여 코성형)",
                    context = "제 코가 콧대가 낮고 조금 들려있는 코인데 콧대만 자연스럽게 조금 올리고싶어요 낮은코 수술비용은 얼마인가요?",
                    regDate = 1_621_836_358_000,
                    answerCnt = 2,
                    tagList = emptyList()
            )
    )


}