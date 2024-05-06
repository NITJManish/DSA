public interface PrintIthNode_LL {
    public static void printIthNode(Node<Integer> head,int i){
        int position=0;
        Node<Integer> temp = head;
        while(temp != null && position<i){
            temp = temp.next;
            position++;
        }
        if(temp!=null){
            System.out.println(temp.data);
        }
    }
}
