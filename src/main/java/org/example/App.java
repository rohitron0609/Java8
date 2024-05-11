package org.example;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> input = Arrays.asList(1,2,2,4,8,3,4,5,6,7,8,9,10);
        System.out.print(oddNumbers(input));
        System.out.println(evenNumbers(input));
        System.out.println(removeDupes(input));
    }

    public static List<Integer> oddNumbers(List<Integer> input){
        return input.stream().filter(n -> (n & 1) == 1).collect(Collectors.toList());
    }

    public static List<Integer> evenNumbers(List<Integer> input){
        return input.stream().filter(n -> (n & 1) == 0).collect(Collectors.toList());
    }

    public static List<Integer> removeDupes(List<Integer> input){
        return input.stream().distinct().collect(Collectors.toList());
    }
}
