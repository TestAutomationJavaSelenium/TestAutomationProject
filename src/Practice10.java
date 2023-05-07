import java.util.Scanner;

public class Practice10 {

    static int[] globalArray1;

    public static void main(String[] args){

        Practice10 practice10=new Practice10();
        practice10.arrayPrinter();

    }

    public int[] arrayProvidingMethod(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter length of array");
        int arrayLength=scanner.nextInt();
        globalArray1= new int[arrayLength];
        System.out.println("enter value of array");
        for(int i=0;i<globalArray1.length;i++){
            globalArray1[i]= scanner.nextInt();
            }
        return globalArray1;
    }

    public void arrayPrinter(){
        int[] catchArray=arrayProvidingMethod();
        arrayParameterMethod(catchArray);
    }

    public void arrayParameterMethod(int[] arrayParameter){
        System.out.println("entered values in array are");
        for(int i: arrayParameter){
            System.out.println(i);
        }
    }
}
