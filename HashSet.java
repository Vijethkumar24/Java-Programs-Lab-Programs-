import java.util.HashSet;
import java.util.Iterator;

public class HelloWorld {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<Integer>(); //Creating HashSet which does not contains any repeating value or element 
        
         
        
        
        set.add(1); //Adding element to HashSet
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2); //Set already contains element 2 So this will not be added to the HashSet
        
        System.out.println(set); //Print all elemens in the HashSet
        

        
        set.remove(1); //Removing element to HashSet
        
        System.out.println(set);//To print Set
        
        
        if(set.contains(2)) //To check whether HashSet contains given Element
        {
             System.out.println("set contains 2");
        }
         Iterator iter = set.iterator(); //To iter each elemet in HashSet.Creating an iter object
        
         while (iter.hasNext()) //Iter will by default map to null  ie.NULL-->2-->3-->4 ( NOTE: Order of elements will be unordered in HashSet ).This is used to check whether it has next element in HashSet
            System.out.print(iter.next() + " "); //To display each HashSet element
            
    }
}
