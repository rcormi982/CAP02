package Capitulo2;
/*Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
convertir deberá estar almacenada en una variable. */
public class EJ05 {
    public static void main(String[] args) {
        int pesetas = 5000;
        double euros = (pesetas/166.386);
        System.out.printf("%d pesetas = %.2f €", pesetas, euros);
    }
}
