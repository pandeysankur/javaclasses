package ayush_javaCode.CheckEncapsulation;

import Encapsulation.Student;

public class OuterStudent {

    //private
    public static void main(String[] args) {
        Student st = new Student();

        st.setId(01);
        st.setMarks(76);
        st.setName("Ayush");

        System.out.println(st);

    }
}
