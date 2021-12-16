import java.util.Comparator;

public class ComparatorManage implements Comparator<Human> {

    public ComparatorManage() {
    }

    @Override
    public int compare(Human o1, Human o2) {
        if (o1 instanceof Student && o2 instanceof Student) {
            if (((Student)o1).getAverageScore() > ((Student)o2).getAverageScore()) {
                return -1;
            } else if (((Student)o1).getAverageScore() < ((Student)o2).getAverageScore()){
                return 1;
            } else{
                return 0;
            }
        }
        return 0;
    }
}
