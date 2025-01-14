import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Optional<String> name1= Optional.empty();
        Optional<String> name2= Optional.ofNullable(null);
        Optional<String> name3= Optional.of("Sandesh");

        //get() method
        System.out.println("// get() Method");
        System.out.println(name3.get());

        //isPresent
        System.out.println("// isPresent() Method");
        System.out.println(name1.isPresent());
        System.out.println(name2.isPresent());
        System.out.println(name3.isPresent());

        //ifPresent
        System.out.println("// ifPresent() Method");
        name1.ifPresent(value -> System.out.println(value));
        name2.ifPresent(value -> System.out.println(value));
        name3.ifPresent(value -> System.out.println(value));
        name3.ifPresent((value) -> {
            String message= "Hi, this is the demonstation that you can run any statement inside " +
                    "the lamda block in ifPresent method ";
                    System.out.println(message);
                }
        );
        System.out.println("// orElse() Method");
        String result1= name1.orElse("Default value from name1");
        String result2= name2.orElse("Default value from name2");
        String result3= name3.orElse("Default value from name3");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println("// Map() Method");
        // Map and ispresent might look similar but the key difference is map return the Optional but isPresent return Void
        // And another keydifference is isPresent will execute the code if only OPtional is not empty but
        // Map will execute the code whether or not the value is present.
        Optional<String> newname= name3.map( value-> {
           return value.toUpperCase();
                }
                );
        System.out.println(newname.get());

        System.out.println("// filter() Method");
         // Differenct between map and fliter
        // map: Transform the value of the box and return  a new optional obj with transforemd value
        // filter: Check the condition for a box, return the box as it is if condition is passed return the
        // empty optional obj otherwise. if the box is already empty it does nothing.
        //Note: In both cases now optional obj is returned, they both make no changes to original optional obj
        Optional<String> newbox3= name3.filter(name->
                 name.startsWith("S")
                );
        System.out.println(newbox3.get());
        Optional<String> newbox1= name3.filter(name->
                name.startsWith("A")
        );
        System.out.println(newbox1);
    }
}