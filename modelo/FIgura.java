package modelo;

public abstract class FIgura {
    public abstract double HallarArea();

    public String toString() {
        return "Area = " + HallarArea();
    }
}
