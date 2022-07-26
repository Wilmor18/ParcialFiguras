package modelo;

public class Circulo3D extends FIgura {
    // atributo//
    protected double radio;

    // constructor//
    public Circulo3D(double radio) {
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
        return radio = (4 / 3) * Math.PI * Math.pow(radio, 3);
    }
}
