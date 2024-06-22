package Linkedlist2;



/*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/

public class deleteRecursive {


	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
    	//Your code goes here
        LinkedListNode<Integer> temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        if(pos>=count)
            return head;
        if(pos==0)
           return head.next;
        else
        {
           LinkedListNode<Integer> ptr=deleteNodeRec(head.next,pos-1);
            head.next=ptr;
        }
        return head;
	}

}