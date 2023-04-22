
import java.util.*;
public class maping{
public static void main(String[] args) {
    HashMap<String,Integer>map=new HashMap<>();

    //Adding 
    map.put("apple",2000);
    map.put("kiwi",3000);
    map.put("chikku",26000);
    map.put("cake",10000);

    System.out.println(map);

    map.put("cake",10900);//if key already exists it will update the corresponding key value
     
    //check key exists or not
    if(map.containsKey("apple"))
    {
        System.out.println("pair exist");
    }
    else System.out.println("pair does not exist");
    System.out.println();


    //check value exists or not
    if(map.containsValue(10000))
    {
        System.out.println("value exist");
    }
    else System.out.println("value does not exist");
    System.err.println();


    //gets the value of the key,return value if exists 
    //else returns null
    System.out.println(map.get("apple"));
    System.out.println();
    System.out.println(map.get("ice"));

    //iteration in HashMap
    for(Map.Entry<String,Integer>e:map.entrySet())
    {
        System.out.println(e.getKey()+" ");
        System.out.println(e.getValue()+" ");
    }

}
}
