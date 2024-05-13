public class LinkedListBasic {
    public static Node<Integer>createNode(){
        Node<Integer>n1=new Node<Integer>(10);
        Node<Integer>n2=new Node<Integer>(20);
        Node<Integer>n3=new Node<Integer>(30);
        n1.next=n2;
        n2.next=n3;
    }
    public static void main(String args[]){
        Node<Integer>n1=new Node<Integer>(10);
        System.out.print(n1);
        System.out.print(n1.next);
        System.out.print(n1.data);

    }
}
