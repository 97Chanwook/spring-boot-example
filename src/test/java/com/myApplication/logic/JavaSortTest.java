package com.myApplication.logic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {
    @Test
    void test(){
        JavaSort<Integer> javaSort = new JavaSort<>();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(11);
        list.add(7);
        
        //When&Then
        System.out.println(javaSort.sort(list));
    }
}