import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionHandling {


    public static void main(String[] args){
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        exceptionHandling.exceptionHandling();
        //exceptionHandling.recursionInCatchBlock();
    }

    public void exceptionHandling(){
        //to handle runtime error- exception

        //filenotfound,classnotfound,arrayoutofBound,arithmetic,IOexception,sqlexception,nullpointere
        //nosuchelement,staleElement

        //throwable-exception & error

        //insert into manishaTable (username, name, emailID, phonenumber) values ('xyz', 'abc', 'mai@gmail.com', 987765433); //noexception
        //insert into manishaTable (username, name, emailID, phonenumber) values ('xyz', 'abc', 'mai@gmail.com'); //exception
        //insert into manishaTable (username, name, emailID, phonenumber) values ('', 'abc', 'mai@gmail.com', 987765433); //exception
        //insert into manishaTable (username, name, emailID, phonenumber) values ('xyz', abc, 'mai@gmail.com', 987765433); //exception
        //insert into manishaTable (username, name, emailID, phonenumber) values (); //exception

        System.out.println("Manisha NOT going to Noida");

        int a= 25;
        try{

            int b = 25/0;
            System.out.println("value of b= "+b);


        }
        catch(Exception exception){
            System.out.println("Exception code catch" + exception);
            System.out.println("Manisha going to Noida");
        }


        int c;int d=50;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the value of c: ");
        c=scanner.nextInt();

        try{
            int e= 50/c;
            System.out.println("You are inside the try block .. ");
            System.out.println("Value of e = "+ e);

        }
        catch (ArithmeticException arithmeticException){

            System.out.println("You are in the catch block : "+ arithmeticException);
            System.out.println("Please enter value of c greater than zero");
        }



        /*try{

        }
        catch (SQLException sqlException){

        }*/
        try{
            String s1= null;
            String s2= "Manisha";
            String s3 = s1;
        }
        catch (NullPointerException nullPointerException){

        }

    }

    public void recursionInCatchBlock(){

        int e;int f=50;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the value of e: ");


        try{
            e=scanner.nextInt();
            int g= 50/e;
            System.out.println("You are inside the try block .. ");
            System.out.println("Value of g = "+ g);

        }
        //
        catch (ArithmeticException | InputMismatchException arithmeticException){
            // catch (Exception arithmeticException){

            System.out.println("You are in the catch block : "+ arithmeticException);
            System.out.println("Please enter value of e greater than zero");
            System.out.println("Please try again");
            recursionInCatchBlock();
           /* try {
                recursionInCatchBlock();
            }
            catch(InputMismatchException inputMismatchException){
                System.out.println("You are in the catch block : "+ inputMismatchException);
                System.out.println(" You entered DOt (.) only that is not valid");
                System.out.println("Please try again");
                recursionInCatchBlock();
            }*/

        }
    }
}
