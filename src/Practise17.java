import javax.script.ScriptContext;
import java.util.*;

public class Practise17 {

    public static void main(String[] args){

        Practise17 practise17=new Practise17();
        //practise17.listLearn();
        //practise17.listScanner();
        practise17.listWithArray();

    }

    public void listLearn(){
        List<Integer> list = new ArrayList<>();
        list.add(32);
        list.add(42);
        list.add(12);
        list.add(11);

        System.out.println(list);
    }

    public void listScanner(){
        Scanner sc=new Scanner(System.in);
        List<Integer> list1=new ArrayList<>();
        for(int i=0;i<5;i++){
            list1.add(sc.nextInt());
        }
        System.out.println(list1);
    }

    public void listWithArray(){
        int[] a=new int[5];
        Scanner sc=new Scanner(System.in);
        List<Integer> list3=new ArrayList<>();
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            list3.add(a[i]);

        }
        System.out.println(Arrays.toString(a));
        System.out.println(list3);

        Collections.sort(list3);
        System.out.println("sorted list: "+list3);

        list3.remove(list3.size()-3);
        list3.remove(list3.size()-1);
        System.out.println("list after remove "+list3);

        if(list3.isEmpty() == false){
            list3.removeAll(list3);
            System.out.println(list3);
        }

        list3.add(500);
        


    }
}
