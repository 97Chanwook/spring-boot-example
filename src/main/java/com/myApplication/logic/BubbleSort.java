package com.myApplication.logic;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort <T extends Comparable<T>> {
    //Bubble Sort
    public List<T> sort(List<T> list){
        List<T> output = new ArrayList<>(list);

        for(int i=0; i<output.size(); i++){
            for (int j=0; j<i; j++){
                if (output.get(j).compareTo(output.get(i))>0){
                    T temp = output.get(j);
                    output.set(j,output.get(i));
                    output.set(i,temp);
                }
            }
        }

        return output;
    }
}
