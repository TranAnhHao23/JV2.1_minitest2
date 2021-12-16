public class Human {
    private String name;
    private int age;

    static int id = 1;
    private int idHuman;

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        idHuman = id;
        id++;
    }

    public int getIdHuman() {
        return idHuman;
    }

    public void setId(int idHuman) {
        this.idHuman = idHuman;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ID : " + getIdHuman() + " - Human {" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
