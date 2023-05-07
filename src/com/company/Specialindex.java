package com.company;

import java.util.Scanner;

public class Specialindex {
    static String str;
    static char[] ch;

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter ur name");
        str=sc.next();
        callMethod();
    }
    private static int indexForChar(){

            Scanner sc=new Scanner(System.in);
            System.out.println("please enter index to be returned");
            int index=sc.nextInt();
            return index;
    }

    public static void callMethod(){
        ch =str.toCharArray();
        try {
            int y = indexForChar();
            printIndexValue(y);
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("please enter correct value of index");
            callMethod();
        }

    }
    public static void printIndexValue(int aa){

        System.out.println("char value is:"+ ch[aa]);

    }
}
