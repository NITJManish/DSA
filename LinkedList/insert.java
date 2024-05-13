public class insert {
    public static Node<Integer>insert(Node<Integer>head,int pos,int data){
        int currpos=0;
        Node<Integer>newNode=new Node<Integer>();
        if(heap==null)
        {
            newNode.next=head;
            head=newNode;
            return head;
        }
        Node<Integer>temp=head;
        while(temp!=null && currpos<(pos-1)){
            temp=temp.next;
            currpos++;
        }
        if(temp==null){
            return head;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        return head;
    }
    
}
