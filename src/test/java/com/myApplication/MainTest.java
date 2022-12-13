package com.myApplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    //Test 단축키 ctrl+shift+F10
    @Test
    void test(){
        //Given
        String[] args = {"3","2","1"};

        //When&Then
        Main.main(args);

    }
}