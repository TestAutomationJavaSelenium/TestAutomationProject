import java.util.Scanner;

public class Sesion15 {

    public static void main(String[] args){
        Sesion15 sesion15=new Sesion15();
        sesion15.switchCase();

    }

    public void switchCase(){

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("you have selected first option");
                break;
            case 2:
                System.out.println("you have selected second option");
                break;
            default:
                System.out.println("invalid value");
                switchCase();
        }





    }
}
