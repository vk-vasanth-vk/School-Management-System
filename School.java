import java.util.*;

class School {
    private String name;
    private int id;
    private float revenue;
    private float spent;
    private static List<Student> students = new ArrayList();
    private static List<Staff> staffs = new ArrayList();
    private int staff_id = 01;
    private int student_id = 1;

    public School(String name, int id) {
        this.name = name;
        this.id = id;
        revenue = 0.0f;
        spent = 0.0f;
    }

    void addStaff(String name, int exp) {
        staffs.add(new Staff(name,staff_id,exp));
        staff_id++;
    }

    void addStudent(String name, int grade) {
        students.add(new Student(name,student_id,grade));
        student_id++;
        revenue += students.get(students.size()-1).getFee();
    }

    void staffDetails() {
        for(Staff s:staffs)
            s.staffDetails();
    }

    void studentDetails() {
        for(Student s:students)
            s.studentDetails();
    }

    Staff getStaff(int id) {
        for(Staff s:staffs)
         if(s.getID() == id)
          return s;

        return null;
    }

    Student getStudent(int id) {
        for(Student s:students)
         if(s.getID() == id)
          return s;

        return null;
    }

    float getRevenue() {
        return this.revenue;
    }

    float getSpent() {
        return this.spent;
    }

    void paySalary() {
        for(Staff s:staffs) {
            revenue -= s.getSalary();
            spent += s.getSalary();
        }
    }

}