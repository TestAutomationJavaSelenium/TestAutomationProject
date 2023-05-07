import java.util.Scanner;

public class Gaurav {

    static int a,b,c;
    static String str;

    public static void main(String[] args){

        Scanner scanObject= new Scanner(System.in);
        System.out.println("enter value of global variable a");
        a=scanObject.nextInt();
        System.out.println("enter value of global variable b");
        b=scanObject.nextInt();
        System.out.println("enter value of global variable c");
        c=scanObject.nextInt();

        System.out.println("value of sum is " + sum());
        System.out.println("value of minus is " + minus1());
        System.out.println("greater value is " + comparison());
        System.out.println("greater value is " + comparisonThreeElements());

        int switchVariable;
        System.out.println("enter value of switch variable ");
        switchVariable = scanObject.nextInt();

        switch (switchVariable){
            case 1:
                System.out.println("You are in Switch case sum Test case");
                System.out.println("value of sum is " + sum());
                break;
            case 2:
                System.out.println("You are in Switch case 2 - minus1 Test case");
                System.out.println("value of minus is " + minus1());
                break;
            case 3:
                System.out.println("U r in Switch case 3- comparison Test case");
                System.out.println("greater value is " + comparison());
                break;
            case 4:
                System.out.println("U r in Switch case 4- comparisonThreeElements Test case");
                System.out.println("greater value is " + comparisonThreeElements());
                break;
            default:
                System.out.println("You are in default");

        }
        switchMethod();
        switchMethodUsingString();

    }

    public static int sum(){

        int sum=a+b+c;
        return sum;

    }

    public static int minus1(){

        int minus=b+c-a;
        return minus;

    }
    public static int comparison(){
        int z;

        if(a>b){
            System.out.println("value of a is greater" + a);
            z=a;
        }
        else {
            System.out.println(" value of b is greater" + b);
            z=b;
        }
        return z;

    }
    public static int comparisonThreeElements(){
        int z=0;

        if(a>b){
            if(a>c) {
                System.out.println("value of a is greater" + a);
                z = a;
            }
        }

        if(b>a){
            if(b>c) {
                System.out.println("value of a is greater" + b);
                z =b;
            }
        }

        if(c>b){
            if(c>a) {
                System.out.println("value of a is greater" + c);
                z = c;
            }
        }


        return z;

    }

    public static void switchMethod(){

        Scanner ss= new Scanner(System.in);
        int swt;
        System.out.println(" U r in Switch method");
        System.out.println("enter swt value");
        swt=ss.nextInt();


        switch (swt){
            case 1:
                System.out.println("enter case 1");
                System.out.println(sum());
                switchMethod();
                break;
            case 2:
                System.out.println("enter case 2");
                System.out.println(minus1());
                break;
            case 3:
                System.out.println("enter case 3");
                System.out.println(comparison());
                break;
            case 4:
                System.out.println("enter case 4");
                System.out.println(comparisonThreeElements());
                break;
            default:
                System.out.println("default");
                switchMethod();
        }



    }

    public static void switchMethodUsingString() {

        Scanner ss = new Scanner(System.in);
        String str1;
        System.out.println(" U r in switchMethodUsingString");
        System.out.println("enter swt value");
        str1 = ss.next();


        switch (str1) {
            case "SumMethod":
                System.out.println("enter case 1");
                System.out.println(sum());
                switchMethodUsingString();
                break;
            case "MinusMethod":
                System.out.println("enter case 2");
                System.out.println(minus1());
                break;
            case "ComparisonMethod":
                System.out.println("enter case 3");
                System.out.println(comparison());
                break;
            case "ComparisonThreeElement":
                System.out.println("enter case 4");
                System.out.println(comparisonThreeElements());
                break;
            default:
                System.out.println("default");
                switchMethodUsingString();
        }
    }
}






