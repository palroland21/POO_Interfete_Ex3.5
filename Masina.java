public class Masina implements Cloneable {
    private String marca;
    private String culoare;

    public Masina(String marca, String culoare){
        this.marca = marca;
        this.culoare = culoare;
    }

    public void revopsireMasina(String culoare){
        this.culoare = culoare;
    }

    public String getMarca() {
        return marca;
    }

    public String getCuloare() {
        return culoare;
    }

    @Override
    public String toString() {
        return  marca + " cu culoarea " + culoare + ".";
    }
}
