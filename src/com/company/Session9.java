package com.company;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Session9 {

    public static void main(String[] args){

        Session9 ss=new Session9();
        //ss.whileLoop();
        //ss.doWhileLoop();
        //ss.intTypeArray();
        //ss.intDynamicArrayRunTime();
        //ss.arrayWithForLoop();
        ss.arrayWithLargestUsingSort();

    }

    public void whileLoop(){

        int i=1;
        while (i<=10){

            //System.out.println(i);
            if(i%2==0){
                i++;
                continue;
            }
            else if (i%7==0) {
                i=i-1;
                break;
            }
            else {
                System.out.println(i);
            }

            i++;
        }

    }

    public void doWhileLoop(){
       int i=1;
        do{
            if(i%5==0){
                i++;
                continue;
            }
            if(i%9==0){
                break;
            }
            System.out.println(i);
            i++;
        }while (i<=10);
    }

    public void intTypeArray(){
        int[] a= {1,2,3,4,5};
        // a[0]=1
        //a[1]=2
        //a[2]=3
        //a[3]=4
        //a[4]=5
        //Array size= upper bound - lower bound +1  [4-0+1]
        System.out.println("size of int array a is "+ a.length);
        System.out.println("size of int array a is "+ (a.length-1));
        System.out.println("size of int array a is "+ (a.length-5));
        System.out.println("size of int array a is "+ (a.length-6));

        System.out.println("=============== ");

        System.out.println("value of int type array at index 5= "+a[a.length-1]);
        System.out.println("value of int type array at index 5= "+a[a.length-5]);
        //System.out.println("value of int type array at index 5= "+a[a.length-6]); // ArrayIndex out of bound
        //System.out.println("value of int type array at index 5= "+a[a.length+5]);

        try{
            System.out.println("value of int type array at index 5= "+a[a.length]);
        }

        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){

            System.out.println("please check ur code for index");
        }


    }

    public void intDynamicArrayRunTime(){
//        int[] a={11,22,33,44,25};
//        for(int i=0;i<=a.length-1;i++){
//            System.out.println(a[i]);
//        }
//
//        int[] a1=new int[2];
//        a1[0]=34;
//        a1[1]=23;
//
//        for(int i=0;i<=a1.length-1;i++){
//            System.out.println("int type array "+a[i]);
//        }

        int[] a2=new int[5];
        try {

            System.out.println("please enter value of array a2");
            Scanner sc = new Scanner(System.in);
            a2[0] = sc.nextInt();
            a2[1] = sc.nextInt();
            a2[3] = sc.nextInt();
            a2[4] = sc.nextInt();
            a2[2] = sc.nextInt();
        }
        catch(InputMismatchException inputMismatchException){
            System.out.println("enter valid input");
            //intDynamicArrayRunTime();
        }

        for(int i=0;i<=a2.length-1;i++){
            System.out.println("int type array "+a2[i]);
        }


    }

    private void arrayWithForLoop(){
        int[] a4=new int[5];
        System.out.println("enter a4 value");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=a4.length-1;i++){
            a4[i]=sc.nextInt();
        }
        for(int i=0;i<=a4.length-1;i++){
            System.out.println("values are" + a4[i]);
        }
    }


    private void arrayWithLargestUsingSort(){
        int[] a4=new int[5];
        System.out.println("enter a4 value");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=a4.length-1;i++){
            a4[i]=sc.nextInt();
        }
        int e=a4[0];
        for(int i=0;i<=a4.length-1;i++){
            if(e>a4[i]){
                e=a4[i];
            }

        }
        System.out.println("largest/smallest values are " + e);
    }





}
