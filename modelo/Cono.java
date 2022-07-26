package modelo;

public class Cono extends FIgura {
    private double radio;
    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // metodo abstracto//

    public double HallarArea() {
        return radio = (Math.PI * Math.pow(radio, 2) * altura) / 3;
    }

}
