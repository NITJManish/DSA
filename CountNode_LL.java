public class CountNode_LL {
    public static void CountNode(Node<Integer> head){
        int len=0;
        Node<Integer> temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
    }
}
