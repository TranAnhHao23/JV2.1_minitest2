public class Student extends Human {
    private double averageScore;

    public Student() {
    }

    public Student(String name, int age, double averageScore) {
        super(name, age);
        this.averageScore = averageScore;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "ID : " + getIdHuman() +" - Student {" +
                "name ='" + super.getName() + '\'' +
                ", age =" + super.getAge() +
                ", average score =" + this.averageScore +
                '}';
    }
}


