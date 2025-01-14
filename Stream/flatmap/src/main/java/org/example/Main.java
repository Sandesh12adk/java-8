package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class employee{
    private String name;
    private int salary;

    public employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
public class Main {
    public static void main(String[] args) {
        List<employee> grade1= new ArrayList<employee>();
        grade1.add(new employee("sandesh",21));
        grade1.add(new employee("keshab",22));
        grade1.add( new employee("Ram",23));
        List<employee>  grade2= new ArrayList<employee>();
        grade2.add(new employee("hari",21));
        grade2.add(new employee("vari",22));
        grade2.add( new employee("sari",98));
        List<List<employee>> allgrade= Arrays.asList(grade1,grade2);
       List<String> namelist= allgrade.stream().flatMap(x->x.stream()).map(x->x.getName()).collect(Collectors.toList());
       System.out.println(namelist);
    }
}