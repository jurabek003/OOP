package madels

import javax.print.attribute.standard.QueuedJobCount

interface Servis {
    fun add()
    fun read():ArrayList<User>
    fun postAdd()
    fun selectItem(id:Int)
    fun showPost()


}