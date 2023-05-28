package com.company;

import java.util.*;

public class Session19 {

    Stack<Integer> stacknew = new Stack<>();
    Stack<Integer> stackSampleA= new Stack<>();
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        Session19 session19 = new Session19();
        session19.stackExample();
    }

    public Stack<Integer> stackExample(){

        //FILO- First in last out
        Stack<Integer> stackSample= new Stack<>();

        stackSample.add(22);
        stackSample.add(55);
        stackSample.add(1000);
        stackSample.add(1);

        System.out.println("stackSample : "+ stackSample);
        System.out.println("Enter the values in stack thorugh push");

        for(int i =0; i<4;i++) {
            stackSample.push(scan.nextInt());
        }

        System.out.println("Here value after the values pushed: " + stackSample);

        System.out.println("PEEK: "+stackSample.peek());
       stackSample.pop();

        System.out.println("Here value after the values POP: " + stackSample);

        stackSample.remove(0);
        System.out.println("Here value after the values remove: " + stackSample);

        return stackSample;
    }

    public void sortStack(){

      //  List<Integer> listToStoreStack= new ArrayList<>();
       // listToStoreStack = Collections.sort(stackExample());
        Collections.sort(stackExample());
        System.out.println("Here value after the values remove: " + stacknew);

    }


}
