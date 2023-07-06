package madels

class User {
    var id:Int?=null
    var userName:String?=null
    var ismi:String?=null
    var  paroli:String?=null

    constructor()
    constructor(id: Int?, userName: String?, ismi: String?, paroli: String?) {
        this.id = id
        this.userName = userName
        this.ismi = ismi
        this.paroli = paroli
    }

    override fun toString(): String {
        return "User(userName=$userName, ismi=$ismi, paroli=$paroli)"
    }


}