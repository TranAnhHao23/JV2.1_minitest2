
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add new Person");
            System.out.println("2. Display all Person");
            System.out.println("3. Find Person via ID");
            System.out.println("4. Delete Person via ID");
            System.out.println("5. Edit Person via ID");
            System.out.println("6. Arrange list via averageScore");
            System.out.println("7. Sum of Score");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    manager.add();
                    break;
                case 2:
                    manager.display();
                    break;
                case 3:
                    System.out.println("Input ID: ");
                    int idFind = sc.nextInt();
                    manager.findHuman(idFind);
                    break;
                case 4:
                    System.out.println("Input ID: ");
                    int idDelete = sc.nextInt();
                    manager.deleteHuman(idDelete);
                    break;
                case 5:
                    System.out.println("Input ID: ");
                    int idEdit = sc.nextInt();
                    manager.editHumanByID(idEdit);
                    break;
                case 6:
                    System.out.println("Arrange list by Score: ");
                    manager.arrangeListByAverageScore();
                    break;
                case 7:
                    System.out.println("Sum of score = " + manager.sumOfScore());
                    break;
                default:
                    System.out.println("Wrong choice !!!");
                    break;

            }
        } while (choice != 0);


    }
}
