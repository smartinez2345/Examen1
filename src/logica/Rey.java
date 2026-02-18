package logica;

public class Rey extends Pieza {
    public Rey(int fila, int columna) {
        super(fila, columna);
    }

    @Override
    public int calcularCasillas() {
        int movimientos = 0;
        for (int f = this.fila - 1; f <= this.fila + 1; f++) {
            for (int c = this.columna - 1; c <= this.columna + 1; c++) {
                
                if (f >= 1 && f <= 8 && c >= 1 && c <= 8) {
       
                    if (!(f == this.fila && c == this.columna)) {
                        movimientos++;
                    }
                }
            }
        }
        return movimientos;
    }
}
