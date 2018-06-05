package com.gj.test;
public class Test {
    public static void main(String []args){
        System.out.println("the first test");
        int []a = {1,2,1,32,1,2,34,5,61};
        Tools.quickSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            System.out.println("shahahahah");
        }
    }
}
