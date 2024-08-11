import java.util.*;

class Staff {
    private String name;
    private int id;
    private float salary;
    private int experience;
    private List<Integer> id_list = new ArrayList();

    public Staff(String name, int id, int exp) {
        if(id_list.contains(id))
            System.out.println("ID already allocated to a staff");
        else {
            this.name = name;
            this.id = id;
            this.experience = exp;
            this.salary = exp*10000;
        }
    }

    void updateSalary(float salary, char sign) {
        if(sign == '+')
            this.salary+=salary;
        else
            this.salary-=salary;
    }

    void staffDetails() {
        System.out.println("Name: "+name+" ID: "+id+" salary: "+salary+" Experience: "+experience);
    }

    int getID() {
        return this.id;
    }

    float getSalary() {
        return this.salary;
    }
}