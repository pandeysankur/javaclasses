package test.ankur.test2;

public class Employee implements Comparable<Employee> {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        return this.getId().compareTo(o.getId());
    }
}
