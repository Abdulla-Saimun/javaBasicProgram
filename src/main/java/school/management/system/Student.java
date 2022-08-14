package school.management.system;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feespaid;
    private int feesTotal;

    public Student(int id, String name, int grade) {
        this.feespaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void payFees(int fees) {
        feespaid+=fees;
        School.updateTotalMoneyEarned(feespaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees() {
        return feesTotal - feespaid;
    }

    @Override
    public String toString() {
        return "Student's name: "+name+" total fees paid so far $"+feespaid;
    }


}
