import java.util.*;

public class Session21Set {

    List<Integer> list=new ArrayList<>();
    List<String> list1=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    HashSet<Integer> hashSet1=new HashSet<>();
    HashSet<String> hashSet2=new HashSet<>();
    public static void main(String[] args){
        Session21Set session21Set=new Session21Set();
        //session21Set.hashSet();
        //session21Set.dynamicHashSet();
        //session21Set.hashSetToArray();
        //session21Set.addNullToHashset();
        //session21Set.linkedHashSet();
        session21Set.treeSetExample();

    }
// Collection: List ,LinkedList,Vector,Stack,Queue(Priority Queue and Deque)
    public void hashSet(){
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("gaurav");
        hashSet.add("manisha");
        hashSet.add("jassi");
        hashSet.add("bharat");
        hashSet.add("gaurav");
        hashSet.add("gaurav");
        hashSet.add("jassi");
        hashSet.add("jassi");

        //output in unordered way and remove duplicate
        System.out.println(hashSet);

        hashSet.remove("jassi");
        System.out.println(hashSet);
        System.out.println(hashSet.isEmpty());
        //Collections.sort(hashSet);
        //list.addAll(hashSet);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        //Collections.sort(hashSet,Collections.reverseOrder());

    }
    public void dynamicHashSet(){;
        System.out.println("please enter size");
        int size=sc.nextInt();
        System.out.println("Please enter element in HashSet");
        for(int i=0;i<size;i++){
            hashSet1.add(sc.nextInt());
        }
        list.addAll(hashSet1);
        Integer[] intArray=new Integer[size];
        for(int j=0;j<list.size();j++){
            intArray[j]=list.get(j);
        }
        for(int k=0;k<intArray.length;k++){
            System.out.println(intArray[k]);
        }

//        Arrays.sort(intArray);
//        System.out.println(intArray);
        System.out.println(intArray.length);


    }

    public void hashSetToArray(){;
        System.out.println("please enter size");
        int size=sc.nextInt();
        System.out.println("Please enter element in HashSet");
        for(int i=0;i<size;i++){
            hashSet1.add(sc.nextInt());
        }
        Integer[] intArray=new Integer[size];
//        for(int j=0;j<hashSet1.size();j++){
//            intArray[j]=hashSet1
//        }
        System.out.println(hashSet1.toArray());
//        for(int k=0;k<intArray.length;k++){
//            System.out.println(intArray[k]);
//        }

//        Arrays.sort(intArray);
//        System.out.println(intArray);
        System.out.println(intArray.length);


    }

    public void addNullToHashset(){
        hashSet2.add("a");
        hashSet2.add("ere");
        hashSet2.add("b");
        hashSet2.add("ff");
        hashSet2.add(null);
        hashSet2.add(null);
        System.out.println(hashSet2);
    }

    public void linkedHashSet(){
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
        LinkedHashSet<String> linkedHashSet1=new LinkedHashSet<>();
        linkedHashSet.add(4);
        linkedHashSet.add(14);
        linkedHashSet.add(42);
        linkedHashSet.add(4);
        linkedHashSet.add(42);
        linkedHashSet.add(47);
        linkedHashSet.add(11);
        System.out.println(linkedHashSet);

        linkedHashSet1.add("manisha");
        linkedHashSet1.add("apple");
        linkedHashSet1.add("gaurav");
        linkedHashSet1.add("jassi");
        linkedHashSet1.add("zebra");
        linkedHashSet1.add("bharat");
        linkedHashSet1.add("manisha");
        //linkedHashSet1.add(null);
        System.out.println(linkedHashSet1);
        list1.addAll(linkedHashSet1);
        Collections.sort(list1);
        System.out.println(list1);
    }

    public void treeSetExample(){
        // not accept null value
        //work as binary search
        // it provides sorted set

        TreeSet<Integer> integerTreeSet=new TreeSet<>();
        TreeSet<String> stringTreeSet=new TreeSet<>();
        integerTreeSet.add(34);
        integerTreeSet.add(134);
        integerTreeSet.add(34);
        integerTreeSet.add(340);
        integerTreeSet.add(3);
        integerTreeSet.add(4);
        System.out.println(integerTreeSet);

        stringTreeSet.add("gaurav");
        stringTreeSet.add("manisha");
        stringTreeSet.add("apple");
        stringTreeSet.add("bharat");
        stringTreeSet.add("gaurav");
        //stringTreeSet.add(null);
        System.out.println(stringTreeSet);

//        for( int i=0;i<stringTreeSet.size();i++){
//            System.out.println(stringTreeSet);
//        }
        System.out.println("Poll element "+stringTreeSet.pollFirst());
        System.out.println(stringTreeSet);
        System.out.println("Poll element "+stringTreeSet.pollLast());
        System.out.println(stringTreeSet);
        stringTreeSet.add("jassi");
        System.out.println("current head"+stringTreeSet.headSet("bharat",true));
        System.out.println(stringTreeSet);

        //subset
        //System.out.println(stringTreeSet.subSet("gaurav",true,"jassi",true));
        //System.out.println(stringTreeSet.subSet("bharat","jassi"));
        //tailset,descending set
        System.out.println(stringTreeSet.tailSet("gaurav"));
        System.out.println(stringTreeSet);
        System.out.println(stringTreeSet.descendingSet());

    }

}
