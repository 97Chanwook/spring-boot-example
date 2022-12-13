package com.myApplication;

import com.myApplication.logic.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        BubbleSort<String> sort = new BubbleSort<>();

        System.out.println("Result : "+sort.sort(Arrays.asList(args)));
    }
}