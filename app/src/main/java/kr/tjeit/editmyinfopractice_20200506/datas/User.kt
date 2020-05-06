package kr.tjeit.editmyinfopractice_20200506.datas

import org.json.JSONObject
import java.util.*

class User {

    companion object {
        fun getUserFromJsonObject(json: JSONObject) : User {
            val parsedUser = User()
            parsedUser.id = json.getInt("id")
            parsedUser.loginId = json.getString("login_id")
            parsedUser.name = json.getString("name")
            parsedUser.phoneNum = json.getString("phone")
            parsedUser.memo = json.getString("memo")

            parsedUser.category = Category.getCategoryFromJson(json.getJSONObject("category"))

//            parsedUser.createdAt.set()

            return parsedUser
        }
    }

    var id = 0
    var loginId = ""
    var name = ""
    var phoneNum = ""
    var memo = ""


//    val 만들어도 괜찮아. 유저가입 일시 알기 위해 생성.
//    Calendar()는 private로 막혀있다!~ getInstance붙여줘야 돼
    var createdAt = Calendar.getInstance()  //서버에서 날짜데이터 그냥 string으로 받아옴..
    var category = Category()

}