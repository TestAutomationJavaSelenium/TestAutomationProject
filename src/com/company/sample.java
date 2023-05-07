package com.company;
import java.util.Scanner;
public class sample {

    public static void main(String[] arg)
    {
//        int a=1;
//        int b=2;
//        System.out.println(a+b);
//        Scanner ss= new Scanner(System.in);
//        int a = ss.nextInt();
//        float b =ss.nextFloat();
//        System.out.println(a+b);
        for(int i=0;i<=10;i++)
        {
            for(int j=10;j>=i;j--){
                System.out.print(" ");
            }
            for(int t=0;t<=i;t++){
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }
}
