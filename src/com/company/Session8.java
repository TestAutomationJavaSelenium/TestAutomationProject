package com.company;

import java.util.Scanner;

public class Session8 {
    public static void main(String[] args){
        Session8 callNotStatic=new Session8();
        //System.out.println("result is " +callNotStatic.largestUsingNested());
        //System.out.println("result is " +callNotStatic.largestUsinsgElseifLadder());
        //callNotStatic.forLoop();
        callNotStatic.swtCase();
        //callNotStatic.runProg();
        //callNotStatic.starForLoop();
        //callNotStatic.fibonaci();
    }

    public void runProg(){
        String str="";
        Scanner sf=new Scanner(System.in);
        System.out.println("please enter Y to run and N to close program");
        str=sf.next();
        if(str.equals("Y")) {
            swtCase();
        }
        else if (str.equals("N")) {
            return;
                   }
        else {
            System.out.println("enter valid value");
            runProg();
    }
    }

    public void swtCase(){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter case value");
        int st= sc.nextInt();


        switch (st){
            case 1:
                System.out.println(largestUsingNested());
                runProg();
                break;
            case 2:
                System.out.println(largestUsingElseifLadder());
                runProg();
                break;
            case 3:
                forLoop();
                runProg();
                break;
            case 4:
                forReverseLoop();
                runProg();
                break;
            case 5:
                nestedForLoop();
                break;
            case 6:
                starForLoop();
                break;
            case 7:
                fibonaci();
                break;

            default:
                System.out.println("enter valid value");
                swtCase();

        }

    }

    public int largestUsingNested(){
        int a,b,c,largest=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("pls enter a value ");
        a= scan.nextInt();
        System.out.println("enter b value");
        b=scan.nextInt();
        System.out.println("enter c value");
        c=scan.nextInt();

        if(a>b){
            if(a>c){
                largest =a;
                //System.out.println("a is greater "+a);
            }
        }
        if(b>a){
            if(b>c){
                largest=b;
            }
        }
        if(c>a){
            if(c>b){
                largest=c;
            }
        }

        return largest;

    }

    public int largestUsingElseifLadder(){
        int a,b,c,largest=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("pls enter a value ");
        a= scan.nextInt();
        System.out.println("enter b value");
        b=scan.nextInt();
        System.out.println("enter c value");
        c=scan.nextInt();

        if (a>b && a>c){
            largest=a;
        }
        else if (b>c) {
            largest=c;
        }
        else{
            largest=c;
        }
        return largest;
    }

    public void forLoop(){

        for (int i=0;i<=10;i++){
            System.out.println(i);
        }
    }
    public void forReverseLoop(){

        for (int i=10;i>=1;i--){
            System.out.println(i);
        }
    }

    public void nestedForLoop(){
        for(int i=1;i<5;i++){
            System.out.println("i= "+i);
            for (int j=1;j<5;j++){
                System.out.print("j= "+j);
            }
            System.out.println("");
        }
    }

    public void starForLoop(){
        for(int i=1;i<=5;i++){
            //System.out.println("i= "+i);
            for (int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void fibonaci(){
        // 0 1 1 2 3 5 8 13 21 34
        // 0 1 1 2 3 5 8 13
        int i=0; //1 1 2 3 5
        int j=1; //1 2 3 5 8
        System.out.print(i +" "+ j);
        int series;
        for(int a=0;a<=100;a++){

            series = i+j;
            System.out.print("  "+series);
            i=j;
            j=series;

            }

        }
    }


