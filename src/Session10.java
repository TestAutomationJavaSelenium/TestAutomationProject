import java.util.Scanner;

public class Session10 {

    public static void main(String[] args){
        Session10 session10=new Session10();
        //session10.intArrayReturnInMethod();
        //session10.arrayReturnTypeMethodCalling();
        //session10.methodUsingArrayAsParameter();
        //session10.characterTypeArray();
        session10.stringTypeArray();

    }

    public int[] intArrayReturnInMethod(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter size of Array : ");
        int arrayLength=scanner.nextInt();

        int[] integerArray=new int[arrayLength];

        System.out.println("please enter array values: ");
        for(int i=0;i<=integerArray.length-1;i++){
            integerArray[i]=scanner.nextInt();
            }

        for(int i:integerArray){
           // System.out.println(""+i);

            System.out.println("array values displayed using for loop i variable:"+i);
        }

        for(int i=0;i<=integerArray.length-1;i++){
            System.out.println("array values are: "+integerArray[i]);
        }
        return integerArray;

    }

    public void arrayReturnTypeMethodCalling(){

        //intArrayReturnInMethod();

        //int[] integerTypeArrayTwo=new int[intArrayReturnInMethod().length];
        int[] integerTypeArrayThree=intArrayReturnInMethod();

        for(int i=0;i<=integerTypeArrayThree.length-1;i++) {

            System.out.println("printing intArrayReturnInMethod() array " + integerTypeArrayThree[i]);
        }
        int small=integerTypeArrayThree[0];

        for(int i=1;i<=integerTypeArrayThree.length-1;i++) {

            if(small>integerTypeArrayThree[i]) //
            {
                small=integerTypeArrayThree[i];
            }
            }
        System.out.println("smallest no is: "+small);
    }


    public void methodUsingArrayAsParameter(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter array length");
        int arrayLength = scanner.nextInt();

        int[] integerArray = new int[arrayLength];

        System.out.println("please enter array values: ");
        for (int i = 0; i <= integerArray.length - 1; i++) {
            integerArray[i] = scanner.nextInt();
        }
        arrayPassesInMethod(integerArray);
    }

    public void arrayPassesInMethod(int[] arrayFour) {

        for (int i : arrayFour) {
            // System.out.println(""+i);

            System.out.println("arrayPassesInMethod(int[] arrayFour):  " + i);
        }

        for (int i = 0; i <= arrayFour.length - 1; i++) {
            System.out.println("arrayPassesInMethod(int[] arrayFour) using for loop:  " + arrayFour[i]);
        }
    }


    public void characterTypeArray(){
        char[] charlenght={'a','d','s','r','a'};
        for (int i=0;i<=charlenght.length-1;i++){
            System.out.println("print value of char array:" +charlenght[i]);
        }

    }

    public void stringTypeArray(){
        String str="gaurav";
        char[] charlenght=str.toCharArray();
        for (int i=0;i<=charlenght.length-1;i++){
            System.out.println("print value of char array:" +charlenght[i]);
        }

    }


}
