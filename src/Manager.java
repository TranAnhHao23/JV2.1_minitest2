import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Manager implements Manage {
    ArrayList<Human> humanList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Manager() {
    }

    @Override
    public void display() {
        for (Human human : humanList) {
            System.out.println(human);
        }
    }

    public Human create() {
        System.out.println("Nhập học sinh hay người");
        System.out.println("1. Người");
        System.out.println("2. Học sinh");
        int choice = sc.nextInt();
        String name;
        int age;
        double averageScore;
        Human humanSample = null;
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Nhập tên học sinh: ");
                name = sc.nextLine();
                System.out.print("Nhập tuổi: ");
                age = sc.nextInt();
                humanSample = new Human(name, age);
                break;
            case 2:
                System.out.print("Nhập tên học sinh: ");
                name = sc.nextLine();
                System.out.print("Nhập tuổi: ");
                age = sc.nextInt();
                System.out.print("Nhập điểm trung bình: ");
                averageScore = sc.nextDouble();
                humanSample = new Student(name, age, averageScore);
                break;
        }
        return humanSample;
    }

    @Override
    public void add() {
        humanList.add(create());
    }

    @Override
    public void findHuman(int id) {
        boolean check = false;
        for (Human human : humanList) {
            if (human.getIdHuman() == id) {
                System.out.println(human);
            }
        }
        if (!check) {
            System.out.println("Student not on this list");
        }
    }

    @Override
    public void deleteHuman(int id) {
        for (int i = 0; i < humanList.size(); i++) {
            if (humanList.get(i).getIdHuman() == id) {
                humanList.remove(i);
            }
        }
        display();
    }

    @Override
    public void editHumanByID(int id) {
        boolean check = false;
        for (Human human : humanList) {
            if (human.getIdHuman() == id) {
                human = create();
                human.setId(id);
            }
        }
        if (!check) {
            System.out.println("Student not on this list");
        }
        display(); // Hoặc không cần tùy
    }

//    @Override
//    public void arrangeListByAverageScore() {
//        ComparatorManage comparatorManage = new ComparatorManage();
//        Arrays.sort(new ArrayList[]{humanList},comparatorManage);
//    }

    @Override
    public double sumOfScore() {
        double sum = 0;
        for (Human human: humanList) {
            if ( human instanceof Student){
                sum +=((Student) human).getAverageScore();
            }
        }
        return sum;
    }
}
