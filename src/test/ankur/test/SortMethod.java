package test.ankur.test;

import java.util.Comparator;

public class SortMethod implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        Double d = o1.getMarks() - o2.getMarks();
        return d.intValue();
    }
}
