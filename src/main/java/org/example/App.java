package org.example;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
//        System.out.println(multiplesOf5(input));
//        System.out.println(maxOfList(input) + " " + minOfList(input));
//        System.out.println(mergeSortedArrayDistinct(new int[]{4,2,7,1,3},new int[]{8,3,9,5,1}));
        System.out.println(nmaxElements(input, 4));
        System.out.println(nminElements(input, 4));

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
        return input
                .stream()
                .collect(Collectors.joining(",","[","]"));
    }

    public static List<Integer> multiplesOf5(List<Integer> input){
        return input
                .stream()
                .filter( n -> (n % 5) == 0)
                .collect(Collectors.toList());
    }

    public static int maxOfList(List<Integer> input){
        return input.stream().max(Comparator.naturalOrder()).get();
    }

    public static int minOfList(List<Integer> input){
        return input.stream().min(Comparator.naturalOrder()).get();
    }

    public static String mergeSortedArray(int[] a, int[] b){
        return Arrays.toString(IntStream
                .concat(Arrays.stream(a), Arrays.stream(b))
                .sorted()
                .toArray());
    }

    public static String mergeSortedArrayDistinct(int[] a, int[] b){
        return Arrays.toString(IntStream
                .concat(Arrays.stream(a), Arrays.stream(b))
                .sorted()
                .distinct()
                .toArray());
    }

    public static List<Integer> nmaxElements(List<Integer> input, int n){
        return input.stream().sorted(Comparator.reverseOrder()).limit(n).collect(Collectors.toList());
    }

    public static List<Integer> nminElements(List<Integer> input, int n){
        return input.stream().sorted(Comparator.naturalOrder()).limit(n).collect(Collectors.toList());
    }

}
