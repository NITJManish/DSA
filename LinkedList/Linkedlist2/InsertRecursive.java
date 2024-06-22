//insert element in linkedlist using recursion

package Linkedlist2;

public class InsertRecursive {
   public static Node<Integer> Insert(Node<Integer> head,int elem,int pos){
    if(head==null && pos>0)
        if(pos==0){
            Node<Integer>newNode=new Node<>(elem);
            newNode.next=head;
            return head;
        }
        else{
            head.next=Insert(head.next,elem,pos-1);
            return head;
        }
    }
    public static void main(String args[]){
        Node<Integer>head=takeInput();
        head=Insert(head,20,2);
        print(head);
    }
}
