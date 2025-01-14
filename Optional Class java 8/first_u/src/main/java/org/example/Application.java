package org.example;

import org.example.configure.ProjectConfigure;
import org.example.model.Customer;
import org.example.model.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(ProjectConfigure.class);
        Product product= context.getBean(Product.class);
        Customer customer= context.getBean(Customer.class);
        String str= context.getBean("hello",String.class);
        String str1= context.getBean("hi",String.class);
        product.setName("Car");
        product.setPrice(4500000);
        customer.setName("Sandesh Adhikari");
        customer.setAddresss("Lahachok");
       System.out.println(product.getName());
       System.out.println(product.getPrice());
        System.out.println(customer.getName());
        System.out.println(customer.getAddresss());
        System.out.println(str);
        System.out.println(str1);
    }
}
