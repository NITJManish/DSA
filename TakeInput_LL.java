import java.util.Scanner;

public class TakeInput_LL {
    //take input O(n^2)
    public static Node<Integer>takeInput(){
        Scanner sc=new Scanner(System.in);
        Node<Integer>head=null;
        int data=sc.nextInt();
        while(data!=-1){
            Node<Integer>currentNode=new Node<>(data)
            if(head==null){
                head=currentNode;
            }else{
                Node<Integer>tail=head;
                while(tail.next!=null){
                    tail=tail.next;
                }
                tail.next=currentNode;
            }
            data=sc.nextInt();
        }
        return head;
    }
}
