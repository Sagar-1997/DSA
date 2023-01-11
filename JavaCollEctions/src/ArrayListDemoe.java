import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class ArrayListDemoe {
    public static void main(String[] args) {
        //default java class
        //dynamic array
        ArrayList<Integer> ar=new ArrayList<Integer>();
        //ArrayList<Integer> ar=new ArrayList<Integer>(100);
        ar.add(100);
        ar.add(100);
        ar.add(100);
        ar.add(null);
        ar.add(100);
        System.out.println(ar.size());
        System.out.println(ar);
        System.out.println(ar.contains(100));
        ar.set(2, 200);
        System.out.println(ar);
        //Traverse ArrayList
        //typical for loop
        for(int i=0;i<ar.size();i++)
        {
            System.out.println(ar.get(i));
        }
        System.out.println("-----------------");
        
        //Advance for loop
        for(Integer a:ar)
        {
            System.out.println(a);
        }

        System.out.println("---------------------");
        //JDK 8 stream
        ar.stream().forEach(System.out::println);

        System.out.println("-------------------");
        Iterator<Integer> it=ar.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //List with other collection
        ArrayList<Integer> ar1=new ArrayList<Integer>(Arrays.asList(10,20,30));
        System.out.println(ar1);
        ArrayList<String> arr1=new ArrayList<String>();
        arr1.add("java");
        arr1.add("python");
        arr1.add("ruby");
        arr1.add("javascript");
        ArrayList<String> arr2=new ArrayList<String>();
        arr2.add("Testing");
        arr2.add("dev ops");
        // arr1.addAll(arr2);
        // System.out.println(arr1);
        // arr1.addAll(2, arr2);
        // System.out.println(arr1);

        // arr1.clear();
        // System.out.println(arr1);
        ArrayList<String>cloneList=(ArrayList<String>)arr1.clone();
        System.out.println("Clone List ==>"+cloneList);
        System.out.println(cloneList.contains("java"));
        System.out.println(cloneList.indexOf("java"));
        System.out.println(cloneList.lastIndexOf("java"));
        arr1.remove("ruby");
        System.out.println("After remove ==>"+arr1);
        ArrayList<Integer> numbers= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        numbers.removeIf(l->l%2==0);
        System.out.println(numbers);
        ArrayList<String> names= new ArrayList<>(Arrays.asList("Naveen","Tom","Peter","Steve","Lisa","Tom"));
        names.retainAll(Arrays.asList("Tom"));
        System.out.println(names);
        ArrayList<String> names1= new ArrayList<>(Arrays.asList("Naveen","Tom","Peter","Steve","Lisa","Tom"));
        ArrayList<String> sublit=new ArrayList<String>(names1.subList(0, 2));
        System.out.println(sublit);
        Object []a=numbers.toArray();
        for(Object i:a)
        {
            System.out.println(i);
        }
        names1.sort(Comparator.comparing(l->l.toString().length()>5));
        System.out.println(names1);
        List<String> namesList= Collections.synchronizedList(new ArrayList<String>());
        namesList.add("Java");
        namesList.add("Python");
        namesList.add("Ruby");
        //add and remove we don't need explicit synchronization
        //to fetch/traverse we need explicit synchronization
        synchronized(namesList)
        {
            Iterator<String> it1=namesList.iterator();
            while(it1.hasNext())
            {
                System.out.println(it1.next());
            }
        }
     //2. copyOnWriteArrayList -- its a class
     CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
     empList.add("Tom");
     empList.add("Steve");
     empList.add("Naveen");
     //no explicit synchronization
     System.out.println(empList);
     
     ArrayList<Integer> num= new ArrayList<>(Arrays.asList(1,2,3,2,2,3,1,4,5,6,1,7,8,9,7));
     LinkedHashSet<Integer> lhs = new LinkedHashSet<>(num);
     ArrayList<Integer> num1=new ArrayList<>(lhs);
     System.out.println(num1);
     num.stream().distinct().forEach(System.out::println);
    }
}
