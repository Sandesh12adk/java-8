//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Normal way
        Dog obj1= new Dog();
        obj1.sound("Barking with normal way");

        //Using anynomous class
        Animal obj2= new Animal(){
            @Override
            public void sound(String s){
                System.out.println(s);
            }
        };
        obj2.sound("Barking with anynomous class ");
        //Using Lamda expression
        // Using Lambda expression
        Animal obj3 = (a) -> { System.out.println(a);}; // This can simply be written as
        // Animal obj4 = a ->  System.out.println(a);
        obj3.sound("Barking with Lambda expression");


    }
}
interface Animal{
    public abstract void sound(String s);
}
class Dog implements Animal{
    @Override
    public void sound(String s){
        System.out.println(s);
    }
}