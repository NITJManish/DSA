public static void increment(Node<Integer> head){
    Node<Integer> temp = head;
    while(temp != null){
        temp.data++;
        temp = temp.next;
    }
}
