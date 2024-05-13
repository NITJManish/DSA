public class delete {
    public static Node<Integer>deleteNode(Node<Integer>head,int pos){
        if(head==null){
            return head;
        }
        if(pos==0){
            return head.next;
        }
        Node<Integer>curr=head;
        for(int i=0;i<pos-1 && curr!=null;i++){
            current=current.next;
        }
        if(curr==null && current.next==null){
            return head;
        }
        Node<Integer>temp=current.next;
        curr.next=temp.next;
        temp=null;
        return head;
    }
}
