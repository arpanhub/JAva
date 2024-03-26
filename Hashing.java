// import java.util.HashSet;
// import java.util.Iterator;

/* public class Hashing 
{
        public static void main(String[] args) 
        {
            HashSet<Integer> set= new HashSet<>();
            set.add(2);
            set.add(0);
            set.add(1);
            set.add(3);
            if(set.contains(0))
                System.out.println("yes ");
            if(!set.contains(4))
                System.out.println("no ");
            System.out.println(set);
            Iterator it=set.iterator();
            while(it.hasNext())
            {
                System.out.print(it.next()+" ");
            }
        }
} */
import java.util.*;
public class Hashing{
    public static void main(String[] args) {
        HashMap <Integer,String> map = new HashMap <> ();
        map.put(1,"arpan");
        map.put(2,"aryush");
        map.put(3,"sameer");
        /* System.out.println(map);
        map.put("Arpan",0);
        System.out.println(map);
        if(map.containsKey("arpan"))
            System.out.println("present");
        else
            System.out.println( "not present");
        System.out.println(map.get("ayush"));
        System.out.println(map.get("sameer")); */
       

       /* for(Map.Entry<String,Integer> e : map.entrySet())
       {
        System.out.println(e.getKey()+"=>"+e.getValue());
        // System.out.println(e);
       }
       for(String key : map.keySet()){
        System.out.println(key+"=>" +map.get(key));
       } */
       Set<Integer> set=map.keySet();
       for(Integer keys : set)
       {
           System.out.println(keys+"="+map.get(keys));
       }
        map.remove( 2);
        set.remove(3);
       System.out.println(map);
       System.out.println(set);
    }
}

