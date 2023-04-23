public class LL{
    Node Head;
    class Node{
        String Data;
        Node next;
        Node(String Data)
        {
            this.Data=Data;
            this.next=null;
        }
    }


//add -First
public void addFirst(String Data)
{
    Node newNode=new Node(Data);
    if(Head==null)
    {
      Head=newNode;
      return;
    }
    newNode.next=Head;
    Head=newNode;
}

//add -Last
public void addLast(String Data)
{
    Node newNode=new Node(Data);
    Node CurrNode=Head;
    if(Head==null)
    {
        Head=newNode;
        return;
    }
   
    while(CurrNode.next!=null)
    {
        CurrNode=CurrNode.next;
    }
    CurrNode.next=newNode;
    
}

//print
public void printList(){
    if(Head==null)
    {
        System.out.println("list is empty");
        return;
    }
    Node CurrNode=Head;
    while(CurrNode!=null)
    {
        System.out.print(CurrNode.Data+"->");
        CurrNode=CurrNode.next;
    }
    System.out.println("null");
}

//delete
public void deleteFirst(){
   
    if(Head==null)
    {
        System.out.println("list is empty");
    }
    Head=Head.next;
}
public void deleteLast(){
    if(Head==null)
    {
        System.out.println("list is empty");
    }
    if(Head.next==null)
    {
        Head=null;
        return;
    }
    Node SecondLast=Head;
    Node LastNode=Head.next;
    while(LastNode.next!=null)
    {
        LastNode=LastNode.next;
        SecondLast=SecondLast.next;
    }
    SecondLast.next=null;
}
public static void main(String[] args) {
    LL list=new LL();
    list.addFirst("hi");
    list.addLast("hello");
    list.printList();
    list.addLast("what's up!");
    list.printList();
    list.deleteLast();
    list.printList();
}


}
