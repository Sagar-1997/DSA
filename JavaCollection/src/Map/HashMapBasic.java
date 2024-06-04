package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasic {
    public static void main(String[] args) {
        //no order- no indexing
        //stores values -- key-value pair
        //key can not be duplicate
        //can store n number of null values but only one null key
        //key should be unique
        // not thread safe
        HashMap<String,String> captialMap = new HashMap<String,String>();
        captialMap.put("India", "New Delhi");
        captialMap.put("USA", "Washington DC");
        captialMap.put("UK", "London");
        captialMap.put("UK", "London1");
        captialMap.put(null, "Berlin");
        captialMap.put(null, "LA");
        captialMap.put("Russia", null);
        captialMap.put("France", null);
        System.out.println(captialMap.get("USA"));
        System.out.println(captialMap.get("UK"));
        System.out.println(captialMap.get(null));
        System.out.println(captialMap.get("Russia"));

        System.out.println("-------------------");
         //Traverse
        Iterator<String> it=captialMap.keySet().iterator();
        while(it.hasNext())
        {
            String key=it.next();
            String value=captialMap.get(key);
            System.out.println("Key==> "+key+" "+"Values==> "+value);
        }
        System.out.println("-------------------");
        Iterator<Entry<String,String>> it1=captialMap.entrySet().iterator();
        while(it1.hasNext())
        {
            Entry<String,String> entry=it1.next();
            System.out.println("Key = "+entry.getKey()+" and value = "+entry.getValue());
        }
        System.out.println("------------------- using for loop");
        for(Entry<String,String> entry:captialMap.entrySet())
        {
            System.out.println("Key = "+entry.getKey()+" and value = "+entry.getValue());
        }
        System.out.println("------------------------- using java stream");
        captialMap.forEach((k,v)->System.out.println("Key = "+k+" and value = "+v));
    }
}
