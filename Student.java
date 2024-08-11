import java.util.*;

class Student {
    private String name;
    private int id;
    private int grade;
    private float totalFee;
    private float feePaid;
    private float balanceFee;

    List<Integer> id_list = new ArrayList<>();

    public Student(String name, int id, int grade) {

        if(id_list.contains(id))
            System.out.println("ID already allocated for another student!");
        else if(grade >= 1 && grade <=12){
            this.id = id;
            this.name = name;
            this.grade = grade;
            
            id_list.add(id);
            feePaid = 0.0f;
            totalFee = setFee(grade);
            balanceFee = totalFee;
        }
        else
            System.out.println("Enter the Correct Grade!");

    }

    static float setFee(int grade) {
        return grade*10000;
    }

    void updateFee(float fee) {
        feePaid += fee;
        balanceFee -= fee;
    }

    void upGrade(int grade) {
        this.grade = grade;
    }

    void studentDetails() {
        System.out.println("Name:"+name+", ID:"+id+", grade:"+grade+", Total fee:"+totalFee+", Fee paid:"+feePaid+", Balance fee:"+balanceFee);
    }

    int getID() {
        return this.id;
    }

    float getFee() {
        return this.totalFee;
    }
}