package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        boolean hasil=false;
        ArrayList<Integer> list= new ArrayList<>(
                Arrays.asList(10,1,2)
        );
        ArrayList<Integer> jumlah= new ArrayList<>();
        for (Integer element : list) {
            if(!jumlah.contains(element)){
                jumlah.add(element);
                hasil=false;
            }
            else{
                hasil=true;
            }
        }
        System.out.println(hasil);
    }
}
