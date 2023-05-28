import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Session18LinkList {

    static LinkedList<Integer> intLinkList = new LinkedList<>();
    static LinkedList<Integer> intLinkListCopy = new LinkedList<>();

    LinkedList<String> strLinkList = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

    Vector<Integer> vectorSample = new Vector<>();

    Vector<String> vectorStringSample = new Vector<>();

    public static void main(String[] args) {
        Session18LinkList session18LinkList = new Session18LinkList();
        //session18LinkList.sortLinkList(intLinkList);
        // session18LinkList.vectorExample();
        session18LinkList.sortVector();

    }

    public void sortLinkList(LinkedList<Integer> test) {
        System.out.println(addElementInLinkList(test));
        Collections.sort(test);
        System.out.println("sorted linklist " + test);
        Collections.sort(test, Collections.reverseOrder());
        System.out.println("reverse sort" + test);
        intLinkListCopy.addAll(test);
        System.out.println("copy linklist" + intLinkListCopy);
        intLinkListCopy.add(1, 27);
        intLinkListCopy.add(0, 29);

        System.out.println("new copy link list" + intLinkListCopy);

        intLinkListCopy.addLast(100);

        System.out.println("last added element in linklist " + intLinkListCopy);

        intLinkListCopy.addFirst(1000);

        System.out.println("First added element in linklist " + intLinkListCopy);

        intLinkListCopy.removeFirst();
        System.out.println("remove first element from linklist " + intLinkListCopy);

        intLinkListCopy.removeLast();
        System.out.println("remove last element from linklist " + intLinkListCopy);

        intLinkListCopy.removeFirstOccurrence(4);
        System.out.println("remove element from linklist" + intLinkListCopy);

        intLinkListCopy.removeLastOccurrence(4);
        System.out.println("remove last element from linklist" + intLinkListCopy);

        intLinkListCopy.clear();
        System.out.println("clear linklist " + intLinkListCopy.isEmpty());


    }

    public LinkedList<Integer> addElementInLinkList(LinkedList<Integer> gaurav1) {
        System.out.println("please enter size");
        int size = sc.nextInt();
        System.out.println("Please add element in LinkList");
        for (int i = 0; i < size; i++) {
            gaurav1.add(sc.nextInt());
        }
        return gaurav1;

    }


    //vector is list only, it gives fast processing but at the time of large transactions it impact and sometimes gets failed
    public void vectorExample() {

        int i = 0;

        vectorSample.add(22);
        vectorSample.add(220);
        vectorSample.add(44);
        vectorSample.add(2);

        System.out.println("Please enter the values which you want to add: ");
        do {
            vectorSample.add(sc.nextInt());
            i++;
        }
        while (i <= 5);

        System.out.println("Here is your vector values : " + vectorSample);

        vectorSample.addElement(99);
        vectorSample.addElement(199);
        vectorSample.addElement(299);

        System.out.println("vectorSample after  the add element: " + vectorSample);

        vectorSample.add(1, 100);
        vectorSample.insertElementAt(10000, 0);
        System.out.println("added element At indexes" + vectorSample);
        vectorSample.remove(0);
        vectorSample.remove(0);
        System.out.println("After remove from vector: " + vectorSample);
    }


    public Vector<String> VectorStringExample(Vector<String> manisha) {


        System.out.println("Please enter your String values below : ");
        int j = 0;
        do {
            manisha.add(sc.next());

            j++;
        }
        while (j < 4);

        return manisha;

    }

    public void sortVector() {

        Collections.sort(VectorStringExample(vectorStringSample));

        System.out.println("vectorStringSample: " + vectorStringSample);
    }


}
