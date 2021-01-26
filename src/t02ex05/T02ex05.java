/*
 * Librería java.lang.Math
 */
package t02ex05;

/**
 * @author rodo
 */
public class T02ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Calculando la potencia
        float base = 2.0f; 
        float exponente = 3.0f;
        System.out.println(Math.pow(base,exponente)); //La función espera double pero le paso float y ok
    }
    
}
