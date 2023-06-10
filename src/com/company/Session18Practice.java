package com.company;

import java.util.*;

public class Session18Practice {
    public static void main(String[] args) {

        Session18Practice session18Practice = new Session18Practice();
        //session18Practice.sort();
        session18Practice.stackPract();
    }

    public void sort() {
        List<Integer> list1 = new ArrayList<>();
        list1 = testEverything(list1);
        Collections.sort(list1);
        System.out.println(list1);

    }

    public List<Integer> testEverything(List<Integer> combList) {
        List<Integer> lst = new ArrayList<>();
        LinkedList<Integer> linklst = new LinkedList<>();
        Vector<Integer> vec = new Vector<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter length");
        int leng = sc.nextInt();
        System.out.println("enter element in list");
        for (int i = 0; i < leng; i++) {
            lst.add(sc.nextInt());
        }
        System.out.println("list= " + lst);

        System.out.println("enter element in LinkedList");
        for (int j = 0; j < leng; j++) {
            linklst.add(sc.nextInt());
        }
        System.out.println("Linkedlist= " + linklst);

        System.out.println("enter element in Vector");
        for (int k = 0; k < leng; k++) {
            vec.addElement(sc.nextInt());
        }
        System.out.println("Vector= " + vec);
        //combList.addAll(lst,linklst,vec));
        combList.addAll(lst);
        combList.addAll(linklst);
        combList.addAll(vec);
        return combList;


    }

    public void stackPract(){
        Stack<Integer> st=new Stack<>();
        Scanner sc1=new Scanner(System.in);
        for (int i=0;i<4;i++){
            st.add(sc1.nextInt());
        }
        System.out.println("stack= "+st);
        st.remove(1);
        System.out.println(st);
    }
}

//
//    Collection<CommonType> combinedCollection = new ArrayList<>();
//    List<String> list = new ArrayList<>();
//    Set<Integer> set = new HashSet<>();
//    Queue<Double> queue = new LinkedList<>();
