package Stream;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Stream {

    public static void main(String[] args) {
        List<Person> li = new ArrayList<>();
        li.add(new Person("Vishal", "Bhalla"));
        li.add(new Person("Aman", "Kohli"));
        li.add(new Person("Raman", "Dhiman"));
        li.add(new Person("Sanya", "Gupta"));

      //  li.stream().filter((s)->s.getLastName().startsWith("B")).forEach(System.out::println);

     //   li.stream().dropWhile((x)->x.getLastName().startsWith("B")).forEach(System.out::println);

     // Boolean v =  li.stream().allMatch(x->x.getLastName().contains("a"));

      //  System.out.println(v);

//        li.stream().filter(s -> s.getLastName().startsWith("B")).collect(Collectors.toList()).stream().forEach(System.out::println);
//
//        List<String> a =  new ArrayList<>();
//
//        a.add("Vishal");
//        a.add("Bhalla");
//        a.add("Spring");
//
//      StringBuilder str =   a.stream().collect(StringBuilder::new, (x,y) -> x.append(" ").append(y), (q,b)->q.append(" ").append(b));
//
//        System.out.println(str);

       // Collections.sort(li, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

      //  li.stream().forEach(System.out::println);


        HashMap<Integer,String> map = new HashMap<>();


        map.put(2,"Two");
        map.put(3,"Three");
        map.put(1,"One");


       // map.entrySet().stream().filter(z -> z.getKey().equals(2)).forEach(System.out::println);

//        Map.Entry<Integer,String> en = map.entrySet();

//        for(Map.Entry<Integer,String> a : map.entrySet()){
//
//        }
//
//        for (Person d:li){
//            System.out.println(d.getName());
//            li.add(new Person("Carls","Berg"));
//        }
//        CopyOnWriteArrayList<Person> lis = new CopyOnWriteArrayList<Person>();
//        lis.add(new Person("Vishal", "Bhalla"));
//        lis.add(new Person("Aman", "Kohli"));
//        lis.add(new Person("Raman", "Dhiman"));
//        lis.add(new Person("Sanya", "Gupta"));
//
//        for(Person d:lis){
//            System.out.println(d.getName());
//            lis.add(new Person("just","add"));
//        }

        ListIterator<Person> i = li.listIterator();

        while (i.hasNext()){
            System.out.println(i.next().getName());
            i.set(new Person("empty", "em"));
        }


      //  Queue<Integer> q = new LinkedList<>();

//        for (Person d:li){
//            System.out.println(d.getName());
//        }

        ConcurrentHashMap<Integer, String> c = new ConcurrentHashMap<>();

        c.put(2,"Two");
        c.put(3,"Three");
        c.put(1,"One");

        for (Map.Entry<Integer, String> q : c.entrySet()){
            q.getKey();
            c.put(4,"Four");
        }


        for (Map.Entry<Integer, String> q : c.entrySet()){
            System.out.println(q.getValue());

        }


    }
}
