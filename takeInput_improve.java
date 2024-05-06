import java.util.Scanner;

public class takeInput_improve {
    //improved complexity
    public static Node<Integer>takeInput(){
        Scanner sc=new Scanner(Sysyem.in);
        int data=sc.nextInt();
        Node<Integer>head=null;
        Node<Integer>tail=null;
        while(data!=null){
            Node<Integer>Curr=new Node<Integer>(data);
            if(head==null)
            {
                head=curr;
                tail=curr;
            }else{
                tail.next=curr;
                tail=curr;
            }
            data=sc.nextInt();
        }
        return head;
    }
}
