import madels.Server
import java.util.Scanner

fun main(args: Array<String>) {
    val input=Scanner(System.`in`)
    println("1 - ro'yhatdan o'tish,  2 - kirish")
    val server=Server()

    while (true){
        when(input.nextInt()){
            1->{
                server.add()
            }
            2->{
                server.read()
            }
            3->{
                server.postAdd()
            }
            4->{
                server.showPost()
            }
        }
    }
}