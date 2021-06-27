data class LinkedListNode(
    var data:Int,
    var next: LinkedListNode? = null
)


fun createLinkedList(data: Int):LinkedListNode {
    return LinkedListNode(data)
}

fun printLinkedList(node: LinkedListNode) {
    var temp = node
    while (temp.next!=null){
        print("${temp.data}=>")
        temp = temp.next!!
    }
}

fun sizeOf(node: LinkedListNode):Int {
    var i =0
    var temp = node
    while (temp.next!=null){
        i++
        temp = temp.next!!
    }
    return i
}

fun main() {
    val linkedList = createLinkedList(10)
    linkedList.next = createLinkedList(11)
    linkedList.next!!.next= createLinkedList(12)
    linkedList.next!!.next?.next = createLinkedList(13)
    linkedList.next!!.next?.next?.next =  createLinkedList(14)
    println("size of list =>"+sizeOf(linkedList))
    printLinkedList(linkedList)
}