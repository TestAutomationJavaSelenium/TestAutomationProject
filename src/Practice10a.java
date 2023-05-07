import java.util.Scanner;

public class Practice10a {

    static int[] globalArray1;
    static int[] globalArray2;
    static int[] globalArray3;

    public static void main(String[] args){

        Practice10a practice10a=new Practice10a();
        practice10a.arrayPrinter();

    }

    public int[] arrayProvidingMethod1(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter length of array1");
        int arrayLength=scanner.nextInt();
        globalArray1= new int[arrayLength];
        System.out.println("enter value of globalarray1");
        for(int i=0;i<globalArray1.length;i++){
            globalArray1[i]= scanner.nextInt();
        }
        return globalArray1;
    }
    public int[] arrayProvidingMethod2(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter length of array2");
        int arrayLength=scanner.nextInt();
        globalArray2= new int[arrayLength];
        System.out.println("enter value of globalarray2");
        for(int i=0;i<globalArray2.length;i++){
            globalArray2[i]= scanner.nextInt();
        }
        return globalArray2;
    }

    public int[] arrayProvidingMethod3(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter length of array3");
        int arrayLength=scanner.nextInt();
        globalArray3= new int[arrayLength];
        System.out.println("enter value of globalarray3");
        for(int i=0;i<globalArray3.length;i++){
            globalArray3[i]= scanner.nextInt();
        }
        return globalArray3;
    }

    public void arrayPrinter(){
        int[] catchArray1=arrayProvidingMethod1();
        int[] catchArray2=arrayProvidingMethod2();
        int[] catchArray3=arrayProvidingMethod3();

        arrayParameterMethod(catchArray1,catchArray2,catchArray3);
    }

    public void arrayParameterMethod(int[] arrayParameter1,int[] arrayParameter2,int[] arrayParameter3){
        System.out.println("Passed values in array are");

        for(int i: arrayParameter1){
            System.out.println("first array values: "+i);
        }
        for(int i: arrayParameter2){
            System.out.println("second array values: "+i);
        }
        for(int i: arrayParameter3){
            System.out.println("third arrays values: " +i);
        }
    }
}
