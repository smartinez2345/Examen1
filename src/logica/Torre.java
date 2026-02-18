package logica;

public class Torre extends Pieza {
    public Torre(int fila, int columna) {
        super(fila, columna);
    }

    @Override
    public int calcularCasillas() {
                return 14; 
    }
}