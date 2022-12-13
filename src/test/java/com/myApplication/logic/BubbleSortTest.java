package com.myApplication.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @DisplayName("버블 소트 - 리스트를 넣으면 정렬된 결과를 보여준다.")
    @Test
    void given_List_WHenExecuting_ThenReturnSortedList(){
        //Given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(11);
        list.add(7);

        //When&Then
        System.out.println(bubbleSort.sort(list));
    }
}