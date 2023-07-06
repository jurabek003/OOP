package madels

import java.util.Scanner

class Server:Servis {
    val input=Scanner(System.`in`)
    val list=ArrayList<User>()
    val listData=ArrayList<UserData>()

    override fun add() {
        var id=0
        println("ismingizni kiriting")
        val ismi=input.next()
        println("parol kiriting")
        val login=input.next()
        println("userName kiriting")
        val userName=input.next()
        val user=User(id,userName,ismi,login)
        list.add(user)
        id++
        println("3 - post qo'shish  4 - postlarni ko'rish  5 - like ko'rish  x - qaytish")
    }

    override fun read(): ArrayList<User> {
        for (i in 0 until list.size){
            println( "$i  ${list[i]}")
        }
        return list
    }

    override fun postAdd() {
            println("title")
            val title = input.next()
            println("post")
            val post = input.next()
        val userData=UserData(post,title,0)
        listData.add(userData)
        println("3 - post qo'shish  4 - postlarini ko'rish  5 - like bosish   x - orqaga")

    }
    override fun selectItem(id: Int) {
        println(list[id])
        println("6 - post larini ko'rish  7 - likelarini ko'rish  8 - like bosish   x - orqaga")
    }

    override fun showPost() {

        for (i in 0 until  listData.size){
            if (list[i].id == 0  )
            println("$i - ${listData[i]}")
        }
    }

}