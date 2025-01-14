package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*filter() Method:  // this is predicate becuase it takes argument nd reutnrs boolean
The filter() method is an intermediate operation. It creates a new stream containing only the elements that satisfy the given condition (predicate).
It doesn't modify the original stream; instead, it produces a new stream that includes only those elements that pass the filter condition.
Since filter() is an intermediate operation, it is lazy, meaning the actual filtering is not performed until a terminal operation (like collect()) is invoked.*/


/* collect() Method:   this is also predicate
The collect() method is a terminal operation that is used to transform the stream into a different form, often a collection like a List, Set, or Map.
It effectively consumes the stream and triggers the processing of the elements.
When you use collect(), it converts the stream (which is lazily evaluated) into a concrete collection, like a List. */

/*/  forEach()   // This is consumer becuase it takes value but doesont return anything
 method of the Stream class is used to iterate over each element of the stream and apply
        // some action on them. You can perform several types of actions inside the forEach() method, typically through
        // a lambda expression*/
/*  map() Method:
The map() method is an intermediate operation in the Java Stream API that transforms the elements of the stream by applying a function to each element.
 It takes a Function<T, R> as an argument, which maps each element of type T to a new element of type R. This method produces a new stream where each element is the result of applying the given function to the corresponding element of the original stream.

Nature: Since it is an intermediate operation, the map() method is lazy, meaning that no transformation happens until a terminal operation (like collect() or forEach()) is invoked.
Transformation: It is commonly used to perform transformations, such as changing the type of elements in the stream, applying a mathematical operation, or extracting a property from objects.*/
public class Main {
    public static void main(String[] args) {

        //     1. Filtering the evennumbers for the list
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,76,8,910,11); //This will create the fixed sized Arryalist
        System.out.println(numbers);
        List<Integer> evennumbers=numbers.stream().filter((n)->n%2 ==0).collect(Collectors.toList()); // numbers.stream() add the list to the
        // stream.NOte: streams are immutable

        System.out.println(evennumbers);
        //2. Filtering the words with string length more then 5 from the collection
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
            /* ********   forEach() ************/

        /* ************************ foreach *************************** */
        List<Integer> numlist= Arrays.asList(1,2,3,4,5,6);
        numlist.stream().forEach((num)->{ System.out.println(num);});
        // We can use it with filter() like this as we know filter creates the now stream.
        numlist.stream().filter(n-> n%2==0).forEach(n-> System.out.print(n+ " "));

        /****************** map() ******************/
        List<Integer> intlist= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        intlist.stream().map(n-> n*n).forEach(n-> System.out.print(n+ " "));   //Printing the square of the numbers in the list

        List<String> lowercase= Arrays.asList("sandesh", "keshab", "ram", "shyam");
        List<String> uppercase= new ArrayList<String>();    // Declearing the Array list.
       uppercase= lowercase.stream().map(name-> name.toUpperCase()).collect(Collectors.toList()); //converting the lower into upper
        System.out.println(uppercase);
         /**************** wmap with objects ***********/
         //Suppose we have the list of the objects of person class and now want to create the list of the name  we can do like this
      //  List<object> names= objlist.stream().map(obj-> obj.getname()).collect(Collectors.toList()):
        //NOte: filter(obj-> obj.salary> 2000) this will created the stream of the objects whose salary is greater then 20000. But
        // map(obj-> obj.value) this will transform the stream of the objects into stream of
        // the salary.

        List<Integer> list1= Arrays.asList(1,2);
        List<Integer> list2= Arrays.asList(3,4);
        List<Integer> list3= Arrays.asList(5,6);
        List<List<Integer>> finallsit= Arrays.asList(list1, list2, list3);
      //  List<Integer> finalresult=  finallsit.stream().map(x-> x.stream()).collect(Collectors.toList()); this will make the
        //compilation error so we use flatMap() concept okay.
       List<Integer> finalresult=  finallsit.stream().flatMap(x-> x.stream()).collect(Collectors.toList());
       System.out.println(finalresult);
    }
}