import java.util.*;

public class Session17 {

    public static void main(String[] args) {
        Session17 session17 = new Session17();
        //   session17.listLearn1();
        //session17.runtimeInList();

        //session17.listWithArray();
        session17.stringInList();
    }

    public void listLearn1() {

        //  int[] arr= new int[5];
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(2);

        Scanner scanner = new Scanner(System.in);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {

            System.out.println("Element of list at index : " + i + " : " + list.get(i));
        }

        System.out.println("Enter the value you want to add in the list: ");
        for(int i=0;i<=10;i++){

            list.add(scanner.nextInt());

        }

        System.out.println("Here is your list now: "+ list);

    }

    public void runtimeInList(){

        List<Integer> list2 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value you want to add in the list: ");
        for(int i=0;i<=10;i++){

            list2.add(scanner.nextInt());

        }

        System.out.println("Here is your list now: "+ list2);

    }


    public void listWithArray(){

        int[] arr= new int[5];

        List<Integer> list3 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values to add in array: ");
        for(int i=0; i <5;i++) {
            arr[i] = scanner.nextInt();
            list3.add(arr[i]);
        }

        System.out.println("Here is your array :  "+ Arrays.toString(arr));
        System.out.println("Here is your list data : "+ list3);

        Collections.sort(list3);

        System.out.println("Here is your list data in sorted way : "+ list3);

        list3.remove(list3.size()-1);
        list3.remove(list3.size()-2);
        list3.remove(list3.size()-3);

        System.out.println("After value removed:  "+ list3);


        System.out.println("Empty check  "+ list3.isEmpty());
        list3.removeAll(list3);
        System.out.println("Empty check  "+ list3.isEmpty());

        System.out.println("Please enter the value of size");
        int sizeOf = scanner.nextInt();
        System.out.println(addInList(list3,sizeOf));


        List<Integer> copiedList = new ArrayList<>();
        copiedList.addAll(addInList(list3,sizeOf));
        copiedList.add(500);

        System.out.println(copiedList);

    }

    public List<Integer>  addInList(List<Integer> list4, int size){

        Scanner scanner = new Scanner(System.in);
        //List<Integer> list4 = new ArrayList<>();
        for(int i=0;i<size;i++){
            list4.add(scanner.nextInt());
        }
        return list4;
    }

    public void stringInList(){

        List<String> listOfString = new ArrayList<>();
        listOfString.add("pink");
        listOfString.add("Orange");
        listOfString.add("green");
        listOfString.add("Golden");

        System.out.println("Here is your listOfString:  "+listOfString);

    }


}
