package ua.lviv.lgs.serealization;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Methods methods = new Methods();
        Employee employee = new Employee("Marian",1,20000.0);
        File file = new File("Employer.txt");
        File file2 = new File("Collection.txt");
        methods.serealize(file,employee);
        System.out.println(methods.deserealize(file));
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Ivan", 1,15000.0));
        list.add(new Employee("Marian", 2,5000.0));
        list.add(new Employee("Max", 3,25000.0));
        list.add(new Employee("Svitlana", 4,18000.0));
        list.add(new Employee("Ihor", 5,19000.0));
        methods.serealize(file2, (Serializable) list);
        System.out.println(methods.deserealize(file2));
    }
}
