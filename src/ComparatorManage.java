import java.util.Comparator;

public class ComparatorManage implements Comparator<Student> {

    public ComparatorManage() {
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1 != null && o2 != null) {
            if (o1.getAverageScore() > o2.getAverageScore()) {
                return -1;
            } else if (o1.getAverageScore() < o2.getAverageScore()){
                return 1;
            } else{
                return 0;
            }
        }
        return 0;
    }
}
