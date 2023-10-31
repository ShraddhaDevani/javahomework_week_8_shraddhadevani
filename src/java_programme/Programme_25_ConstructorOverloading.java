package java_programme;

public class Programme_25_ConstructorOverloading {
    int id;
    String name;
    int age;

    //creating two arg constructor
    Programme_25_ConstructorOverloading(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Programme_25_ConstructorOverloading s1 = new Programme_25_ConstructorOverloading(111, "Karan", 0);
        Programme_25_ConstructorOverloading s2 = new Programme_25_ConstructorOverloading(222, "Aryan", 25);
        s1.display();
        s2.display();
    }

}
