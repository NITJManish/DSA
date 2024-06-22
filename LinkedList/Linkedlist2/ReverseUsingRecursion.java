//reverse linked list using recursion
void fun(Node head){
    if(head==null){
        return;
    }
    fun(head.next);
    System.out.println(head.data);
}