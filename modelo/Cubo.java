package modelo;

public class Cubo extends FIgura {
    private double lado;

    // metodos//

    public Cubo(double lado) {
        lado = l;
    }

    public void setLado(double lado) {
        this.lado = l;
    }

    public double getLado() {
        return lado;
    }

    // metodo Abstracto//

    public double HallarArea() {
        return lado = Math.pow(lado, 3);
    }

}
