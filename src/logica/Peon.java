package logica;

public class Peon extends Pieza {
    public Peon(int fila, int columna) {
        super(fila, columna);
    }

    @Override
    public int calcularCasillas() {
       
        if (this.fila == 2) {
            return 2; 
        } else if (this.fila < 8) {
            return 1; 
        }
        return 0; 
    }
}