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
        System.out.println("Human or Student");
        System.out.println("1. Human");
        System.out.println("2. Student");
        int choice = sc.nextInt();
        String name;
        int age;
        double averageScore;
        Human humanSample = null;
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Human name: ");
                name = sc.nextLine();
                System.out.print("Human age: ");
                age = sc.nextInt();
                humanSample = new Human(name, age);
                break;
            case 2:
                System.out.print("Student name: ");
                name = sc.nextLine();
                System.out.print("Student age: ");
                age = sc.nextInt();
                System.out.print("Average Score: ");
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
                check = true;
            }
        }
        if (!check) {
            System.out.println("Student not on this list");
        }
    }

    @Override
    public void deleteHuman(int id) {
        boolean check = false;
        for (int i = 0; i < humanList.size(); i++) {
            if (humanList.get(i).getIdHuman() == id) {
                humanList.remove(i);
                check = true;
            }
        }
        if (!check) {
            System.out.println("Student not on this list");
        }
        display();
    }

    @Override
    public void editHumanByID(int id) {
        boolean check = false;
        for (int i = 0; i < humanList.size(); i++) {
            if (humanList.get(i).getIdHuman() == id){
                humanList.set(i,create());
                humanList.get(i).setId(id);
                check = true;
                Human.id--;
                break;
            }
        }
        if (!check) {
            System.out.println("Student not on this list");
        }
        display(); // Hoặc không cần tùy
    }

    @Override
    public void arrangeListByAverageScore() {
        ComparatorManage comparatorManage = new ComparatorManage();
        Arrays.sort(humanList.toArray(),comparatorManage);
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
