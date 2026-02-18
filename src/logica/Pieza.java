package logica;

public abstract class Pieza {
    protected int fila;
    protected int columna;

    public Pieza(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public abstract int calcularCasillas();
}
