package org.example;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
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
//        System.out.print(oddNumbers(input));
//        System.out.println(evenNumbers(input));
//        System.out.println(removeDupes(input));
//        System.out.println(charFreq("Java Concept Of The Day"));
//        System.out.println(elementFreq(Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil")));
//        System.out.println(sortList(Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12)));
        System.out.println(joinStrings(Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn")));
    }

    public static List<Integer> oddNumbers(List<Integer> input){
        return input.stream()
                .filter(n -> (n & 1) == 1)
                .collect(Collectors.toList());
    }

    public static List<Integer> evenNumbers(List<Integer> input){
        return input.stream()
                .filter(n -> (n & 1) == 0)
                .collect(Collectors.toList());
    }

    public static List<Integer> removeDupes(List<Integer> input){
        return input.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static Map<Character, Long> charFreq(String input){
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }

    public static Map<String, Long> elementFreq(List<String> input){
        return input
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static List<Double> sortList(List<Double> input){
        return input
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static String joinStrings(List<String> input){
        return input.stream().collect(Collectors.joining(",","[","]"));
    }
}
