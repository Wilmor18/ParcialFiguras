package modelo;

public class Cilindro extends FIgura {
    // atributos//
    private double radio;
    private double altura;
    // metodos//

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // constructor//
    public Cilindro(double radio) {
        this.radio = radio;
    }

    // metodos acceso//
    public void setRadio(double r) {
        this.radio = r;
    }

    public double getRadio() {
        return radio;
    }
    // metodo abstracto//

    public double CalcularArea() {
        return radio = Math.PI * Math.pow(radio, 2) * altura;
    }

}
