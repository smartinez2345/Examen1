package presentacion;

import logica.*;

public class Principal {

    public Principal() {
        System.out.println("--- PRUEBA DE AJEDREZ ---");

        
        Pieza torre = new Torre(4, 5); 
        System.out.println("Torre en (4,5): " + torre.calcularCasillas() + " movimientos (Esperado: 14)");

        
        Pieza peonInicio = new Peon(2, 4);
        System.out.println("Peon en (2,4): " + peonInicio.calcularCasillas() + " movimientos (Esperado: 2)");
        
        Pieza peonNormal = new Peon(5, 4);
        System.out.println("Peon en (5,4): " + peonNormal.calcularCasillas() + " movimientos (Esperado: 1)");

        
        Pieza reyCentro = new Rey(4, 4);
        System.out.println("Rey en Centro (4,4): " + reyCentro.calcularCasillas() + " movimientos (Esperado: 8)");
        
        Pieza reyEsquina = new Rey(1, 1);
        System.out.println("Rey en Esquina (1,1): " + reyEsquina.calcularCasillas() + " movimientos (Esperado: 3)");
    }

    public static void main(String[] args) {
        new Principal();
    }
}
