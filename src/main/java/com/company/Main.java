package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static List<Integer> listOfUsers = Arrays.asList(5,98,19,76,54,25);
    static List<Integer> resultedList = new ArrayList<>();
    static List<String > string = Arrays.asList("Bob","Sam","Ted") ;
    List <String> resultedString = new ArrayList<>();


    public static void main(String[] args) {
        List<Integer> resultedList =   listOfUsers.stream()
        .filter((x)->x < 30)
                .collect(Collectors.toList());
        System.out.println("Appropriate age : ");
       resultedList.stream().forEach( System.out ::println);
        System.out.println("Sorted by names");
       List <String> resultedString = (List<String>) string.stream()
               .sorted()
               .collect(Collectors.toList());
        resultedString.stream().forEach( System.out ::println);




    }
}
