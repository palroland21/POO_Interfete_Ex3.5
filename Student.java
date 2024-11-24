public class Student implements Cloneable {
    private String nume;
    private String prenume;
     Masina masina;

    public Student(String nume, String prenume, Masina masina) {
        this.nume = nume;
        this.prenume = prenume;
        this.masina = masina;
    }

    public Student(Student student){
        this.nume = student.nume;
        this.prenume = student.prenume;
        this.masina = new Masina(student.masina.getMarca(), student.masina.getCuloare());
    }

    @Override
    public String toString(){
        return "Studentul " + nume + " " + prenume + " are masina " + masina;
    }
}
