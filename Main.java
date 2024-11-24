
public class Main {
    public static void main(String[] argv) {
        Masina masina1 = new Masina("Audi", "Alb");
        Student student1 = new Student("Pop", "Popescu", masina1);

        Student student2 = student1;

        System.out.println("Original: " + student1 + "\n");

        student1.masina.revopsireMasina("Negru");

        System.out.println("Original: " + student1);
        System.out.println("Shallow copy: " + student2 + "\n");

        student1.masina.revopsireMasina("Alb");

        Student student3 = new Student(student1);

        student3.masina.revopsireMasina("Rosu");

        System.out.println("Original: " + student1);
        System.out.println("Deep copy: " + student3);

    }
}