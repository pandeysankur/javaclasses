package test.ankur.test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Employee s =new Employee();
        s.setId(1);
        s.setName("abc");

        Employee b =new Employee();
        b.setId(3);
        b.setName("abc");

        Employee c =new Employee();
        c.setId(2);
        c.setName("abc");

        List<Employee> list=new ArrayList<>();
        list.add(s);
        list.add(b);
        list.add(c);

        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
