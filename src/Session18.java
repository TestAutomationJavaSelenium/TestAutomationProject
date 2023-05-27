import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Session18 {

    List<Integer> intList = new ArrayList<>();
    List<String> stringList = new ArrayList<>();

    public static void main(String[] args) {
        Session18 session18 = new Session18();
        session18.sortList();

    }

    public void sortList() {
        //System.out.println("List element are: "+addElementsInList(intList));
        Collections.sort(addIntegerElementsInList(intList));
        System.out.println("Sorted List element are: " + intList);
        Collections.sort(intList, Collections.reverseOrder());
        System.out.println("Reverse Sorted List element are: " + intList);
        System.out.println("Value Container = " + intList.contains(45));

        Collections.sort(addStringElementsInList(stringList));
        System.out.println("Sorted List element are: " + stringList);
        Collections.sort(stringList, Collections.reverseOrder());
        System.out.println("Reverse Sorted List element are: " + stringList);
        System.out.println("Value Container = " + stringList.contains("Bharat"));


    }

    public List<Integer> addIntegerElementsInList(List<Integer> gaurav) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter size of list");

        int size = sc.nextInt();

        System.out.println("Please enter list item");
        for (int i = 0; i < size; i++) {
            gaurav.add(sc.nextInt());
        }

        return gaurav;

    }

    public List<String> addStringElementsInList(List<String> manisha) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter size of list");

        int size = sc.nextInt();

        System.out.println("Please enter list item");
        for (int i = 0; i < size; i++) {
            manisha.add(sc.next());
        }

        return manisha;

    }


}
