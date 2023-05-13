import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

// Session 16 Exceptional handling remaining
public class Session16 {

    public static void main(String[] args) {

        Session16 session16 = new Session16();
        //session16.exceptionMethod();
        //session16.tryInCatch();
        //session16.stringNullExceptionHandling();
        //session16.numberFormatException();
        session16.nullPointerExceptionString();

    }

    public void exceptionMethod() {

        Scanner scanner = new Scanner(System.in);


        int a = 50;
        int b;
        int c;
        try {
            b = scanner.nextInt();
            c = a / b;
            System.out.println("value of C " + c);
        } catch (InputMismatchException | ArithmeticException inputMismatchException) {
            System.out.println("please enter integer value only :" + inputMismatchException);
            exceptionMethod();
        }

    }

    public void tryInCatch() {

        Scanner scanner = new Scanner(System.in);


        int a = 50;
        int b;
        int c;
        try {
            b = scanner.nextInt();
            c = a / b;
            System.out.println("value of C " + c);
        }
        //catch (InputMismatchException|ArithmeticException inputMismatchException) {
        catch (Exception e) {
            System.out.println("please enter integer value only :" + e);
            //tryInCatch();
            int[] array = new int[5];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[j]);
            }
            System.out.println("please search the element in array with index value");
            int index = scanner.nextInt();
            try {
                System.out.println(array[index]);
            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                System.out.println("Index value is greater than array value");
                System.out.println("please re-enter index value");
                index = scanner.nextInt();
                System.out.println(array[index]);
            }

        }

    }

    public void stringNullExceptionHandling() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter name");
        String str = scanner.next();
        System.out.println("enter value of char index u want to search");
        int indexValue = scanner.nextInt();
        try {
            char ch = str.charAt(indexValue);
        } catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
            System.out.println("index value is large");
            stringNullExceptionHandling();
        }
    }

    public void numberFormatException() {
        try {

            int m = Integer.parseInt("manisha");
            int h = Integer.parseInt("manisha1234354");
            System.out.println(m);
            System.out.println(h);
            int g = Integer.parseInt("1234556");
            System.out.println("value of g is: " + g);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("number format exception");
        } finally {
            int g = Integer.parseInt("1234556");
            System.out.println("value of g is: " + g);
        }


    }

    public void nullPointerExceptionString() {
        String str = null;
        try {
            int a = str.length();
            System.out.println("lenght is " + a);
        } catch (NullPointerException nullPointerException) {
            System.out.println("value of string should not be null");
        }
        String str1 = " ";
        int b = str1.length();
        System.out.println("lenght is " + b);


    }

}
