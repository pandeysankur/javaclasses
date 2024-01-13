package test.ankur.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(1);
        s.setName("abc");
        s.setMarks(10.00);
        Student b = new Student();
        b.setId(1);
        b.setName("abc");
        b.setMarks(10.00);
        Student c = new Student();
        c.setId(1);
        c.setName("abc");
        c.setMarks(10.00);
        List<Student> list = new ArrayList<>();
        list.add(s);
        list.add(b);
        list.add(c);
        list.forEach(System.out::println);
        Collections.sort(list, new SortMethod());
        list.stream().sorted(((o1, o2) -> {
            Double d = o1.getMarks() - o2.getMarks();
            return d.intValue();
        })).forEach(System.out::println);

    }
}
