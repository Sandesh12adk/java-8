package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Filtering the evennumbers for the list
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,76,8,910,11); //This will create the fixed sized Arryalist
        System.out.println(numbers);
        List<Integer> evennumbers=numbers.stream().filter((n)->n%2 ==0).collect(Collectors.toList()); // numbers.stream() add the list to the
        // stream.
        //filter(): Applies a condition (in this case, keeps even numbers).
        //collect(): Collects the result into a new list.
        System.out.println(evennumbers);
        //Filtering the words with string length more then 5 from the collection
        List<String> words= new ArrayList<String>(); // This way we can add as many as we want
        words.add("Apple");
        words.add("banana");
        words.add("papaya");
        words.add("RedApple");
        words.add("car");
        words.add("bike");
        words.add("elephant");
        List<String> longwords= words.stream().filter(word-> word.length()>5).collect(Collectors.toList());
        System.out.println(longwords);
        // we can print the each element ofthe list using traditiional method
        for(String str: longwords){
            System.out.println(str);
        }

        // Similarly we can filter form the objects like this list of people who can go to club.
        // List<obj> club= people.stream().filter(objvar-> objvar.getAge()>18).collects(Collector.asList());

    }
}