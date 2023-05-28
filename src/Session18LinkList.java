import java.util.*;
import java.util.Vector.*;

public class Session18LinkList {

    static LinkedList<Integer> intLinkList = new LinkedList<>();
    static LinkedList<Integer> intLinkListCopy = new LinkedList<>();

    LinkedList<String> strLinkList = new LinkedList<>();

    List<Integer> listDataFromVector = new ArrayList<>();  //gaurav
    Vector<Integer> vectorTakingElement = new Vector<>();

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Session18LinkList session18LinkList = new Session18LinkList();
        //session18LinkList.sortLinkList(intLinkList);
        session18LinkList.sortVectorList();

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

    public Vector<Integer> vectorPassingToList(Vector<Integer> jass) {
        int j = 0;
        do {
            jass.add(sc.nextInt());
            j++;
        }
        while (j < 4);
        System.out.println("Please eneter vector element" + jass);
        return jass;

    }

    public void sortVectorList() {

        listDataFromVector = vectorPassingToList(vectorTakingElement);
        Collections.sort(listDataFromVector);
        System.out.println(listDataFromVector);
    }


}
