import java.util.Arrays;

public class Arraysorting {
    public static void main(String[] args){
        Arraysorting arraysorting=new Arraysorting();
        //arraysorting.arraySort();
        //arraysorting.arraySortUsingMethod();
        sort1();

    }

    public void arraySort(){
        int[] a={4,76,3,56,34,56,76,1};

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++) {
                int aa = 0;
                if (a[i] > a[j]) {
                    aa = a[i];
                    a[i] = a[j];
                    a[j] = aa;
                }
            }
            System.out.println(a[i]);
        }

    }

    public void arraySortUsingMethod(){
        int[] a={23,45,32,1,4,9,33,12};
        Arrays.sort(a);
        for(int i:a){
            System.out.println(i);
        }
    }

    public static void sort1(){
        int[] rt={54,2,546,3,5,24};
        Arrays.sort(rt);
        for(int i:rt){
            System.out.println(i);
        }
    }
}
