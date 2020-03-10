package com.poo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List lista = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++){
            if(i % 2 == 0){
                int[] arr = new int[i];
                System.out.println("Pares: " + i );
            }else{
                lista.add(i);
            }
        }
        Iterator iterator = lista.iterator();
        while(iterator.hasNext()){
            System.out.println("Impares: " + iterator.next() + " ");
        }
    }
}
